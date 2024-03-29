package hr.fer.zemris.optjava.dz8;

public class DataNormalizer {

	private double lowerBound;
	private double upperBound;

	public DataNormalizer(double lowerBound, double upperBound, String[] data) {
		// find min and max value
		int[] lData = new int[data.length];
		int maxValue = 0;
		int minValue = 1000000;
		
		for (int i = 0; i < data.length; i++) {
			lData[i] = Integer.valueOf(data[i]).intValue();
			if(lData[i] > maxValue) {
				maxValue = lData[i];
			}
			if(lData[i] < minValue) {
				minValue = lData[i];
			}
		}

		// normalize to [-1, 1]
		double[] nData = new double[data.length];
		for (int i = 0; i < lData.length; i++) {
			nData[i] = -1 + (double)((lData[i] - minValue) / (maxValue - minValue));
		}
	}

	public double getLowerBound() {
		return this.lowerBound;
	}

	public void setLowerBound(double lowerBound) {
		this.lowerBound = lowerBound;
	}

	public double getUpperBound() {
		return this.upperBound;
	}

	public void setUpperBound(double upperBound) {
		this.upperBound = upperBound;
	}

}
