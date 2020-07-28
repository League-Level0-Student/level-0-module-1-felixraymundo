package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String jose = "pinta bien";
		String arturo = "se bana";
		String enrique = "se peina";
		
		// String user = JOptionPane.showInputDialog("Ponge el nombre de la persona");
		String user = JOptionPane.showInputDialog("Escriba su nombre");
		// 2. Ask the user to enter a name. Store their answer in a variable.
		if( user.equals("jose")) {
		JOptionPane.showMessageDialog(null,"jose " + jose);
		}else if( user.equals("arturo")) {
		JOptionPane.showMessageDialog(null,"arturo " + arturo );
		}else if( user.equals("enrique")) {
		JOptionPane.showMessageDialog(null,"enrique " + enrique );
		}
		// 3. In a pop-up, tell the user what is remarkable about that person. 

	}
}

