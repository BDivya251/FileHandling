//import com.app.process1.FundTransferService1;
//import com.app.process1.TransactionApp;
//
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.mockito.*;
//import org.mockito.Mockito.*;
//public class FundTranTest {
//	@AfterAll
//	public static void cleanUp() {
//		System.out.println("setting up data and executing before the trasaction");
//	}
//	@BeforeAll
//	public static void initialize() {
//		System.out.println("Setting up date and executing after the trasaction");
//	}
//
//	@Test
//	public void testFund() {
//		FundTransferService1 objf = Mockito.mock(FundTransferService1.class);
//		when(objf.validateCustomer("roy")).thenReturn(false);
//		TransactionApp obj = new TransactionApp(objf);
//		boolean response=obj.processTransaction("roy","Kiran");
//		assertFalse(response);
//		verify(objf.validateCustomer("Roy"));
//	}
//	@Test
//	public void testTranFund() {
//		FundTransferService1 objf = Mockito.mock(FundTransferService1.class);
//		when(objf.transferFund(600000)).thenReturn("Success");
//		TransactionApp obj = new TransactionApp(objf);
//		boolean response=obj.processTransaction("roy","Kiran");
//		assertFalse(response);
//		verify(objf.validateCustomer("Roy"));
//	}
//}
