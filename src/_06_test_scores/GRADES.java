package _06_test_scores;

import javax.swing.JOptionPane;

public class GRADES {
public static void main(String[] args) {
	//asdfkjas;dkfjas;dkfj;asdfkj;asldjf;lkjasdf;kasd;fjasdlfkj
	String score = JOptionPane.showInputDialog("What was your test score?");
	double sc0re = Double.parseDouble(score);
	if(sc0re <= 0) {
	JOptionPane.showMessageDialog(null, "I didn't expect much, and you still found a way to disappoint me.");
	}
	else if(sc0re <= 10 ) {
		JOptionPane.showMessageDialog(null, "LA SPIKY CHANCLA");
	}
	else if(sc0re <= 20) {
		JOptionPane.showMessageDialog(null, "Disowned. ");
	}
	else if(sc0re <= 30) {
		JOptionPane.showMessageDialog(null, "Sleep in the dog house.");
	}

else if(sc0re <= 40) {
	JOptionPane.showMessageDialog(null, "THE BELT.");
}
else if(sc0re <= 50 ){
	JOptionPane.showMessageDialog(null, "Grounded for a year.");

	}
else if (sc0re <= 60) {
	JOptionPane.showMessageDialog(null, "No dinner.");
}
else if (sc0re <= 70 ) {
	JOptionPane.showMessageDialog(null, "No tech.");
}
else if (sc0re <= 80 ) {
	JOptionPane.showMessageDialog(null, "Should've been 90.");
}
else if (sc0re <= 90 ) {
	JOptionPane.showMessageDialog(null, "Should've been 100.");
}
else if (sc0re <= 100) {
	JOptionPane.showMessageDialog(null, "Should've been 101.");
}
else {
JOptionPane.showMessageDialog(null, "Hmph. Good.");
}
}
}



