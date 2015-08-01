import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 */

/**
 * @author Boggdan Barrientos, Jonathan Aguirre, Jose Corona, Julio Dieguez 
 *
 */
public class sort {
	private int [] vector = new int [3000];
	
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
	 
	 public static int[] mergeSort(int [] list) {
        if (list.length <= 1) {
            return list;
        }
        
        // se divide el vector en 2 partes
        int[] first = new int[list.length / 2];
        int[] second = new int[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);
        
        // utiliza recursion para volver a dividir las partes
        mergeSort(first);
        mergeSort(second);
        
        // envia las partes al metodo merge
        merge(first, second, list);
        return list;
    }
    
    private static void merge(int[] first, int[] second, int [] result) {
        // une las dos partes ingresadas
        // utiliza 0 como el nuevo elemento de la primera parte
        int iFirst = 0;
        // utiliza 0 como el nuevo elemento de la segunda parte
        int iSecond = 0;
        
        // j representa una posicion 
        int j = 0;
        // mientras que los dos nuevos elementos no esten al final del vector se realiza el proceso
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                result[j] = first[iFirst];
                iFirst++;
                } else {
                result[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        // copia el resultado en un solo vector
        System.arraycopy(first, iFirst, result, j, first.length - iFirst);
        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
    }
               
    }
   }

	}


