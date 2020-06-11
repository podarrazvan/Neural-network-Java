import java.util.Random;

public class LayerDense {

    public double[][] LayerDense(int n_inputs, int n_neurons) {
        double[][] weights = new double[n_inputs][n_neurons];
        Random r = new Random();
        int check = 0;
        int positive_negative;
        for (int i = 0; i < n_inputs; i++) {
            for (int j = 0; j < n_neurons; j++) {
                check = r.nextInt(51);
                if (check%2==0){
                    positive_negative = 1;
                }else{
                    positive_negative = -1;
                }
                System.out.println(positive_negative + " - "+ check);
                weights[i][j] = 0.1 * r.nextInt(10)*positive_negative;
            }
        }
        return weights;
    }

    }

