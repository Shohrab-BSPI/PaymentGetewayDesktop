package registration;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegistrationForm extends JFrame{

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
	
	
	RegistrationForm(){
		FormContext formContext = FormContext.getContext();
		formContext.setTfName(new JTextField());
		formContext.setTfEmail(new JTextField());
		formContext.setPsPassword(new JPasswordField());
		formContext.setPsPasswordC(new JPasswordField());
		formContext.setbSubmit(new JButton("Submit"));
		formContext.setbClear( new JButton("Clear"));
		lblName = new JLabel("NAME");
		lblEmail = new JLabel("Email");
		lblPassword = new JLabel("Password");
		lblPasswordC = new JLabel("Retype Password");
		
		pnlWrapper = new JPanel(new GridLayout(20,1));
		pnlName = new JPanel(new GridLayout(1,2));
		pnlName.add(lblName);
		pnlName.add(formContext.getTfName());
		pnlWrapper.add(pnlName);

		pnlEmail = new JPanel(new GridLayout(1,2));
		pnlEmail.add(lblEmail);
		pnlEmail.add(formContext.getTfEmail());
		pnlWrapper.add(pnlEmail);
		
		pnlPassword = new JPanel(new GridLayout(1,2));
		pnlPassword.add(lblPassword);
		pnlPassword.add(formContext.getPsPassword());
		pnlWrapper.add(pnlPassword);
		
		pnlPasswordC = new JPanel(new GridLayout(1,2));
		pnlPasswordC.add(lblPasswordC);
		pnlPasswordC.add(formContext.getPsPasswordC());
		pnlWrapper.add(pnlPasswordC);
		
		pnlButton = new JPanel(new GridLayout(1,2));
		formContext.getbClear().addActionListener(new ClearActionListener());
		pnlButton.add(formContext.getbClear());
		formContext.getbSubmit().addActionListener(new SubmitActionListener());
		pnlButton.add(formContext.getbSubmit());
		pnlWrapper.add(pnlButton);
		
		

		this.setLayout(new BorderLayout());
		this.setSize(400, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.add(pnlWrapper,BorderLayout.CENTER);
		
		
		
		
		
	}
	public static void main(String[] args) {
		new RegistrationForm();
	}
}


