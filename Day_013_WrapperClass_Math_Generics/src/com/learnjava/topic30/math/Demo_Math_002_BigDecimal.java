package com.learnjava.topic30.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo_Math_002_BigDecimal {

	public static void main(String[] args) {
		double num10 =1.82f;
		double num11 = 1.28f;
		
		System.out.println(num10+num11);
		
		
		BigDecimal num21 = new BigDecimal(1.82);

		BigDecimal num22 = new BigDecimal(1.28);
		
		System.out.println(num21.add(num22).setScale(2, RoundingMode.DOWN));

	}

}
