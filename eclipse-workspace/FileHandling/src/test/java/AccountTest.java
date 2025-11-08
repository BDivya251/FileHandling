import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.util.*;
import com.app.process1.AccountService;
import com.app.process1.FundTransferService;

public class AccountTest {
	@Test
	public void testAmount() {
		FundTransferService fs = new FundTransferService(null);
		String a=fs.transfer("ab", "cd", 0);
		assertEquals(a,"FAILURE: Invalid amount");
	}
	
	@Test
	public void amountExce() {
		FundTransferService fs = new FundTransferService(null);
		String a=fs.transfer("ab", "cd", 25000001.0);
		assertEquals(a,"FAILURE: Amount exceeded");
	}
	@Test
	public void testAccount() {
		FundTransferService fs = new FundTransferService(null);
		String a=fs.transfer("ab","ab", 10);
		assertEquals(a,"FAILURE: Source and destination cannot be same");
	}
	 @Test
	    public void testInsufficientFunds() {

	        // Create a dummy AccountService implementation
	        AccountService dummyService = new AccountService() {

	            HashMap<String, Double> accounts = new HashMap<>();

	            {
	                accounts.put("A1", 100.0);   // Source account balance < 500
	                accounts.put("A2", 1000.0);  // Destination exists
	            }

	            @Override
	            public boolean exists(String acc) {
	                return accounts.containsKey(acc);
	            }

	            @Override
	            public double getBalance(String acc) {
	                return accounts.getOrDefault(acc, 0.0);
	            }

	            @Override
	            public boolean debit(String acc, double amount) {
	                if (accounts.get(acc) >= amount) {
	                    accounts.put(acc, accounts.get(acc) - amount);
	                    return true;
	                }
	                return false;
	            }

	            @Override
	            public boolean credit(String acc, double amount) {
	                accounts.put(acc, accounts.getOrDefault(acc, 0.0) + amount);
	                return true;
	            }
	        };

	        // Pass dummy service to FundTransferService
	        FundTransferService service = new FundTransferService(dummyService);

	        // WHEN
	        String result = service.transfer("A1", "A2", 500);

	        // THEN
	        assertEquals("FAILURE: Insufficient funds", result);
//	        validation 4
//	        String res = service.transfer("A1", "c2",1000);
//	        assertEquals("FAILURE: Destination account not found",res);
	        
//	        validation 5
//	        String a=service.transfer("A1", "A2", 10);
//	        String b=service.transfer("A2", "A1", 10);
//	        assertEquals("SUCCESS: Transfer completed",b);
	    }
	 @Test
	 public void testInsufficientFunds1() {

	     // Dummy AccountService implementation
	     AccountService dummyService = new AccountService() {

	         HashMap<String, Double> accounts = new HashMap<>();

	         {
	             accounts.put("A1", 5000.0);   // Source has enough balance
	             accounts.put("A2", 1000.0);
	         }

	         @Override
	         public boolean exists(String acc) {
	             return accounts.containsKey(acc);
	         }

	         @Override
	         public double getBalance(String acc) {
	             return accounts.getOrDefault(acc, 0.0);
	         }

	         @Override
	         public boolean debit(String acc, double amount) {
	             if (accounts.get(acc) >= amount) {
	                 accounts.put(acc, accounts.get(acc) - amount);
	                 return true;
	             }
	             return false;
	         }

	         @Override
	         public boolean credit(String acc, double amount) {
	             accounts.put(acc, accounts.getOrDefault(acc, 0.0) + amount);
	             return true;
	         }
	     };

	     FundTransferService service = new FundTransferService(dummyService);

	     // Validation 4 test: destination DOES NOT exist
	     String result = service.transfer("A1", "C2", 1000);

	     assertEquals("FAILURE: Destination account not found", result);
	 }

	 @Test
	    public void testInsufficientFunds2() {

	        // Create a dummy AccountService implementation
	        AccountService dummyService = new AccountService() {

	            HashMap<String, Double> accounts = new HashMap<>();

	            {
	                accounts.put("A1", 100.0);   // Source account balance < 500
	                accounts.put("A2", 1000.0);  // Destination exists
	            }

	            @Override
	            public boolean exists(String acc) {
	                return accounts.containsKey(acc);
	            }

	            @Override
	            public double getBalance(String acc) {
	                return accounts.getOrDefault(acc, 0.0);
	            }

	            @Override
	            public boolean debit(String acc, double amount) {
	                if (accounts.get(acc) >= amount) {
	                    accounts.put(acc, accounts.get(acc) - amount);
	                    return true;
	                }
	                return false;
	            }

	            @Override
	            public boolean credit(String acc, double amount) {
	                accounts.put(acc, accounts.getOrDefault(acc, 0.0) + amount);
	                return true;
	            }
	        };

	        // Pass dummy service to FundTransferService
	        FundTransferService service = new FundTransferService(dummyService);

	        // WHEN
	        String result = service.transfer("A1", "A2", 500);

	        // THEN
//	        assertEquals("FAILURE: Insufficient funds", result);
//	        validation 4
	        String res = service.transfer("A1", "c2",1000);
//	        assertEquals("FAILURE: Destination account not found",res);
	        
//	        validation 5
	        String a=service.transfer("A1", "A2", 10);
	        String b=service.transfer("A2", "A1", 10);
	        assertEquals("SUCCESS: Transfer completed",b);
	    }
}



