import java.awt.Container;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EGWindow extends JFrame {

	public EGWindow() {
		// TODO Auto-generated constructor stub
		setTitle("Example 2");
		setSize(150,120);
		//
		//* Get a pointer to the content pane, create a label
		//* and add it to the content pane
		//* *****************************************
		Container MyContentFrame = getContentPane();
		JLabel NiceDay=new JLabel(" Have a nice day!");
		MyContentFrame.add(NiceDay);
		//
		//* An inner class is defined as the window listener
		//* It is only interested in the windowClosing event,
		//* which will shut down the program
		//* *****************************************
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}

}