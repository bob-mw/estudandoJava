package View;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CrudScreen extends JFrame {

	private JPanel contentPane;
	private JTextField txtAdd;
	
	CrudList myList = new CrudList();
	
	ArrayList<String> list = myList.getList();
	private JTextField txtAge;
	private JTable table;
	private final String colunas[]={"Nome:","Idade:","Sexo:"};
    private final String dados[][]={
            {"Jack","19","Masculino"},
            {"Eddie","56","Masculino"},
            {"Gina","34","Feminino"},
            {"Klaus","18","Masculino"},
            {"Erika","20","Feminino"},
            {"Roberto","29","Masculino"},
            {"Maria","30","Feminino"}};
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrudScreen frame = new CrudScreen();
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
	public CrudScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtAdd = new JTextField();
		txtAdd.setBounds(34, 39, 114, 34);
		contentPane.add(txtAdd);
		txtAdd.setColumns(10);
		
		JButton btnAdd = new JButton("Adicionar");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myList.setList(txtAdd.getText(), txtAge.getText());
				System.out.println(list);
			}
		});
		btnAdd.setBounds(320, 45, 89, 23);
		contentPane.add(btnAdd);
		
		txtAge = new JTextField();
		txtAge.setBounds(158, 39, 114, 34);
		contentPane.add(txtAge);
		txtAge.setColumns(10);
		
		table = new JTable(dados, colunas);
		table.setBounds(34, 98, 237, 154);
		contentPane.add(table);
	}
}
