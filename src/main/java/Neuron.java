import java.util.Random;

public class Neuron {

    double[] weights;
    double bias;
    Neuron nextNeurons[];

    public Neuron(int numOfInputs){
        weights = new double[numOfInputs];
        bias = 0;
    }

    public double caclulateOutput(double[] inputs){
        if(inputs.length != weights.length){
            throw new IllegalArgumentException("Number of input neurons is not correct.");
        }

        double output = 0;

        for(int i = 0; i < inputs.length; i++){
            output += inputs[i] * weights[i];
            System.out.println(inputs[i] + " * " + weights[i] + " += " + output);
        }

        output = NeuralNetworkMathHelper.sigmoid(output + bias);

        return output;
    }
}