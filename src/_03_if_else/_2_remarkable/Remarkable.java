package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String joeRemark = "Joe can play the guitar blindfolded.";
		String bobRemark = "Bob can solve a Rubik's cube in under a minute.";

		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog(null, "Enter a name:");

		// 3. In a pop-up, tell the user what is remarkable about that person.
		if (name != null) {
			if (name.equalsIgnoreCase("joe")) {
				JOptionPane.showMessageDialog(null, joeRemark);
			} else if (name.equalsIgnoreCase("bob")) {
				JOptionPane.showMessageDialog(null, bobRemark);
			} else {
				JOptionPane.showMessageDialog(null, "I don't know anything remarkable about " + name + ".");
			}
		}

	}}