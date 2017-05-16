package prArrayAsociativo;

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
		
		
		
		
		
	
	
	
}
