package com.app.process1;

public class TransactionApp {
	public final FundTransferService1 f;
	public TransactionApp(FundTransferService1 f) {
		this.f=f;
	}
	public  boolean processTransaction(String a,String b) { 
		if(a.equals(b)) {
			return true;
		}
		return false;
		
	}
} 
