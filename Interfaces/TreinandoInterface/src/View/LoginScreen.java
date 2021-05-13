package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginScreen extends JFrame {

	private JPanel contentPane;
	private JLabel lblLogin;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen frame = new LoginScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Senha");
		lblNewLabel.setBounds(208, 205, 86, 39);
		contentPane.add(lblNewLabel);
		
		lblLogin = new JLabel("Login");
		lblLogin.setBounds(208, 88, 86, 39);
		contentPane.add(lblLogin);
		
		JButton btnLogin = new JButton("Enter");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (checkLogin(textField.getText(), new String(passwordField.getPassword()))) {
					JOptionPane.showMessageDialog(null, "Seja bem vindo " + textField.getText());
				} else {
					JOptionPane.showMessageDialog(null, textField.getText() + " não foi encontrado");
				}
				
			}
		});
		btnLogin.setBounds(255, 360, 175, 56);
		contentPane.add(btnLogin);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(208, 138, 280, 56);
		contentPane.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(208, 255, 280, 50);
		contentPane.add(passwordField);
	}
	
	public boolean checkLogin(String login, String pass) {
		return login.equals("admin") && pass.equals("admin");
	}
}
