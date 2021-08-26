package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher{
	
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	try {
			Student stud = new Student(120547, "Clarke", "Francisco", "franclarke00@hotmail.com", "https://github.com/franclarke", "/images/foto.png");
            		SimplePresentationScreen frame = new SimplePresentationScreen(stud);
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
            	}catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
    }
}