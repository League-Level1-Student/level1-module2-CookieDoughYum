
public class PersonRunner {
public static void main(String[] args) {
   Person Joe=new Person();
   Joe.setName("Joe");
   Joe.setPower("run fast");
   System.out.println(Joe.toString());
   
   Person Mary=new Person();
   Mary.setName("Mary");
	Mary.setPower("fly");
	System.out.println(Mary.toString());
	
	Person Bob=new Person();
	Bob.setName("Bob");
	Bob.setPower("time travel");
	System.out.println(Bob.toString());
}
}

