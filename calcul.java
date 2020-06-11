import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class calcul {
    static double[] inputs = new double[4];
    static double[] biases = new double[3];
    private static double[][] weights;
    public static void main(String[] args) {

       double[][] x = { {1.0, 2.0, 3.0, 2.5},
                {2.0, 5.0, -1.0, 2.0 },
               {-1.5,2.7, 3.3, -0.8 }};


        int n_neurons, n_inputs;
        n_neurons = x[0].length;
        n_inputs = x.length;
        LayerDense ld = new LayerDense();
        weights = ld.LayerDense(n_inputs,n_neurons);
        double[] biases = new double[n_neurons];
        Arrays.fill(biases, 0);
        Forward f = new Forward();
        double[][] output = sum(f.Forward(x,n_neurons, x.length, weights), biases);
        System.out.println(Arrays.deepToString(output));
    }


    public static double[][] sum(double[][]first, double[]second){

        double[][]sum = new double[first.length][first[0].length];
   
        for (int i = 0; i < first.length; i++) {
            for(int y = 0; y<first[0].length ; y++) {
                sum[i][y] = first[i][y] + second[y];
            }
        }
        return sum;
    }


}

