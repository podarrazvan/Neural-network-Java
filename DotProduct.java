import java.lang.reflect.Array;
import java.util.Arrays;

public class DotProduct {

    public static double[] dot_product(double[][] first, double[] second){
        /*Facem un sir de marimea tipului de sir weights.
         Spre exemplu putem avea un sir 3d. In cazul acesta
         vom avea product de marime 3. Vom stoca in el 3 elemente
         dim cauza ca inmultim cele 3 siruri din al doilea sir
         cu primul sir. Din acest motiv trebuie sa fie de marime 3.
         */
        double[] product = new double[first.length];
        /*Fiecare sir din cele 3 trebuie inmultit odata,
        element cu element.
         */
        for(int i = 0; i<first.length; i++){
            // resetam produsul
            double produsul = 0;
            /*
            Daca inainte ne interesa cate siruri contine primul sir, acum ne
            intereseaza cate elemente contine al doilea sir. Toate sirurile trebuie
            sa contina un numar egal de elemente.
            Apoi inmultim element cu element si adunam rezultatele.
             */
            for(int y = 0; y < second.length; y++) {
                /*
                Produsului (produsul) ii adaugam rezultatul inmultirii a doua siruri.
                 */
                produsul += first[i][y] * second[y];
            }
            /*
            Cand y ajunge egal cu numarul de elemente dintr-un sir, adica am inmultit toate
            elementele dintre doua siruri intre ele, i++ si trece la sirur urmator pana le termina pe toate.
            Dar mai intai adauga rezultatul adunarii produselor (produsul) sirurlui facut la primul pas.
             */
            product[i] = produsul;
        }
        return product;
    }
    public static double[][] dot_product(double[][] first, double[][] second){ // first =  weights | second = input

        double[][] T_first= new double[first[0].length][first.length];
        for(int i = 0; i<second[0].length; i++){
            for(int y = 0; y<second.length; y++){
                T_first[i][y] = first[y][i];

            }
        }
      //  System.out.println(Arrays.deepToString(T_first));
      //  System.out.println(Arrays.deepToString(second));
        int r1 = T_first.length, c1 = T_first[0].length;
        int r2 = second.length, c2 = second[0].length;
    //  System.out.println(r1 + " "+ c1 + " " + c2);
        double[][] product = new double[c1][c1];
        for(int i = 0; i < c1; i++){ //max 4
            for(int j = 0; j < c1; j++){ //max 4
                for(int k = 0; k < r1; k++){ // max 4
//                    System.out.println( T_first[k][i]  +" "+ second[j][k]);
                    product[j][i] += T_first[k][i] * second[j][k];
                    //DA EROARE DACA MAI BAGI UN NEURON!

                }
//                System.out.println();
            }
        }

//      System.out.println(Arrays.deepToString(product));
        return product;
    }

    public static double dot_product(double[]first, double[] second){

        double produs = 0;
        for(int i = 0; i<first.length; i++){
           produs += first[i] * second[i];

        }
        return produs;
    }

}
