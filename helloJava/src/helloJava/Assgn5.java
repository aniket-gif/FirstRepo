



//5. In the above program how to find count of user belonging to each city.




package helloJava;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class Users{
	
	private int id;
	private String name;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Users(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
}




public class Assgn5 {

	public static void func(Users u1,Users u2,Users u3) {
		
		Map<String,Long> m=Arrays.asList(u1,u2,u3).stream() 
         .collect(Collectors.groupingBy( 
                     Users::getCity, 
                     Collectors.counting()));
				System.out.println(m);
	}

	public static void main(String[] args) {

		Users u1=new Users(1,"aniket","banaras");
		Users u2=new Users(2,"amay","delhi");
		Users u3=new Users(3,"ashish","delhi");
		
		func(u1,u2,u3);
	}

}
