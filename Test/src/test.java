import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JScrollPane;

public class test {

	private JFrame frame;
	private String txtTotal;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 441, 240);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JComboBox<String> comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setBounds(113, 11, 147, 23);
		
		String[] vetorCarros = { "Gol", "Celta", "Uno" };
		for (int i = 0; i < vetorCarros.length; i++) {
			
			
			
			comboBox.addItem(vetorCarros[i]);
			
			
			
		}

		

		frame.getContentPane().add(comboBox);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setBounds(56, 56, 298, 102);
		frame.getContentPane().add(txtArea);

		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.setForeground(new Color(148, 0, 211));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
					String selecionado = String.valueOf(comboBox.getSelectedItem());
					
					if (txtTotal == null) {
						txtTotal = selecionado;
					}else {
						txtTotal = txtTotal + ","+ selecionado;
					}
					txtArea.setText(txtTotal);
				}
				
			
		});
		btnNewButton.setBounds(270, 11, 103, 23);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Opções:");
		lblNewLabel.setBounds(56, 16, 58, 18);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 66, 308, 92);
		frame.getContentPane().add(scrollPane);
		
		
	}
}
