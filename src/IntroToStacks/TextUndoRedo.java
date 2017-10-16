package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.nio.charset.Charset;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.Stack;

public class TextUndoRedo implements KeyListener{
JFrame frame;
JPanel panel;
JLabel label;
Character keyletter;
Stack<Character> chariZURD = new Stack<Character>();
public static void main(String []args) {
	TextUndoRedo tur = new TextUndoRedo();
}
TextUndoRedo(){
frame = new JFrame();
panel = new JPanel();
label = new JLabel();
frame.setVisible(true);
frame.add(panel);
panel.add(label);
frame.addKeyListener(this);
frame.setSize(1000, 800);
}
public void keyTyped(KeyEvent e) {
	
	
}
public void keyPressed(KeyEvent e) {
	keyletter = e.getKeyChar();

		
	
		if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE) {
			String backspace = label.getText();
			chariZURD.push(backspace.charAt(backspace.length()-1));
			label.setText(backspace.substring(0,backspace.length()-1));
		}
		
		else if(e.getKeyCode()==KeyEvent.VK_SHIFT) {
			
			char dumptruck = chariZURD.pop();
			label.setText(label.getText() + dumptruck);
			
		}
		else {
			label.setText(label.getText() + keyletter);
		}
}
	
public void keyReleased(KeyEvent e) {
	
	
}
}

/* 
 * Create a JFrame with a JPanel and a JLabel.
 * 
 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
 * 
 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
 * Save that deleted character onto a Stack of Characters.
 * 
 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
 * off the Stack and added back to the JLabel.
 * 
 * */

