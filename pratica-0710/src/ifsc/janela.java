package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class janela extends JFrame {

	private JPanel contentPane;
	private JTextField nota2;
	private JTextField nota3;
	private JTextField nota1;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janela frame = new janela();
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
	public janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 311, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtNome = new JTextField();
		txtNome.setBounds(79, 20, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		nota1 = new JTextField();
		nota1.setBounds(79, 68, 86, 20);
		contentPane.add(nota1);
		nota1.setColumns(10);

		nota2 = new JTextField();
		nota2.setBounds(79, 99, 86, 20);
		contentPane.add(nota2);
		nota2.setColumns(10);

		nota3 = new JTextField();
		nota3.setBounds(79, 130, 86, 20);
		contentPane.add(nota3);
		nota3.setColumns(10);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(24, 23, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nota 1:");
		lblNewLabel_1.setBounds(24, 72, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Nota 2:");
		lblNewLabel_2.setBounds(24, 101, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Nota 3:");
		lblNewLabel_3.setBounds(24, 136, 46, 14);
		contentPane.add(lblNewLabel_3);

		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nome = txtNome.getText();

				Integer n1 = Integer.valueOf(nota1.getText());
				Integer n2 = Integer.valueOf(nota2.getText());
				Integer n3 = Integer.valueOf(nota3.getText());

				JOptionPane.showMessageDialog(null, " Aluno: " + nome + "\n Media: " + mediaMain(n1, n2, n3));

			}

			private Object mediaMain(Integer n1, Integer n2, Integer n3) {

				Integer media = 0;
				for (int i = 0; i < 3; i++) {
					media = (n1 + n2 + n3) / 3;
				}

				return media;
			}
		});
		btnCalcular.setBounds(98, 198, 101, 35);
		contentPane.add(btnCalcular);
	}
}
