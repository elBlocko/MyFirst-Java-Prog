package uebung9;

import java.util.Arrays;
import java.util.Comparator;

import javax.swing.JOptionPane;

public class Stringsort {

	public static void main(String[] args) {

		String eingabe0 = JOptionPane.showInputDialog("Txt eingbnäh");	
		String eingabe1 = JOptionPane.showInputDialog("Txt eingbnäh");	
		String eingabe2 = JOptionPane.showInputDialog("Txt eingbnäh");
		
		
		 String[] arr = {eingabe0,eingabe1,eingabe2}; Arrays.sort(arr);		 
		   Arrays.sort(arr, new Comparator<String>() {
		        public int compare(String first, String second) {
		            return first.toLowerCase().compareTo(second.toLowerCase());
		        }
		    });
		    System.out.println(Arrays.toString(arr)); 
				
	}

}
