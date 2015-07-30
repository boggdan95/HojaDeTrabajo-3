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
	
	public void generarArchivo(File archivo){
		String numeros = "numeros.txt";
		File fichero = new File (numeros);
		
		if (fichero.exists()){
			try {
				BufferedWriter escritor = new BufferedWriter(new FileWriter(numeros));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		for (int i = 0; i < 3000; i++){
			int num = 0;
			num = Math.subtractExact(0, 3000);
			escritor.write(" "+num+" ");
			
		}	
		
		}
	}

}
