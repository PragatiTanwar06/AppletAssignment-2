import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main extends JApplet implements MouseListener {
	
	private JTextArea textField;
	private JLabel labelClick,labelInstruction;
	private int count =0;
	public void init()	{
		
		setSize(500,500);

		textField = new JTextArea();
		textField.setBounds(300, 200, 70, 20);
		textField.setBackground(Color.BLUE);
		textField.setName("textField");
		textField.addMouseListener(this);

		labelClick = new JLabel("Want to see magic?");
		labelClick.setBounds(100, 195, 250, 30);
		
		labelInstruction = new JLabel("Oops!! want it back?");
		labelInstruction.setBounds(100, 195, 250, 30);
		labelInstruction.setVisible(false);
		
		getContentPane().setBackground(new Color(255,250,150));
		add(textField);
		add(labelClick);
		add(labelInstruction);
		getContentPane().addMouseListener(this);
		setLayout(null);
		setVisible(true);
		
	}
	
	public void start() {	
		
		repaint();
	}
	
	public void paint(Graphics g) {
		super.paintComponents(g);

	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
	
		if(e.getComponent().getName().equals("textField")) {
			//Will make textField disappear
			textField.setVisible(false);
			labelClick.setVisible(false);
			labelInstruction.setVisible(true);
			getContentPane().setBackground(new Color(20,205,10));
			count++;
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
			
	}

	@Override
	public void mouseExited(MouseEvent e) {

		//If cursor hovers out of the panel, make text field appear again 
		if(!(e.getComponent().getName().equals("textField")) && count!=0)
		{
			textField.setVisible(true);
			textField.setBackground(Color.RED);
			getContentPane().setBackground(new Color(255,250,150));
			labelInstruction.setVisible(false);
			labelClick.setVisible(true);
		}
		
	}
}
