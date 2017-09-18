package IntroToArrayLists;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.ArrayList;


public class GuestBook implements ActionListener{
	Frame frame = new Frame();
	JLabel label1 = new JLabel();
	JPanel panel = new JPanel();
	JLabel label2 = new JLabel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	String newName = new String();
	ArrayList<String> NamesList = new ArrayList<String>();
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
	button1.addActionListener(this);
	button2.addActionListener(this);
	

	
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

			
			
		if(e.getSource()==button1) {
			newName = JOptionPane.showInputDialog("Add your name");
			NamesList.add(newName);
		}
		if(e.getSource()==button2) {
				
				String output = "";
				for(int i = 0; i < NamesList.size(); i++){
					output+=  "Guest #" + ( i +1 ) + NamesList.get(i);
					
					
				}
				JOptionPane.showMessageDialog( null, " " + output);
		}
		
	}


}
