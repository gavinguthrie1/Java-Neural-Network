public class Neuron {
    double[] weights;
    double bias;

    public Neuron(int numOfInputs){
        weights = new double[numOfInputs];
        bias = 0;
    }
}