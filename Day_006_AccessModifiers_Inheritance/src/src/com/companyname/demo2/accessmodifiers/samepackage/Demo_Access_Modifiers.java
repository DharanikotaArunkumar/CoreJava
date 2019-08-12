package src.com.companyname.demo2.accessmodifiers.samepackage;


//Access modifiers demo

class Person{
	
	public String name;
	private String ssn;
	protected String address;
	String phoneNumber;
	
	Person(){
		
	}
	
	Person(String personame,String personssn, String add, String pno){
		name=personame;
		ssn=personssn;
		address=add;
		phoneNumber=pno;		
		}
	
	void checkAccess(){
		System.out.println("NAME :- "+name);
		System.out.println("SSN  :- "+ssn);
		System.out.println("Addr :- "+address);
		System.out.println("Phono :-"+phoneNumber);
		
	}
}

public class Demo_Access_Modifiers {
	
	
	
	 public String publicTest="public"; 
	 private String privateTest="private";
	 protected String protectedTest="protected";
	 String defaultTest="default";

	public static void main(String[] args) {
		
		Person p= new Person("roy","12345","tx","123456");
		p.checkAccess();
		
		
		System.out.println(p.name);
		//System.out.println(p.ssn);
		System.out.println(p.phoneNumber);
		System.out.println(p.address);
		
		
		Person p1= new Person();
		
		/*p1.name="dave";
		p1.ssn ="123456";
		p1.phoneNumber="123";
		p1.address="asdsa";*/
		
	
	}

}
