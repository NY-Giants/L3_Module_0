package IntroToArrayLists;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	Frame frame = new Frame();
	JLabel label1 = new JLabel();
	JPanel panel = new JPanel();
	JLabel label2 = new JLabel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	public static void main(String[]args){
		GuestBook book = new GuestBook();
		
	}
	
	GuestBook(){
	frame = new Frame();
	panel = new JPanel();
	button1 = new JButton("Add Name");
	button2 = new JButton("View Names");
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	frame.setSize(800, 500);
	frame.setVisible(true);
	

	
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
