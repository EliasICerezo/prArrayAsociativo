package prArrayAsociativo;

import org.junit.Test;
import static org.junit.Assert.*;

//@RunWith(Parameterized.class)
public class ArrayASociativoTest {
//@Parameters
//public static Collection<Integer> valores(){
//	
//}
	
	@Test
	public void TestVacio(){
		ArrayAsociativo aa=new ArrayAsociativo();
		assertEquals(0,aa.size());
		aa=null;
		
	}
	
	
}
