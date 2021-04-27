package lesson1;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Comapre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Laptop> laps = new ArrayList();
		
		laps.add(new Laptop("mi",10000,14));
		laps.add(new Laptop("acer",20000,8));
		laps.add(new Laptop("apple",677888,12));
		
		Collections.sort(laps);
		for(Laptop l:laps) {
			System.out.println(l);
			
		}
	}
}

