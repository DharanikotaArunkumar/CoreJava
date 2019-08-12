import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Demo_BigInteger {

	public static void main(String[] args) {
		BigInteger num = new BigInteger("1000");
		BigInteger num1 = BigInteger.ONE;
		
		BigInteger num2 = num.add(num1); 
		
		int num4 = num1.intValue()+num2.intValue();

		
		double num10 =1.82f;
		double num11 = 1.28f;
		
		System.out.println(num10+num11);
		
		
		BigDecimal num21 = new BigDecimal(1.82);

		BigDecimal num22 = new BigDecimal(1.28);
		
		System.out.println(num21.add(num22).setScale(2, RoundingMode.DOWN));
	}

}
