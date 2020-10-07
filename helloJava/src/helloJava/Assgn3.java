

//Convert a list of user into a map where userId as key and user as value.




package helloJava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class User{
	private int id;
	private String name;
	private double sal;
	
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public User(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
}
public class Assgn3 {

	public static void toMap(User u1,User u2,User u3) {
		Map<Integer,List<User>> m=Arrays.asList(u1,u2,u3)
				.stream()
				.collect(Collectors.groupingBy( 
                        User::getId,Collectors.toList())); 

		System.out.println(m);
	}
	public static void main(String[] args) {
		
		User u1=new User(1,"aniket",25000);
		User u2=new User(2,"amit",3000);
		User u3=new User(3,"akash",45000);
		
		toMap(u1,u2,u3);
	}

}
