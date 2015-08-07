
import java.io.FileNotFoundException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Boggdan Barrientos, Jonathan Aguirre, Jose Corona, Julio Dieguez 
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        sort sort = new sort();
		
		sort.generarArchivo();
		try {
			sort.lectura();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("CADENA DE NUMEROS ORIGINAL\n");
		sort.mostrarVector();
		try {
			sort.QuickSort(sort.getVector(),0,2999);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("CADENA DE NUMEROS ORDENADA:\nCADENA DE NUMEROS ORDENADA:\nCADENA DE NUMEROS ORDENADA:\nCADENA DE NUMEROS ORDENADA:\nCADENA DE NUMEROS ORDENADA:\n");
		sort.mostrarVector();
	}
    }

