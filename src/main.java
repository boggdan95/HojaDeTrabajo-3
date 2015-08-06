import java.io.FileNotFoundException;

/**
 * 
 */

/**
 * @author Boggdan Barrientos, Jonathan Aguirre, Jose Corona, Julio Dieguez 
 *
 */
public class main {
	
	
	
	public static void main(String[] args){
	
		sort sort = new sort();
		
		sort.generarArchivo();
		try {
			sort.lectura();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sort.mostrarVector();
		sort.QuickSort(sort.getVector(), 0, 999);
		System.out.println(" ");
		sort.mostrarVector();
	}

}
