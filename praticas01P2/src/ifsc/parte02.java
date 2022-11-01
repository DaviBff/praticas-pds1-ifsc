package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class parte02 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCPF;
	ArrayList<String> lista = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					parte02 frame = new parte02();
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
	public parte02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox<String> comboBox = new JComboBox();
		comboBox.setBounds(76, 8, 70, 21);
		contentPane.add(comboBox);
		String[] vetorPronomes = { "V. ", "sr. ", "sra. ", "V.A ", "V.Em.a ", "V.M. " };
		for (int i = 0; i < vetorPronomes.length; i++) {

			comboBox.addItem(vetorPronomes[i]);

		}

		JLabel lblPronomes = new JLabel("Pronomes:");
		lblPronomes.setFont(new Font("Consolas", Font.PLAIN, 12));
		lblPronomes.setBounds(10, 14, 83, 13);
		contentPane.add(lblPronomes);

		txtNome = new JTextField();
		txtNome.setBounds(76, 39, 241, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtCPF = new JTextField();
		txtCPF.setBounds(76, 68, 190, 19);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Consolas", Font.PLAIN, 12));
		lblNome.setBounds(36, 44, 46, 13);
		contentPane.add(lblNome);

		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Consolas", Font.PLAIN, 12));
		lblCPF.setBounds(46, 73, 33, 13);
		contentPane.add(lblCPF);

		ArrayList<String> listPro = new ArrayList<>();

		JTextArea txtArea = new JTextArea();
		txtArea.setEditable(false);
		txtArea.setBounds(76, 97, 311, 142);
		contentPane.add(txtArea);

		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtNome.getText();
				String CPF = txtCPF.getText();
				String pronome = comboBox.getSelectedItem().toString();

				if (name.length() == 0) {
					JOptionPane.showMessageDialog(null, " Informe o nome ");
				}
				if (CPF.length() != 11) {
					JOptionPane.showMessageDialog(null, " Informe o CPF ");
				} else {

					listPro.add(comboBox.getSelectedItem() + name + " cujo CPF é " + CPF + "\n");

					txtArea.setText(listPro.toString());				}
			}

		});
		btnAdicionar.setForeground(new Color(255, 0, 255));
		btnAdicionar.setFont(new Font("Consolas", Font.BOLD, 12));
		btnAdicionar.setBounds(327, 38, 99, 21);
		contentPane.add(btnAdicionar);

		
	}
}