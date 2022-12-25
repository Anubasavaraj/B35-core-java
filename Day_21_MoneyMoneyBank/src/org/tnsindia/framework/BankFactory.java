package org.tnsindia.framework;

public abstract class BankFactory {

	abstract public SavingAcc getNewsavingacc(int accNo,String accNm,float accBal,boolean isSalarised);
	
	abstract public CurrentAcc getNewcurrentacc(int accNo,String accNm,float accBal,float creditLimit);
}

