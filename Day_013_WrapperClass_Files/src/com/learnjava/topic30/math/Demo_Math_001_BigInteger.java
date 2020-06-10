package com.learnjava.topic30.math;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Demo_Math_001_BigInteger {

	public static void main(String[] args) {
		BigInteger num = new BigInteger("1000");
		BigInteger num1 = BigInteger.ONE;
		
		BigInteger num2 = num.add(num1); 
		
		int num4 = num1.intValue()+num2.intValue();

		
		
	}

}
