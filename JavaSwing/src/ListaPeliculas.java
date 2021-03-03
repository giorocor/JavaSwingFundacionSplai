import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.Label;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListaPeliculas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JComboBox<String> comboBox;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaPeliculas frame = new ListaPeliculas();
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

	public ListaPeliculas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//Agrega campo de texto para indicar el valor que se debe ingresar en input
		JLabel lblNewLabel = new JLabel("Escribe el titulo de una pelicula");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setLocation(25, 85);
		lblNewLabel.setSize(159, 25);
		
		//Agrega input para ingresar nombre de pelicula
		textField = new JTextField();
		textField.setLocation(25, 121);
		textField.setSize(159, 30);
		textField.setColumns(10);
		
		//Etiqueta para dar titulo al combobox
		lblNewLabel_1 = new JLabel("Peliculas");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setLocation(232, 80);
		lblNewLabel_1.setSize(159, 30);
	
		//Boton para agregar al combobox las peliculas ingresadas en input
		JButton btnNewButton = new JButton("A\u00F1adir");
		btnNewButton.setLocation(57, 162);
		btnNewButton.setSize(89, 38);
		btnNewButton.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				comboBox.addItem(textField.getText());
			}
		});
		

		comboBox = new JComboBox<String>();
		comboBox.setBounds(232, 121, 159, 79);
	
		
		//Agrega  componente al Jpanel
		contentPane.setLayout(null);
		contentPane.add(textField);
		contentPane.add(lblNewLabel_1);
		contentPane.add(btnNewButton);
		contentPane.add(comboBox);
		contentPane.add(lblNewLabel);
	}


}
