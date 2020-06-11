import java.util.Arrays;

public class Forward {
    public double[][] Forward (double[][] inputs, int n_neurons,int l_inputs, double[][]weights) {
        double[][] output = new double[l_inputs][n_neurons];
        DotProduct dp = new DotProduct();
//        System.out.println("Inputs");
//        System.out.println(Arrays.deepToString(inputs));
//      System.out.println("Weights");
//      System.out.println(Arrays.deepToString(weights));
        output = dp.dot_product(inputs, weights);
    return output;
    }
}
