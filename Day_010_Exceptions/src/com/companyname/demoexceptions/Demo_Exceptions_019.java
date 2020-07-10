package com.companyname.demoexceptions;

// in the finally block return value is overridden .
// we can not have any statement if we have return in the finally block .
class Demo {

	public int diaplay() {

		int temp = 0;
		try {
			temp = 10;
			throw new NullPointerException();
			//return temp;
		} catch (IndexOutOfBoundsException exp) {
			System.out.println("null pointer");
			temp = 20;
			return temp;
		} catch (Exception exp) {
			temp = 30;
			return temp;
		} finally {
			temp = 40;
			return temp;
		}
//return temp;
	}

}

public class Demo_Exceptions_019 {

	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println("Value returned " + d.diaplay());

	}

}
