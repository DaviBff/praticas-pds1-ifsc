package pratica01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class soma extends JFrame {

	private JPanel contentPane;
	private JTextField valor1;
	private JTextField valor2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					soma frame = new soma();
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
	public soma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 253, 262);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		valor1 = new JTextField();
		valor1.setBounds(55, 61, 116, 19);
		contentPane.add(valor1);
		valor1.setColumns(10);
		
		valor2 = new JTextField();
		valor2.setBounds(55, 113, 116, 19);
		contentPane.add(valor2);
		valor2.setColumns(10);
		
		JLabel lblValor1 = new JLabel("Insira o primeiro valor:");
		lblValor1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblValor1.setBounds(55, 36, 161, 13);
		contentPane.add(lblValor1);
		
		JLabel lblValor2 = new JLabel("Insira o segundo valor:");
		lblValor2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblValor2.setBounds(55, 90, 161, 13);
		contentPane.add(lblValor2);
		
		JButton btnSoma = new JButton("Soma");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Integer n1 = Integer.valueOf(valor1.getText());
				Integer n2 = Integer.valueOf(valor2.getText());
				
				JOptionPane.showMessageDialog(null,"Soma = " + somaValor(n1,n2));
				
			}

			private Object somaValor(Integer n1, Integer n2) {
				Integer soma = 0;
				
				soma = n1 + n2;
				
				
				
				return soma;
			}
		});
		btnSoma.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnSoma.setForeground(new Color(139, 0, 0));
		btnSoma.setBounds(69, 154, 85, 21);
		contentPane.add(btnSoma);
	}
}
