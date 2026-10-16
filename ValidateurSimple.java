public class ValidateurSimple {

    public static boolean estEmailValide(String email) {
        if (email == null) {
            return false;
        }
        
        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');
        
        if (atIndex <= 0 || dotIndex <= atIndex + 1 || dotIndex >= email.length() - 1) {
            return false;
        }
        
        String extension = email.substring(dotIndex + 1);
        if (extension.length() < 2 || extension.length() > 6) {
            return false;
        }
        
        return true;
    }

    public static boolean estReferenceValide(String ref) {
        if (ref == null) {
            return false;
        }
        
        if (!ref.startsWith("PRD-") || ref.length() != 7) {
            return false;
        }
        
        for (int i = 4; i < 7; i++) {
            char c = ref.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        System.out.println(estEmailValide("awa.diop@isep.edu.sn"));
        System.out.println(estEmailValide("moussa@gmail"));
        System.out.println(estEmailValide("@wave.com"));

        System.out.println(estReferenceValide("PRD-123"));
        System.out.println(estReferenceValide("PRD-45"));
        System.out.println(estReferenceValide("PRD-1234"));
        System.out.println(estReferenceValide("ABC-123"));
    }
}