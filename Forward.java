import java.util.Arrays;

public class Forward {
    public double[][] Forward (double[][] inputs, int n_neurons,int l_inputs, double[][]weights) {
        double[][] output = new double[l_inputs][n_neurons];
        DotProduct dp = new DotProduct();
        output = dp.dot_product(inputs, weights);
    return output;
    }
}
