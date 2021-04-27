
package lesson1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class Flysmart {



	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		String src,dest;
		Scanner obj=new Scanner(System.in);
		
		
		
		List<Flight> flights = new ArrayList();
		Set<String> srcStrings = new TreeSet<>();
		Set<String> destStrings = new TreeSet<>();
		
		
		flights.add(new Flight(200,"bangalore","singapore",10000,7));
		flights.add(new Flight(120,"bangalore","singapore",10000,6));
		flights.add(new Flight(101,"chennai","australia",50000,3));
		flights.add(new Flight(102,"singapore","chennai",40000,5));
		flights.add(new Flight(109,"singapore","chennai",40000,7));
		flights.add(new Flight(108,"singapore","rajastan",40000,7));
		Collections.sort(flights);
		
		for(Flight i:flights) {
			System.out.println(i);
			srcStrings.add(i.getSourcecity());
			destStrings.add(i.getDestcity());
			
		}
		System.out.println("available source city");
		System.out.println(srcStrings);
		
		System.out.println("avilable dest city");
		System.out.println(destStrings);
		
	
		
		System.out.println("enter source city");
		src = obj.nextLine();

		
		System.out.println("enter destination city");
		dest = obj.nextLine();

	
		
		flights.stream().filter(f->f.getSourcecity().equals(src) && f.getDestcity().equals(dest)).sorted((f1,f2)->f1.compareTo(f2)).forEach(System.out::println);
	
}
}
