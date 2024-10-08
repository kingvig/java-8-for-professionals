import java.util.Scanner;

public class Crypto {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int DECALAGE = 4;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Veuillez entrer une chaine de caracteres : ");
        String s = scanner.nextLine();

        // la chaine a coder
        String aCoder = "";
        // la chaine codee
        String chaineCodee = "";

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        //1- supprimer les elements superflu dans la chaine
        //2- fonction de chiffrement

        aCoder=s.toLowerCase();
        StringBuilder cleanedString = new StringBuilder();
        StringBuilder codeddString = new StringBuilder();

        for(int i = 0; i<aCoder.length(); i++){
            char c = aCoder.charAt(i);
            if(Character.isLetter(c) || c == ' '){
                cleanedString.append(c);
            }
        }
        aCoder= String.valueOf(cleanedString);


        for(int i = 0; i<aCoder.length(); i++){
            char c = aCoder.charAt(i);
            if(Character.isLetter(c)) {
                codeddString.append(ALPHABET.charAt((ALPHABET.indexOf(c) + DECALAGE)%26));
            }else {
                codeddString.append(' ');
            }
        }
        chaineCodee= String.valueOf(codeddString);


        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        System.out.format("La chaine initiale etait : '%s'\n", s);

        if (aCoder.isEmpty()) {
            System.out.println("La chaine a coder est vide.\n");
        } else {
            System.out.format("La chaine a coder est : '%s'\n", aCoder);
            System.out.format("La chaine codee est : '%s'\n", chaineCodee);
        }
    }
}