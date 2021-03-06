package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b1 = new JButton("Add Entry");
	JButton b2 = new JButton("Search by ID");
	JButton b3 = new JButton("View List");
	String AddID;
	String AddName;
	String SearchID;
	HashMap<Integer, String> rwi = new HashMap<Integer, String>();
	public static void main(String[]args) {
		LogSearch ls = new LogSearch();
	}
	LogSearch(){
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		frame.setVisible(true);
		frame.setSize(800, 500);
		}	
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b1) {
		AddID = JOptionPane.showInputDialog("Add an ID Number");
		AddName = JOptionPane.showInputDialog("Add a name");	
		Integer ae = Integer.parseInt(AddID);
		rwi.put(ae, AddName);
	}
	if(e.getSource()==b2) {
		
	SearchID = JOptionPane.showInputDialog("Find an ID Number");
	Integer si = Integer.parseInt(SearchID);
	JOptionPane.showMessageDialog(null, rwi.get(si));
	}
	if(e.getSource()==b3) {
		String a = " ";
		for(Integer s :  rwi.keySet()){
			a += " ID " + s + ": " + rwi.get(s) +"\n";
			
		}
		JOptionPane.showMessageDialog(null, a );
	}
	}
}
