package perceptron.singlelayer2;

public class Main {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Neuron neuron = new Neuron(new double[] {2.5, 0.4});
		
		
		System.out.println(" *** training ***\n");
		
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
		
		printTrainStep(neuron, new double[] {1, 1}, 1);
		printTrainStep(neuron, new double[] {1, 0}, 0);
		printTrainStep(neuron, new double[] {0, 1}, 0);
		printTrainStep(neuron, new double[] {0, 0}, 0);

		printTrainStep(neuron, new double[] {1, 1}, 1);
		printTrainStep(neuron, new double[] {1, 0}, 0);
		printTrainStep(neuron, new double[] {0, 1}, 0);
		printTrainStep(neuron, new double[] {0, 0}, 0);
		
		System.out.println("\n\n *** running ***\n");
		
		printRun(neuron, new double[] {1, 1});
		printRun(neuron, new double[] {1, 0});
		printRun(neuron, new double[] {0, 1});
		printRun(neuron, new double[] {0, 0});
		
		printRun(neuron, new double[] {1, 1});
		printRun(neuron, new double[] {1, 0});
		printRun(neuron, new double[] {0, 1});
		printRun(neuron, new double[] {0, 0});
				
	}
	
	public static void printTrainStep(Neuron neuron, double[] inputExample, double desiredResponse) {
		System.out.println(neuron.train(inputExample, desiredResponse, 0.1).getError());
	}
	
	public static void printRun(Neuron neuron, double[] input) {
		neuron.setInputs(input);
		System.out.println(input[0] + ", " + input[1] + ": " + neuron.run());
	}


}
