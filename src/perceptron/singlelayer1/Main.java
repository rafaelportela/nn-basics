package perceptron.singlelayer1;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("AND neuron");
		Neuron andNeuron = new Neuron( new double[] {1.0, 1f}, 2f);
		print( new double[] { 1f, 1f}, andNeuron );
		print( new double[] { 1f, 0f}, andNeuron );
		print( new double[] { 0f, 1f}, andNeuron );
		print( new double[] { 0f, 0f}, andNeuron );
		
		System.out.println("\nOR neuron");
		Neuron orNeuron = new Neuron( new double[] {1.0, 1f}, 1f);
		print( new double[] { 1f, 1f}, orNeuron );
		print( new double[] { 1f, 0f}, orNeuron );
		print( new double[] { 0f, 1f}, orNeuron );
		print( new double[] { 0f, 0f}, orNeuron );

	}

	public static void print(double[] input, Neuron neuron) {
		System.out.println(input[0] + ", " + input[1] + ": " + neuron.calculate(input));
	}
}
