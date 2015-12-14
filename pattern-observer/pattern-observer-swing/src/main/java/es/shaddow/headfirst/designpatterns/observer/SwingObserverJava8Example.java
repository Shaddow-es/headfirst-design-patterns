package es.shaddow.headfirst.designpatterns.observer;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverJava8Example {
	JFrame frame;

	public static void main(String[] args) {
		SwingObserverJava8Example example = new SwingObserverJava8Example();
		example.go();
	}

	public void go() {
		frame = new JFrame();

		JButton button = new JButton("Should I do it?");

		button.addActionListener(event -> System.out.println("Don´t do it, you might regret it!"));
		button.addActionListener(event -> System.out.println("Come on, do it!"));

		// Set frane properties
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
