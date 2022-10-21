package pratica02Ex2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class triangulo extends JFrame {

	private JPanel contentPane;
	private JTextField Lado1;
	private JTextField Lado2;
	private JTextField Lado3;
	private JTextField Resultado;

	/*
	 * Davi Augusto Boff @author 
	 * 20/10/2022 @data	
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					triangulo frame = new triangulo();
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
	public triangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 372, 291);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		Lado1 = new JTextField();
		Lado1.setBounds(53, 68, 96, 19);
		contentPane.add(Lado1);
		Lado1.setColumns(10);

		Lado2 = new JTextField();
		Lado2.setBounds(53, 118, 96, 19);
		contentPane.add(Lado2);
		Lado2.setColumns(10);

		Lado3 = new JTextField();
		Lado3.setBounds(53, 172, 96, 19);
		contentPane.add(Lado3);
		Lado3.setColumns(10);

		JLabel lblNewLabel = new JLabel("Insira os lados do triangulo abaixo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(70, 10, 240, 13);
		contentPane.add(lblNewLabel);

		JLabel txtl3 = new JLabel("Lado 1:");
		txtl3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtl3.setBounds(53, 50, 45, 13);
		contentPane.add(txtl3);

		JLabel txtL2 = new JLabel("Lado 2:");
		txtL2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtL2.setBounds(53, 97, 45, 13);
		contentPane.add(txtL2);

		JLabel txtL3 = new JLabel("Lado 3:");
		txtL3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtL3.setBounds(53, 149, 45, 13);
		contentPane.add(txtL3);

		JButton btnExibir = new JButton("Exibir");
		btnExibir.setForeground(new Color(34, 139, 34));
		btnExibir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Integer L1 = Integer.valueOf(Lado1.getText());
				Integer L2 = Integer.valueOf(Lado2.getText());
				Integer L3 = Integer.valueOf(Lado3.getText());

				if (L1 == L2 && L1 == L3) {
					Resultado.setText(String.valueOf("Equilátero"));
				} else if (L1 == L2 && L1 != L3) {
					Resultado.setText(String.valueOf("Isósceles"));

				} else if (L2 == L3 && L2 != L1) {
					Resultado.setText(String.valueOf("Isósceles"));

				} else if (L1 == L3 && L1 != L2) {
					Resultado.setText(String.valueOf("Isósceles"));

				} else {
					Resultado.setText(String.valueOf("Escaleno"));

				}

			}
		});
		btnExibir.setBounds(193, 163, 103, 35);
		contentPane.add(btnExibir);

		Resultado = new JTextField();
		Resultado.setEditable(false);
		Resultado.setBounds(200, 118, 96, 19);
		contentPane.add(Resultado);
		Resultado.setColumns(10);

		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblResultado.setBounds(203, 94, 85, 13);
		contentPane.add(lblResultado);

		JLabel lblNewLabel_1 = new JLabel("=");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(174, 122, 45, 13);
		contentPane.add(lblNewLabel_1);
	}
}
