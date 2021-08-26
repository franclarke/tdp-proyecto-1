package gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField textLU;
	private JTextField textApellido;
	private JTextField textNombre;
	private JTextField textEmail;
	private JTextField textGithub;
	private JLabel lblTime;
	

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 275));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(null);
		tabbedPane.setFont(new Font("SansSerif", Font.BOLD, 12));
		tabbedPane.setBounds(5, 5, 430, 200);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 245));
		tabbedPane.addTab("Informacion del alumno", null, tabInformation, "Muestra la informacion declarada por el alumno");
		tabInformation.setLayout(null);
		
		textLU = new JTextField();
		textLU.setBounds(85, 10, 330, 19);
		textLU.setText(String.valueOf(studentData.getId()));
		textLU.setEditable(false);
		textLU.setFont(new Font("SansSerif", Font.PLAIN, 12));
		textLU.setToolTipText("");
		tabInformation.add(textLU);
		textLU.setColumns(10);
		
		textApellido = new JTextField();
		textApellido.setBounds(85, 39, 330, 19);
		textApellido.setText(studentData.getLastName());
		textApellido.setEditable(false);
		textApellido.setFont(new Font("SansSerif", Font.PLAIN, 12));
		textApellido.setColumns(10);
		tabInformation.add(textApellido);
		
		textNombre = new JTextField();
		textNombre.setBounds(85, 68, 330, 19);
		textNombre.setText(studentData.getFirstName());
		textNombre.setEditable(false);
		textNombre.setFont(new Font("SansSerif", Font.PLAIN, 12));
		textNombre.setColumns(10);
		tabInformation.add(textNombre);
		
		textEmail = new JTextField();
		textEmail.setBounds(85, 97, 330, 19);
		textEmail.setText(studentData.getMail());
		textEmail.setEditable(false);
		textEmail.setFont(new Font("SansSerif", Font.PLAIN, 12));
		textEmail.setColumns(10);
		tabInformation.add(textEmail);
		
		textGithub = new JTextField();
		textGithub.setBounds(85, 126, 330, 19);
		textGithub.setText(studentData.getGithubURL());
		textGithub.setEditable(false);
		textGithub.setFont(new Font("SansSerif", Font.PLAIN, 12));
		textGithub.setColumns(10);
		tabInformation.add(textGithub);
		
		JLabel lblLU = new JLabel("LU");
		lblLU.setBounds(10, 10, 55, 19);
		lblLU.setFont(new Font("SansSerif", Font.BOLD, 12));
		tabInformation.add(lblLU);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 39, 55, 19);
		lblApellido.setFont(new Font("SansSerif", Font.BOLD, 12));
		tabInformation.add(lblApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 68, 55, 19);
		lblNombre.setFont(new Font("SansSerif", Font.BOLD, 12));
		tabInformation.add(lblNombre);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(10, 97, 55, 19);
		lblEmail.setFont(new Font("SansSerif", Font.BOLD, 12));
		tabInformation.add(lblEmail);
		
		JLabel lblGithub = new JLabel("Github URL");
		lblGithub.setBounds(10, 126, 66, 19);
		lblGithub.setFont(new Font("SansSerif", Font.BOLD, 12));
		tabInformation.add(lblGithub);
		
        JLabel lbl_img = new JLabel();
        lbl_img.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto())));
        lbl_img.setBounds(445, 44, 146, 146);
        contentPane.add(lbl_img);
        
        lbl_img.setVisible(true);
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");
		contentPane.setLayout(null);
		contentPane.add(tabbedPane);
		lblTime = new JLabel("Esta ventana fue generada el "+ dtf1.format(LocalDateTime.now()) + " a las: "+dtf2.format(LocalDateTime.now()));
		lblTime.setBounds(15, 210, 405, 19);
		contentPane.add(lblTime);
		lblTime.setFont(new Font("SansSerif", Font.BOLD, 12));
	}
}
