import static org.junit.jupiter.api.Assertions.*;
import  org.junit.jupiter.api.*;
public class MathOpsTest {
	@Test
	public void testAdd() {
		int i=2;
		int j=3;
		MathOperations  obj = new MathOperations();
		assertEquals(obj.add(i, j),40);
	}
	@Test
	public void testName() {
		String name="James";
		MathOperations obj = new MathOperations();
		assertTrue(obj.validateName(name));
	}
	
	@Test
	public void testMultiplication() {
		int i=2;
		int j=3;
		MathOperations obj  = new MathOperations();
		assertEquals(obj.mul(i, j),6);
	}
}
