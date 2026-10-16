public class palindrome {
      static boolean estPalindrome(String s){
            String t ="";
           StringBuilder b = new StringBuilder(s);
           t = b.reverse().toString();

            return s.equalsIgnoreCase(t);
            
        }

    public static void main(String[] args){
        System.out.println(estPalindrome("Engage le jeu que je le gagne"));

      
    }
}
