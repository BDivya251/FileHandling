package com.app.process1;

public class FundTransferService1 implements FundTransInter {
	@Override
	public boolean validateCustomer(String name) {
	if(null!=name && name.equals("james")) {
		return true;
	}
	return false;
	}
	@Override
	public String transferFund(double amount)
	{
		if(amount>500000) {
			return "False";
		}
		return "True";
	}
}
