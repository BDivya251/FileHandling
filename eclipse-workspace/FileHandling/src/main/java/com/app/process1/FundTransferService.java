package com.app.process1;
import java.util.*;
public class FundTransferService {
	HashMap<String,Double> map = new HashMap<>();

    private final AccountService accountService;

    public FundTransferService(AccountService accountService) {
        this.accountService = accountService;
    }

    public String transfer(String fromAccount, String toAccount, double amount) {

        // Validation 1: Amount check
        if (amount <= 0) {
            return "FAILURE: Invalid amount";
        }
        //validation 6:amount greater than 50000
        if(amount>50000.0) {
        	System.out.println(amount);
        	return "FAILURE: Amount exceeded";
        }
        // Validation 2: Same account check
        if (fromAccount.equals(toAccount)) {
            return "FAILURE: Source and destination cannot be same";
        }

        // Validation 3: Check source account balance
        double fromBalance = accountService.getBalance(fromAccount);
        if (fromBalance < amount) {
            return "FAILURE: Insufficient funds";
        }

        // Validation 4: Check if destination account exists
        if (!accountService.exists(toAccount)) {
            return "FAILURE: Destination account not found";
        }

        // Process the transfer
        boolean debitSuccess = accountService.debit(fromAccount, amount);
        boolean creditSuccess = accountService.credit(toAccount, amount);

        // Validation 5: Check transaction success
        if (debitSuccess && creditSuccess) {
            return "SUCCESS: Transfer completed";
        } else {
            return "FAILURE: Transaction error";
        }
    }

	
}