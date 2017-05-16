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
	
	@Test
	public void TestConstructor(){
		ArrayAsociativo aa=new ArrayAsociativo(new String[]{"Nombre"}, new String[]{"Julia"});
		
		assertEquals(1,aa.size());
		
		aa=null;
	}
	
	
	@Test
	public void TestGet1(){
		ArrayAsociativo aa=new ArrayAsociativo();
		
		try {
			aa.get("aaa");
			fail("Se esperaba una excepcion");
			
		}catch(Exception e){
			System.out.println("Exception capturada");
		}
		
		aa=null;
	}
	
	@Test
	public void TestGet2(){
		ArrayAsociativo aa=new ArrayAsociativo(new String[]{"Nombre"}, new String[]{"Julia"});
		
		try{
			System.out.println(aa.get("Nombre"));
		}catch(Exception e){
			fail("No seberia lanzar excepcion");
		}
		
		aa=null;
		
	}
	
	
	
	
}
