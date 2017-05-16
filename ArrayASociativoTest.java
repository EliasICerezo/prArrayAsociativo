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
			System.out.println("Exception capturada test get 1");
		}
		
		aa=null;
	}
	
	@Test
	public void TestGet2(){
		ArrayAsociativo aa=new ArrayAsociativo(new String[]{"Nombre"}, new String[]{"Julia"});
		
		try{
			System.out.println(aa.get("Nombre"));
		}catch(Exception e){
			fail("No deberia lanzar excepcion");
		}
		
		aa=null;
		
	}
	
	@Test
	public void TestGet3(){
		ArrayAsociativo aa=new ArrayAsociativo(new String[]{"Nombre"}, new String[]{"Julia"});
		
		try{
			aa.get("Apellidos");
			fail("Deberia lanzar excepcion");
		}catch(Exception e){
			System.out.println("Excepcion capturada para test 3");
		}
		
		aa=null;
		
	}
	
	
	@Test
	public void TestPut1(){
		ArrayAsociativo aa=new ArrayAsociativo();	
		
		try{
			aa.put("Nombre", "Julia");
		}catch(Exception e){
			fail("no deberia lanzar excepcion put1");
		}
		aa=null;
	}
	
	@Test
	public void TestPut2(){
		ArrayAsociativo aa=new ArrayAsociativo(new String[]{"Nombre"}, new String[]{"Julia"});
		try{
			aa.put("Apellidos", "Arjona");
			System.out.println(aa.get("Apellidos"));
		}catch(Exception e){
			fail("no deberia lanzar excepcion put2");
		}
	}
	
	
	@Test
	public void TestPut3(){
		ArrayAsociativo aa=new ArrayAsociativo(new String[]{"Nombre"}, new String[]{"Julia"});
		try{
			aa.put("Nombre", "Arjona");
			System.out.println(aa.get("Nombre"));
		}catch(Exception e){
			fail("no deberia lanzar excepcion put2");
		}
	}
	
	@Test
	public void testGetOrElse1(){
		ArrayAsociativo aa=new ArrayAsociativo();
		
		System.out.println(aa.getOrElse("Nombre","pepe"));
		
		
		aa=null;
	}
	
	@Test
	public void testgetOrElse2(){
		ArrayAsociativo aa=new ArrayAsociativo(new String[]{"Nombre"}, new String[]{"Julia"});
		
		System.out.println(aa.getOrElse("Nombre", "Pepe"));
		
		aa=null;
	}
	
	@Test
	public void testgetOrElse3(){
		ArrayAsociativo aa=new ArrayAsociativo(new String[]{"Nombre"}, new String[]{"Julia"});
		
		
		System.out.println(aa.getOrElse("Apellidos", "Pepe"));
		
		aa=null;
	}
	
	
	@Test
	public void testContains1(){
		ArrayAsociativo aa=new ArrayAsociativo();
		
		assertFalse(aa.containsKey("aaaaa"));
		
		aa=null;
	}
	
	@Test
	public void testContains2(){
		ArrayAsociativo aa=new ArrayAsociativo(new String[]{"Nombre"}, new String[]{"Julia"});
		
		assertFalse(aa.containsKey("Apellidos"));
		
		aa=null;
	}
	
	@Test
	public void testContains3(){
		ArrayAsociativo aa=new ArrayAsociativo(new String[]{"Nombre"}, new String[]{"Julia"});
		
		assertTrue(aa.containsKey("Nombre"));
		
		aa=null;
	}
	
	
	
	
	
	
	
	
	
	
	
}
