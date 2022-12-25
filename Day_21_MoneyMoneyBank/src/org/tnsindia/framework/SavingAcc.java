package org.tnsindia.framework;
public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalarised;
	
	static final private float MINBAL=0.0f;
	

	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalarised) {
		super(accNo, accNm, accBal);
			
		this.isSalarised= isSalarised;
	}


	@Override
	public void withdraw(float accBal) {
		
		System.out.println("Account no.is:"+this.getAccNo()+" "+ "Account name is:"+this.getAccNm()+" "+
				"Balance is:"+this.getAccBal());
		
	}


	@Override
	public String toString() {
		return "SavingAcc [isSalarised=" + isSalarised + "]";
	}
	
	



}
