package prArrayAsociativo;

import java.util.NoSuchElementException;

public class ArrayAsociativo {

	//Clases internas
		private class Nodo{
			private String clave;
			private String valor;
			private Nodo sig; //siguiente nodo
			
			public Nodo(String c, String v, Nodo s){
				clave = c;
				valor = v;
				sig = s;
			}
		}
		
		//Variables de instancia
		private Nodo primero;
		private int nele;
		
		
		//Constructores
		public ArrayAsociativo(){
			primero = null;
			nele=0;
		}
		
		public ArrayAsociativo(String[] claves, String[] valores){
			this();
			if (claves.length > 0){
				primero = new Nodo(claves[0], valores[0],null);
				nele++;
				for (int i = 1; i< claves.length; i++){
					Nodo nuevo = new Nodo(claves[i], valores[i],primero);
					primero = nuevo;
					nele++;
				}
			}
		}
		
		public int size(){
			return nele;
		}
		
		public String get(String clave){
			Nodo n=primero;
			
			boolean f=false;
			while(n!=null && !f){
				if(n.clave.equals(clave)){
					f=true;
				}else{
					n=n.sig;
				}
				
			}
			
			if(!f){
				throw new NoSuchElementException("El elemento no se encuentra");
			}
			return n.valor;
			
		}
		
		public void put(String clave, String valor){
			Nodo n=primero; 
			boolean f=false;
			
			while(n!=null && !f){
				if(n.clave.equals(clave)){
					f=true;
				}else{
					n=n.sig;
				}
				
			}
			
			if(!f){
				Nodo nuevo=new Nodo(clave,valor,primero);
				primero=nuevo;
				nele++;
			}else{
				n.valor=valor;
			}
			
			
		}
		
		
		public String getOrElse(String clave, String pordefecto){
			Nodo n=primero;
			String res=pordefecto;
			boolean f=false;
			while(n!=null && !f){
				if(n.clave.equals(clave)){
					f=true;
				}else{
					n=n.sig;
				}
				
			}
			
			if(f){
				res=n.valor;
			}
			return res;
			
			
			
		}
		
		public boolean containsKey(String clave){
			boolean f=false;
			Nodo n=primero;
			while(n!=null && !f){
				if(n.clave.equals(clave)){
					f=true;
				}else{
					n=n.sig;
				}
				
			}
			
			return f;
		}
		
			
}
		
		
		
	
	
	

