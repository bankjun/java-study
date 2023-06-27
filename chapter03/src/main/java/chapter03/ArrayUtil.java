package chapter03;

public class ArrayUtil {

	public static double[] intToDouble(int[] a1) {
		double[] result = null;
		
		if(a1 == null) {
			return result;
		}
		
		result = new double[a1.length];
		for(int i =0; i < a1.length; i++) {
			result[i] = a1[i];
		}
		return result;
	}

	public static int[] doubleToInt(double[] d2) {
		int[] result = null;
		
		if (d2 == null) {
			return result;
		}
		result = new int[d2.length];
		for(int i = 0; i < d2.length; i++) {
			result[i] = (int)d2[i];
		}
		return result;
	}

	public static int[] concat(int[] is, int[] is2) {
		int[] result = null;
		
		if (is == null && is2 == null) {
			return result;
		}
		
		result = new int[(is.length + is2.length)];
		
		for(int i = 0; i < (is.length+is2.length); i++) {
			if(i < is.length) {
				result[i] = is[i];
			} 
			else{
				result[i] = is2[i - is2.length];
			}
		}
		return result;
	}
	
	
	
	

}
