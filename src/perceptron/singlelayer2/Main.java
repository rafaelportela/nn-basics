package perceptron.singlelayer2;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Neuron neuron = new Neuron(new double[] {0, 0});
		
		printTrainStep(neuron, new double[] {1, 1}, 1);
		printTrainStep(neuron, new double[] {1, 0}, 0);
		printTrainStep(neuron, new double[] {0, 1}, 0);
		printTrainStep(neuron, new double[] {0, 0}, 0);
		
		printTrainStep(neuron, new double[] {1, 1}, 1);
		printTrainStep(neuron, new double[] {1, 0}, 0);
		printTrainStep(neuron, new double[] {0, 1}, 0);
		printTrainStep(neuron, new double[] {0, 0}, 0);

		printTrainStep(neuron, new double[] {1, 1}, 1);
		printTrainStep(neuron, new double[] {1, 0}, 0);
		printTrainStep(neuron, new double[] {0, 1}, 0);
		printTrainStep(neuron, new double[] {0, 0}, 0);

	}
	
	public static void printTrainStep(Neuron neuron, double[] inputExample, double desiredResponse) {
		System.out.println(neuron.train(inputExample, desiredResponse).getError());
	}

}
