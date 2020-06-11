import java.lang.reflect.Array;
import java.util.Arrays;

public class DotProduct {

    public static double[] dot_product(double[][] first, double[] second){
    
        double[] product = new double[first.length];
        
        for(int i = 0; i<first.length; i++){
       
            double produsul = 0;
            
            for(int y = 0; y < second.length; y++) {
            
                produsul += first[i][y] * second[y];
            }
         
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
        int r1 = T_first.length, c1 = T_first[0].length;
        int r2 = second.length, c2 = second[0].length;
    
        double[][] product = new double[c1][c1];
        for(int i = 0; i < c1; i++){ 
            for(int j = 0; j < c1; j++){ 
                for(int k = 0; k < r1; k++){

                    product[j][i] += T_first[k][i] * second[j][k];


                }

            }
        }

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
