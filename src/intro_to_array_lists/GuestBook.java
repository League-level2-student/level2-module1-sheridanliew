package intro_to_array_lists;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
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
	JFrame frame2 = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton view = new JButton();
	JPanel panel2 = new JPanel();
	JTextArea text = new JTextArea(20, 15);
	ArrayList<String> arr = new ArrayList<String>();
	String allGuests = "";

	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
		gb.startGUI();
	}

	void startGUI() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		add.setText("Add Guest");
		add.addMouseListener(this);
		panel.add(add);
		view.setText("View Guests");
		view.addMouseListener(this);
		panel.add(view);
		panel.add(text);
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
			if (arr.isEmpty()) {
				text.setText("No guests yet.");
			}
			for (int i = 0; i < arr.size(); i++) {
				String s = arr.get(i);
				allGuests = allGuests + s + "\n";
				text.setText(allGuests);
				frame.pack();
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
