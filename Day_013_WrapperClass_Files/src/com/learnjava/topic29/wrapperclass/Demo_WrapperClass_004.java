
class WrapperDemo {

	/*public void display(int num) {
		System.out.println(" I am from int primitive");
	}*/

	public void display(Integer num) {
		System.out.println(" I am from integer Object");
		
	}

}

public class WrapperClass_4 {

	public static void main(String[] args) {
		new WrapperDemo().display(10);

	}
}
