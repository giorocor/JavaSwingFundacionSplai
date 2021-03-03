import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		//Agrega campos de entrada para los 2 operandos y el resultado
		textField = new JTextField();
		textField.setBounds(76, 65, 167, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(76, 120, 167, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(253, 94, 154, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		
		//Agrega botones para seleccionar el tipo de operacion aritmetica a realizar y para cerrar la app
		
		//boton para seleccionar la operacion sumar
		JButton btnNewButton = new JButton("+");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int resultado= Integer.parseInt(textField.getText())+Integer.parseInt(textField_1.getText());
				textField_2.setText(String.valueOf(resultado));
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton.setBounds(72, 93, 41, 23);
		contentPane.add(btnNewButton);
		
		//boton para seleccionar la operacion restar
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int resultado= Integer.parseInt(textField.getText())-Integer.parseInt(textField_1.getText());
				textField_2.setText(String.valueOf(resultado));
			}
		});
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(114, 93, 41, 23);
		contentPane.add(btnNewButton_1);
		
		
		//boton para seleccionar la operacion multiplicacion
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int resultado= Integer.parseInt(textField.getText())*Integer.parseInt(textField_1.getText());
				textField_2.setText(String.valueOf(resultado));
			}
		});
		btnNewButton_2.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBounds(160, 93, 41, 23);
		contentPane.add(btnNewButton_2);
		
		//boton para seleccionar la operacion division
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int resultado= Integer.parseInt(textField.getText())/Integer.parseInt(textField_1.getText());
				textField_2.setText(String.valueOf(resultado));
			}
		});
		btnNewButton_3.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_3.setBackground(Color.CYAN);
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setBounds(202, 93, 41, 23);
		contentPane.add(btnNewButton_3);
		
		//boton para cerrar la app
		JButton btnNewButton_4 = new JButton("Cerrar");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_4.setBounds(165, 163, 95, 23);
		contentPane.add(btnNewButton_4);
		
		
		//Etiquetas para indicar el nombre de los textfield
		JLabel lblNewLabel = new JLabel("Resultado");
		lblNewLabel.setBounds(253, 71, 107, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor 1:");
		lblNewLabel_1.setBounds(37, 68, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Valor 2:");
		lblNewLabel_2.setBounds(37, 123, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		//Etiqueta que indica lo que se debe hacer en la aplicacion
		JLabel lblNewLabel_3 = new JLabel("Ingresa los valores a operar y selecciona el tipo \r\nde operacion a realizar:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(37, 11, 359, 46);
		contentPane.add(lblNewLabel_3);
		
		//Crea un grupo de botones
		ButtonGroup bg1= new ButtonGroup();
		bg1.add(btnNewButton_1);
		bg1.add(btnNewButton_2);
		bg1.add(btnNewButton_3);
		bg1.add(btnNewButton_4);
	}
}
