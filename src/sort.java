import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */

/**
 * @author Boggdan Barrientos, Jonathan Aguirre, Jose Corona, Julio Dieguez 
 *
 */
public class sort {
	private int [3000] vector;
	
	private BufferedWriter escritor;

	public void generarArchivo(File archivo){
		try {
		        BufferedWriter out = new BufferedWriter(new FileWriter("numeros.txt"));
		            for (int i = 0; i < 3000; i++) {
		            	String j = Integer.toString((int)(Math.random()*(3000-0+1)+0));
		                out.write(j + " ");
		            }
		            out.close();
		        } catch (IOException e) {}
	}
	
	public void lectura(File archivo){
		
	}
	
	public void QuickSort(int A[], int izq, int der){
		  int pivote=A[izq]; // tomamos primer elemento como pivote
		  int i=izq; // i realiza la búsqueda de izquierda a derecha
		  int j=der; // j realiza la búsqueda de derecha a izquierda
		  int aux;
		 
		  while(i<j){            // mientras no se crucen las búsquedas
		     while(A[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
		     while(A[j]>pivote) j--;         // busca elemento menor que pivote
		     if (i<j) {                      // si no se han cruzado                      
		         aux= A[i];                  // los intercambia
		         A[i]=A[j];
		         A[j]=aux;
		     }
		   }
		   A[izq]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
		   A[j]=pivote; // los menores a su izquierda y los mayores a su derecha
		   if(izq<j-1){
		      QuickSort(A,izq,j-1); // ordenamos subarray izquierdo
		   }
		   if(j+1 <der){
		      QuickSort(A,j+1,der); // ordenamos subarray derecho
		}
	 }
	 
	 public void InsertionSort (){
	    //CSE 373, S. Tanimoto, 2001
	    for (int posicion=1; posicion< vector.length; posicion++){  
	       
	       int dato = vector[posicion];
	       int j;
	       for(j = posicion-1; j>=0 && dato< vector[j]; j--){
	           vector[j + 1]= vector[j];
	           vector[j + 1]= dato;
	 }
               
    }
   }

	}


