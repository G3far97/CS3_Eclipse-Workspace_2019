package Main;
public abstract class SortingAlgorithm {

	public static String printArray(int[] array) {

		String res = "";

		res += "[ ";

		for(int i = 0; i < array.length; i++) {

			res += array[i];

			if(i < array.length-1)
				res += ", ";

		}

		res += " ]";

		return res;

	}

	public static String sortIntro(String intro, int[] array) {

		String res = "";

		res += "----- The "+intro+" Sort Effect -----"+"\n"+" "+"\n";
		res += "Original Array: "+printArray(array)+"\n"+" "+"\n";

		return res;

	}

	public static String sortOutro(String func, int[] array) {

		String res = "";

		res += "The '"+func+"-sorted' Array: "+printArray(array)+"\n"+" "+"\n";
		res += "-------------------------"+"\n"+" "+"\n";

		return res;

	}

}
