package com.companyname.module.submodule.annotations;

/*Real time example 
 * By introducing the GST in India .All old methods used to calculate the tax are became waste . so made it as deprecated .
 */

class TaxCalculation {

	int price;

	@Deprecated
	public int caluacalteTax() {
		return price * 13;
	}
}


class VatTaxCalculation extends TaxCalculation {

	@Deprecated
	public int caluacalteVATTax() {
		return price * 15;
	}
}

class GSTTaxCalulations {

	int price;

	public int GSTTaxcalulation() {
		return price * 12;
	}
}

public class Demo_Annotations_2_Deprecated_Example2 {

	public static void main(String[] args) {
		VatTaxCalculation vatTaxObj = new VatTaxCalculation();			
		int vattax =vatTaxObj.caluacalteVATTax();
		System.out.println(vattax);
		
	}

}
