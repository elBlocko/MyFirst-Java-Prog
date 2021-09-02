package uebung9;

import javax.swing.JOptionPane;

public class Vokalloescher {

	public static void main(String[] args) {
	
	       
	       
	       
        String eingabe = JOptionPane.showInputDialog("Geben Sie einen Satz ein:");      
        StringBuilder str = new StringBuilder(eingabe);
           for (int i =0; i< eingabe.length(); i++)   {
        	   str.append( "a" ).append( "" );           
        }
       
   
		JOptionPane.showMessageDialog(null, str);
	}

}
