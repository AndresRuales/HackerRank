package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Test2 {
	public static void main(String[] args) {
		//Mini-Max Sum
		List<Integer> arr = new ArrayList<>();
		arr.add(793810624);
		arr.add(895642170);
		arr.add(685903712);
		arr.add(623789054);
		arr.add(468592370);
		
		long sumaMenor = 0;
		long sumaMayor = 0;
		
		
		//Se ordena de menor a mayor
		Collections.sort(arr);
		
		
		for(int i =0; i<arr.size()-1;i++) {
			sumaMenor=arr.get(i)+sumaMenor;
		}
		
		for(int i =arr.size()-1; i>=1;i--) {
			sumaMayor=arr.get(i)+sumaMayor;
		}
		
		
		System.out.println(arr);
		System.out.println(" ");
		System.out.println(sumaMenor+"  "+sumaMayor);
		

		
	}
	

}
