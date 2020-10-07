
//2. Convert a string into a  map with keys as word of string and value as length of word(using java 8 concept).



package helloJava;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;


class Assgn2{
	public static Map<String,Integer> func(String str) {

		Map<String,Integer> m=Arrays.
				stream(str.split(" ")).
		collect(Collectors.toMap(Function.identity() ,String::length,(x,y) -> x ,LinkedHashMap::new));
// for maintaining insertion order toMap takes 4 parameters		
		//m.collect(Collectors.toCollection(TreeMap::new));
		
	//	ctors.toCollection(TreeMap::neMap<String,Integer> x=m.stream().collect(Collew));
		return m;
	}
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to count length");
			String str=	sc.nextLine();
			
			System.out.println(Assgn2.func(str));

			//collect(Collectors.toCollection(Map<String,Integer> x=m.stream().collect(Collew));
	}
}