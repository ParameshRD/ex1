package lesson1;

import java.util.Arrays;

public class MinMaxArray<T> implements Minmax<T>{
	private T vals[];
	
	
	
	public MinMaxArray(T[] vals) {
		super();
		this.vals = vals;
	}

	//public MinMaxArray(T vals[]) {
		//this.vals = vals;
	//}
	

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Integer intarray[] = {1,5,3,4};
		Minmax<Integer> obj1 = new MinMaxArray<>(intarray);
		System.out.println(obj1.min());
		System.out.println(obj1.max());
		
		

	}

	@Override
	public T min() {
		// TODO Auto-generated method stub
		Arrays.sort(vals);
		return vals[0];
		
		
	}

	@Override
	public T max() {
		// TODO Auto-generated method stub
		Arrays.sort(vals);
		return vals[vals.length-1];
	}

}
