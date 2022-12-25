package org.tnsindia.application;


import org.tnsindia.framework.BankFactory;

import org.tnsindia.framework.CurrentAcc;
import org.tnsindia.framework.SavingAcc;

public class MMBankfactory extends BankFactory {
	
	@Override
	public SavingAcc getNewsavingacc(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingsAcc s=new MMSavingsAcc (accNo,accNm,accBal,isSalaried);
		return s;
	}

	@Override
	public CurrentAcc getNewcurrentacc(int accNo, String accNm, float accBal, float creditLimited) {
		MMCurrentAcc c=new MMCurrentAcc(accNo,accNm,accBal,creditLimited);
		return c;
	}

}
