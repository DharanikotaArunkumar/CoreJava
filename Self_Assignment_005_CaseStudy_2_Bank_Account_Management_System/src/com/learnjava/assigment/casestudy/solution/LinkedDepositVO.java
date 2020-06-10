package com.learnjava.assigment.casestudy.solution;

import java.time.LocalDate;

public class LinkedDepositVO {

	private String linkedDepositNo;
	private int depositAmount;
	private LocalDate depositStartDate;
	private LocalDate depositMaturityDate;
	private float maturityAmount;

	public String getLinkedDepositNo() {
		return linkedDepositNo;
	}

	public void setLinkedDepositNo(String linkedDepositNo) {
		this.linkedDepositNo = linkedDepositNo;
	}

	public int getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(int depositAmount) {
		this.depositAmount = depositAmount;
	}

	

	public float getMaturityAmount() {
		return maturityAmount;
	}

	public void setMaturityAmount(float maturityAmount) {
		this.maturityAmount = maturityAmount;
	}

	public LocalDate getDepositStartDate() {
		return depositStartDate;
	}

	public void setDepositStartDate(LocalDate depositStartDate) {
		this.depositStartDate = depositStartDate;
	}

	public LocalDate getDepositMaturityDate() {
		return depositMaturityDate;
	}

	public void setDepositMaturityDate(LocalDate depositMaturityDate) {
		this.depositMaturityDate = depositMaturityDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + depositAmount;
		result = prime * result + ((depositMaturityDate == null) ? 0 : depositMaturityDate.hashCode());
		result = prime * result + ((depositStartDate == null) ? 0 : depositStartDate.hashCode());
		result = prime * result + ((linkedDepositNo == null) ? 0 : linkedDepositNo.hashCode());
		result = prime * result + Float.floatToIntBits(maturityAmount);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkedDepositVO other = (LinkedDepositVO) obj;
		if (depositAmount != other.depositAmount)
			return false;
		if (depositMaturityDate == null) {
			if (other.depositMaturityDate != null)
				return false;
		} else if (!depositMaturityDate.equals(other.depositMaturityDate))
			return false;
		if (depositStartDate == null) {
			if (other.depositStartDate != null)
				return false;
		} else if (!depositStartDate.equals(other.depositStartDate))
			return false;
		if (linkedDepositNo == null) {
			if (other.linkedDepositNo != null)
				return false;
		} else if (!linkedDepositNo.equals(other.linkedDepositNo))
			return false;
		if (Float.floatToIntBits(maturityAmount) != Float.floatToIntBits(other.maturityAmount))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[linkedDepositNo=" + linkedDepositNo + ", depositAmount=" + depositAmount
				+ ", depositStartDate=" + depositStartDate + ", depositMaturityDate=" + depositMaturityDate
				+ ", maturityAmount=" + maturityAmount + "]";
	}

	
	

}