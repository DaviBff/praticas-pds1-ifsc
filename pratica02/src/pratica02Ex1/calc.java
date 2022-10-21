package pratica02Ex1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class calc extends JFrame {

	private JPanel contentPane;
	private JTextField N2;
	private JTextField N1;

	/*
	 * Davi Augusto Boff @author 
	 * 20/10/2022 @data
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc frame = new calc();
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
	public calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 187, 264);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		N2 = new JTextField();
		N2.setBounds(32, 97, 96, 19);
		contentPane.add(N2);
		N2.setColumns(10);

		N1 = new JTextField();
		N1.setBounds(32, 49, 96, 19);
		contentPane.add(N1);
		N1.setColumns(10);

		JLabel lblV1 = new JLabel("Insira o primeiro valor:");
		lblV1.setBounds(32, 29, 129, 13);
		contentPane.add(lblV1);

		JLabel lblV2 = new JLabel("Insira o segundo valor:");
		lblV2.setBounds(32, 74, 141, 13);
		contentPane.add(lblV2);

		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double num1 = Double.valueOf(N1.getText());
				Double num2 = Double.valueOf(N2.getText());

				DecimalFormat d = new DecimalFormat("###.##");
				JOptionPane.showMessageDialog(null, "Soma = " + d.format(somaCalc(num1, num2)));
			}

			private Double somaCalc(Double num1, Double num2) {
				Double soma = 0.0;
				soma = num1 + num2;

				return soma;
			}
		});
		btnSoma.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSoma.setBounds(37, 141, 46, 33);
		contentPane.add(btnSoma);

		JButton btnMenos = new JButton("-");
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double num1 = Double.valueOf(N1.getText());
				Double num2 = Double.valueOf(N2.getText());

				DecimalFormat d = new DecimalFormat("###.##");
				JOptionPane.showMessageDialog(null, "Subtracao = " + d.format(subCalc(num1, num2)));

			}

			private Double subCalc(Double num1, Double num2) {
				Double sub = 0.0;
				sub = num1 - num2;

				return sub;

			}
		});
		btnMenos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMenos.setBounds(82, 141, 46, 33);
		contentPane.add(btnMenos);

		JButton btnDivi = new JButton("/");
		btnDivi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double num1 = Double.valueOf(N1.getText());
				Double num2 = Double.valueOf(N2.getText());

				DecimalFormat d = new DecimalFormat("###.##");
				JOptionPane.showMessageDialog(null, "Divisao = " + d.format(divCalc(num1, num2)));

			}

			private Double divCalc(Double num1, Double num2) {
				Double div = 0.0;
				div = num1 / num2;

				return div;
			}
		});
		btnDivi.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDivi.setBounds(37, 173, 46, 33);
		contentPane.add(btnDivi);

		JButton btnVezes = new JButton("*");
		btnVezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double num1 = Double.valueOf(N1.getText());
				Double num2 = Double.valueOf(N2.getText());

				DecimalFormat d = new DecimalFormat("###.##");
				JOptionPane.showMessageDialog(null, "Multiplicacao = " + d.format(multCalc(num1, num2)));

			}

			private Double multCalc(Double num1, Double num2) {
				Double mult = 0.0;
				mult = num1 * num2;

				return mult;
			}
		});
		btnVezes.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVezes.setBounds(82, 173, 46, 33);
		contentPane.add(btnVezes);
	}
}
