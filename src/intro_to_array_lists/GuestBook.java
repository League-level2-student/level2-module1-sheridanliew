package intro_to_array_lists;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements MouseListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton view = new JButton();
	ArrayList<String> arr = new ArrayList<String>();

	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
		// gb.start();
		gb.GUI();
	}

	// void start() {
	// arr.add("Guest #1: Bob Banders");
	// arr.add("Guest #2: Sandy Summers");
	// arr.add("Guest #3: Greg Ganders");
	// arr.add("Guest #4: Donny Doners");
	// }

	void GUI() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		add.setText("Add Guest");
		add.addMouseListener(this);
		panel.add(add);
		view.setText("View Guests");
		view.addMouseListener(this);
		panel.add(view);
		frame.pack();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == add) {
			String entered = JOptionPane.showInputDialog("Enter a name:");
			int nextNum = arr.size() + 1;
			arr.add("Guest #" + nextNum + ": " + entered);
		}
		if (e.getSource() == view) {
			for (String s : arr) {
				JOptionPane.showMessageDialog(null, s);
				// textArea
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

	}
}
