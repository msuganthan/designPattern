package MementoPattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestMemento extends JFrame {
	public static void main(String[] args) {
		new TestMemento();
	}
	private JButton saveBut, undoBut, redoBut;
	private JTextArea theArticle = new JTextArea(40,60);
	Caretaker caretaker = new Caretaker();
	Originator originator = new Originator();
	int saveFiles = 0, currentArticle = 0;
	
	public TestMemento(){
		this.setSize(750,780);
		   this.setTitle("Memento Design Pattern");
		   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   
		   JPanel panel1 = new JPanel();
		   panel1.add(new JLabel("Article"));
		   panel1.add(theArticle);
		   
		   ButtonListener saveListener = new ButtonListener();
		   ButtonListener undoListener = new ButtonListener();
		   ButtonListener redoListener = new ButtonListener();
		   
		   saveBut = new JButton("Save");
		   saveBut.addActionListener(saveListener);
		   undoBut = new JButton("Undo");
		   undoBut.addActionListener(undoListener);
		   redoBut = new JButton("Redo");
		   redoBut.addActionListener(redoListener);
		   
		   panel1.add(saveBut);
		   panel1.add(undoBut);
		   panel1.add(redoBut);
		   
		   this.add(panel1);
		   this.setVisible(true);
	}
	
	class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == saveBut){
				String textInTextArea = theArticle.getText();
				originator.set(textInTextArea);
				caretaker.addMemento( originator.storeInMemento() );
				saveFiles++;
				currentArticle++;
				System.out.println("Save Files " + saveFiles);
				undoBut.setEnabled(true);
			} else if(e.getSource() == undoBut){
				currentArticle--;
				String textBoxString = originator.restoreFromMemento( caretaker.getMemento(currentArticle) );
				theArticle.setText(textBoxString);
				redoBut.setEnabled(true);
			}
		}
		
	}
}
