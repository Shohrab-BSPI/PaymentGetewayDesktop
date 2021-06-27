package registration;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegistrationForm extends JFrame{

	private JTextField tfName;
	private JTextField tfEmail;
	private JPasswordField psPassword;
	private JPasswordField psPasswordC;
	private JButton bSubmit;
	private JButton bClear;
	private JLabel lblName;
	private JLabel lblEmail;
	private JLabel lblPassword;
	private JLabel lblPasswordC;
	
	private JPanel pnlWrapper;
	private JPanel pnlName;
	private JPanel pnlEmail;
	private JPanel pnlPassword;
	private JPanel pnlPasswordC;
	private JPanel pnlButton;
	
	
	public RegistrationForm(){
		initialize();
	}

	private void initialize() {
		tfName = new JTextField();
		tfEmail = new JTextField();
		psPassword = new JPasswordField();
		psPasswordC = new JPasswordField();
		bSubmit = new JButton("Submit");
		bClear = new JButton("Clear");
		lblName = new JLabel("NAME");
		lblEmail = new JLabel("Email");
		lblPassword = new JLabel("Password");
		lblPasswordC = new JLabel("Retype Password");

		pnlWrapper = new JPanel(new GridLayout(20,1));

		GridLayout row1Col2 = new GridLayout();

		pnlName = new JPanel(row1Col2);
		pnlName.add(lblName);
		pnlName.add(tfName);
		pnlWrapper.add(pnlName);

		pnlEmail = new JPanel(row1Col2);
		pnlEmail.add(lblEmail);
		pnlEmail.add(tfEmail);
		pnlWrapper.add(pnlEmail);

		pnlPassword = new JPanel(row1Col2);
		pnlPassword.add(lblPassword);
		pnlPassword.add(psPassword);
		pnlWrapper.add(pnlPassword);

		pnlPasswordC = new JPanel(row1Col2);
		pnlPasswordC.add(lblPasswordC);
		pnlPasswordC.add(psPasswordC);
		pnlWrapper.add(pnlPasswordC);


		bClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clearData();
			}
		});


		bSubmit.addActionListener(e -> doRegister());

		pnlButton = new JPanel(row1Col2);
		pnlButton.add(bClear);
		pnlButton.add(bSubmit);
		pnlWrapper.add(pnlButton);

		this.setLayout(new BorderLayout());
		this.setSize(400, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.add(pnlWrapper,BorderLayout.CENTER);
	}

	private void doRegister() {
		System.out.println("Register");
	}

	private void clearData() {
		tfName.setText("");
		tfEmail.setText("");
		psPassword.setText("");
		psPasswordC.setText("");
	}
}


