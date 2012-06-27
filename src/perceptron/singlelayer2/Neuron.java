package perceptron.singlelayer2;

public class Neuron {
	
	private double[] synapticWeights;
	private double[] inputs;
	private double error;

	public Neuron(double[] synapticWeights) {
		setSynapticWeights(synapticWeights);
	}

	public void setSynapticWeights(double[] synapticWeights) {
		this.synapticWeights = synapticWeights;
	}
	
	private void setInputs(double[] input) {
		this.inputs = input;
		
	}

	/**
	 * Perform a training step. It calls the <code>run</code> method, 
	 * compares the response with the desiredResponse param and sets
	 * the error of the operation. 
	 * 
	 * The current error should be retrieved with <code>getError()</code>.
	 * 
	 * @param input
	 * @param desiredResponse
	 * @return
	 */
	public Neuron train(double[] input, double desiredResponse) {
		setInputs(input);
		setError(desiredResponse = run());
		
		return this;
	}

	private void setError(double error) {
		this.error = error;		
	}

	/**
	 * @return the error of the last training step.
	 */
	public double getError() {
		return error;
	}
	
	public double run() {
		double sum = 0;
		for (int i = 0; i<inputs.length; i++) {
			sum += inputs[i] * synapticWeights[i];
		}
		
		return activate(sum);
	}

	private double activate(double reducedLocalField) {
		return reducedLocalField;
	}

}
