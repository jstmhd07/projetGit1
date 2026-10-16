public class AnalyseMotDePasse { 
    public static void main(String[] args) { 
        String mdp = "Teranga2026!"; 
        int majuscules = 0, minuscules = 0, chiffres = 0, speciaux = 0; 
        for (int i = 0; i < mdp.length(); i++) { 
            char c = mdp.charAt(i); 
            if (Character.isUpperCase(c)) majuscules++; 
            else if (Character.isLowerCase(c)) minuscules++; 
            else if (Character.isDigit(c)) chiffres++; 
            else speciaux++; 
        } 
        boolean robuste = mdp.length() >= 10 && majuscules > 0 && minuscules > 0 
                          && chiffres > 0 && speciaux > 0; 
        System.out.printf("Maj=%d, min=%d, chiffres=%d, spéciaux=%d -> robuste : %b%n", 
                          majuscules, minuscules, chiffres, speciaux, robuste); 
    } 
} 