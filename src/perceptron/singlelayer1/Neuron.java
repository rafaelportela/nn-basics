package perceptron.singlelayer1;

public class Neuron {

	private double[] weights;
	private double bias;
	
	public Neuron(double[] weights, double bias) {
		this.weights = weights;
		this.bias = bias;
	}
	
	public double calculate(double[] inputs) {
		return limiter( - bias + weights[0]*inputs[0] + weights[1]*inputs[1]); 
	}
	
	private double limiter(double inducedLocalField) {
		if (inducedLocalField < 0)
			return 0;
		else
			return 1;
	}
}
