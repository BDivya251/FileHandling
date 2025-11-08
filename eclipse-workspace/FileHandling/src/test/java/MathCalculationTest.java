
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MathCalculationTest {
	@Test
	public void testAdd() {
		MathOperations obj = new MathOperations();
		int i=10;
		int j=20;
		assertEquals(obj.add(i,j),30);
		System.out.println("Test is successful");
	}
	@Test
	public void testMultiplication() {
		MathOperations obj = new MathOperations();
		int i=10;
		int j=20;
		assertEquals(obj.mul(i,j),200);
//		String name=null;
//		String name1="james";
//		assertNotNull(name1);
//		assertEquals(name,"");
		System.out.println("Test is successful with multiplication");
	}
}
