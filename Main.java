import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main extends JApplet implements MouseListener {
	
	JTextField textField;
	JLabel labelClick,labelInstruction;
	JFrame frame;
	public void init()	{
		setSize(500,500);
		getContentPane().setBackground(new Color(255,250,150));
		
		textField = new JTextField(20);
		textField.setBounds(300, 200, 70, 20);
		textField.setBackground(new Color(120,120,255));
		textField.setName("textField1");
		textField.addMouseListener(this);

		labelClick = new JLabel("Click here and see the magic!!");
		labelClick.setBounds(100, 195, 250, 30);
		
		labelInstruction = new JLabel("Oops!!Want it back?");
		labelInstruction.setBounds(100, 195, 250, 30);
		labelInstruction.setVisible(false);
		
		setBackground(new Color(255,250,150));
		add(textField);
		add(labelClick);
		add(labelInstruction);
		getContentPane().setName("panelObject");
		getContentPane().addMouseListener(this);
		setLayout(null);
		setVisible(true);
	}
	
	public void start() {
		
		System.out.println("Inside start");
	}
	
	public void paint(Graphics g) {
		super.paintComponents(g);

		System.out.println("Inside paint");
	}
	
	public void stop() {
		
		System.out.println("Inside stop");
	}
	
	public void destroy() {
		
		System.out.println("Inside destroy");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		textField.setVisible(false);
		labelClick.setVisible(false);
		labelInstruction.setVisible(true);
		getContentPane().setBackground(new Color(20,205,10));
		System.out.println("mouse clicked");
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		System.out.println(e.getComponent().getName());
		if( !(e.getComponent().getName().equals("textField1")) && (e.getComponent().getName().equals("panelObject")))
		{
			textField.setVisible(true);
			textField.setBackground(Color.RED);
			getContentPane().setBackground(new Color(255,250,150));
			labelInstruction.setVisible(false);
			labelClick.setVisible(true);
			System.out.println("mouse exited");
		}
		
	}

}
