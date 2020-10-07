package helloJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Assgn1 {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		
		char [] dup = str.toCharArray();
		
		Map<Character, Integer> map=new HashMap<>();
		for(Character x : dup) {
			if(map.containsKey(x)) {
			map.put(x,map.get(x)+1);
		}
			
		
			else {
				
			map.put(x,1);
			}
			}
	
		System.out.println(map);
	
		Map <Character,Long> m =str.chars().mapToObj(c ->(char) c)
		.collect(Collectors.groupingBy(c -> c,Collectors.counting()));	
	
	System.out.println(m);
	}

	
	
}
