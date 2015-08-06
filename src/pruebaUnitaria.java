import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Boggdan Barrientos, Jonathan Aguirre, Jose Corona, Julio Dieguez 
 *
 */
public class pruebaUnitaria {

	@Test
	public void test() {
		fail("Not yet implemented");
		
		sort sort = new sort();
		
		sort.generarArchivo();
		try {
			sort.lectura();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sort.mostrarVector();
		sort.QuickSort(sort.getVector(), 0, 99);
		System.out.println(" ");
		sort.mostrarVector();
		
	}

}
