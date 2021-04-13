package use.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KBInput{
	static private BufferedReader reader = null;

	public static String readString(){
		if(reader == null)
			reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			return reader.readLine();
		}
		catch(IOException e){
			return null;
		}
	}

	public static String readString(String prompt){
		System.out.print(prompt);
		return readString();
	}

	public static String[] readStringArray(){
		String s = readString();
		StringTokenizer st = new StringTokenizer(s);
		String[] array = new String[st.countTokens()];
		for(int i = 0; st.hasMoreElements(); i++)
			array[i] = st.nextToken();
		return array;
	}
	public static String[] readStringArray(String prompt){
		System.out.print(prompt);
		return readStringArray();
	}

	public static int readInt(){
		return Integer.parseInt(readString());
	}

	public static int readInt(String prompt){
		return Integer.parseInt(readString(prompt));
	}

	public static int[] readIntArray(){
		String[] buf = readStringArray();
		int[] array = new int[buf.length];
		for(int i=0; i<array.length; i++)
			array[i]=Integer.parseInt(buf[i]);
		return array;
	}

	public static int[] readIntArray(String prompt){
		System.out.print(prompt);
		return readIntArray();
	}

	public static double readDouble(){
		return Double.parseDouble(readString());
	}

	public static double readDouble(String prompt){
		return Double.parseDouble(readString(prompt));
	}

	public static double[] readDoubleArray(){
		String[] buf = readStringArray();
		double[] array = new double[buf.length];
		for(int i=0; i<array.length; i++)
			array[i]=Double.parseDouble(buf[i]);
		return array;
	}

	public static double[] readDoubleArray(String prompt){
		System.out.print(prompt);
		return readDoubleArray();
	}
}