import java.util.Arrays;

class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        Arrays.sort(tab1);
        int[] feqArray = new int[taille];
        Arrays.fill(feqArray,1);

        for(int i = 1; i<taille; i++){
            if(tab1[i]==tab1[i-1]){
                feqArray[i] =feqArray[i-1] +1;
                feqArray[i - 1] = 0;
            }
        }
        int mostFrequent = tab1[0];
        int maxFrequency = feqArray[0];
        for (int i = 1; i < taille; i++) {
            if (feqArray[i] > maxFrequency) {
                maxFrequency = feqArray[i];
                mostFrequent = tab1[i];
            }
        }
           System.out.println("Le nombre le plus frequent dans le tableau est le :");
        System.out.println(mostFrequent + " ("+maxFrequency+" x)");

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}
