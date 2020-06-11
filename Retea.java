import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Retea {
    static double[] inputs = new double[4];
    static double[][] weights = new double[3][4];
    static double[] biases = new double[3];

    public static void main(String[] args) {
        // Varianta in care adaugi tu datele
//        Scanner inp = new Scanner(System.in);
//        int x = 0;
//        while (x < 4){
//            System.out.println("Inputs:");
//            double val = inp.nextDouble();
//            inputs[x] = val;
//            x ++;
//            System.out.println(Arrays.toString(inputs));
//        }
//        x = 0;
//        int y = 0;
//        while (x < 4 && y < 3){
//            System.out.println("Weights: ");
//            double val = inp.nextDouble();
//            weights[y][x] = val;
//            if(x != 3){
//                x++;
//            }
//            else{
//                x = 0;
//                y ++;
//            }
//            System.out.println(Arrays.deepToString(weights));
//        }
//        x = 0;
//        while (x < 3){
//            System.out.println("Baises:");
//            double val = inp.nextDouble();
//            biases[x] = val;
//            x ++;
//            System.out.println(Arrays.toString(biases));
//        }
//        Datele adaugate automat
        double[] inputs = { 1.0, 2.0, 3.0, 2.5 };

        double[][] weights = {
                { 0.2, 0.8, -0.5, 1 },
                { 0.5, -0.91, 0.26, -0.5 },
                { -0.26, -0.27, 0.17, 0.87}};

        double[] biases = { 2, 3, 0.5 };
        System.out.println("rezultatul bun \n[4.8, 1.21, 2.385]\n rezultatul tau:");
        System.out.println(Arrays.toString(sum(dot_product(weights,inputs),biases)));

    }
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
    public static double[] sum(double[]first, double[]second){
        int max = first.length;
        double[]sum = new double[max];
        /*
        Fiecarui element obtinut la dot_product (product) ii adaugam
        un element din sirul baiases.
         */
        for (int i = 0; i < max; i++) {
            sum[i] = first[i] + second[i];
        }
        return sum;
    }

}


// rezultatul bun [4.8, 1.21, 2.385]