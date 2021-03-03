import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;
import javax.swing.BoxLayout;

public class Saludador extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Saludador frame = new Saludador();
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
	public Saludador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 1, 0, 13));
		
		//Agrega cuadro de mensaje
		JLabel lblNewLabel = new JLabel("Escribe un nombre para saludar");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	
		
		//Agrega input para entrada de texto
		textField = new JTextField(20);
		textField.setBounds(0, 0, 100, 100);;
		
		
		//Agrega boton para generar cuadro de mensaje
		JButton btnNewButton = new JButton("!Saludar!");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, textField.getText());
			}
		});
		
		contentPane.add(lblNewLabel);
		contentPane.add(textField);
		contentPane.add(btnNewButton);
		
	}

}
