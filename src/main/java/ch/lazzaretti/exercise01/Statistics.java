package ch.lazzaretti.exercise01;

import java.util.Random;

public class Statistics {
	public static void main(String[] args) {
		double[] series = randomSeries(10000);
		System.out.println("Minimum / maximum: "+getMinimum(series)+" / "+getMaximum(series));
		System.out.println("Arithmetic average: "+getAverage(series));
		System.out.println("Variance: "+getVariance(series));
		System.out.println("Standard deviation: "+getStandardDeviation(series));
	}
	
	static double[] randomSeries(int amount) {
		double[] series = new double[amount];
		Random random = new Random(4711);
		for (int index = 0; index < amount; index++) {
			series[index] = random.nextDouble();
		}
		return series;
	}
	
	static double getMinimum(double[] series){
		double min = series[0];
		for(double num:series){
			if(min>num)
				min = num;
		}
		return min;
	}
	
	static double getMaximum(double[] series){
		double max = series[0];
		for(double num:series){
			if(max<num)
				max = num;
		}
		return max;
	}
	
	static double getAverage(double[] series){
		return getSum(series) / series.length;
	}
	
	static double getSum(double[] series){
		double sum = 0;
		for(double num:series){
			sum += num;
		}
		return sum;
	}
	
	static double getVariance(double[] series){
		double avg = getAverage(series);
		double vari=0;
		
		for(double num:series){
			double t = num - avg;
			vari += t*t;
		}
		
		vari = vari / series.length;
		return vari;		
	}
	
	static double getStandardDeviation(double[] series){
		return Math.sqrt(getVariance(series));
	}
	
}
