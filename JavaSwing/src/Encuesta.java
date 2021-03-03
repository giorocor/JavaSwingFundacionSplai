import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JCheckBox;

public class Encuesta extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Encuesta frame = new Encuesta();
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
	public Encuesta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		//Crea etiquetas para cada pregunta de la encuesta
		JLabel lblNewLabel = new JLabel("Elije un sistema operativo: ");
		lblNewLabel.setBounds(33, 40, 194, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Elije tu especialidad:");
		lblNewLabel_1.setBounds(33, 143, 144, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas en el ordenador:");
		lblNewLabel_2.setBounds(206, 40, 187, 14);
		contentPane.add(lblNewLabel_2);
		
		//Crea etiqueta para el valor inicial de slider
		JLabel lblNewLabel_3 = new JLabel("0");
		lblNewLabel_3.setBounds(269, 95, 84, 14);
		contentPane.add(lblNewLabel_3);
		
		
		//Crea Slider para preguntar las horas dedicadas al ordenador
		JSlider slider = new JSlider();
		slider.setMaximum(10);
		slider.setBounds(224, 58, 200, 26);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblNewLabel_3.setText("valor: "+slider.getValue());
			}
		});

		
		
		//Crea una seccion para agrupar radioButton
		ButtonGroup bg1= new ButtonGroup();

	
		//Crea radiobutton para cada seccion de la encuesta
		JRadioButton rdbtn1 = new JRadioButton("Windows");
		rdbtn1.setBounds(51, 61, 109, 23);
		contentPane.add(rdbtn1);
		
		JRadioButton rdbtn2 = new JRadioButton("Linux");
		rdbtn2.setBounds(51, 87, 109, 23);
		contentPane.add(rdbtn2);
		
		JRadioButton rdbtn3= new JRadioButton("Mac");
		rdbtn3.setBounds(51, 113, 109, 23);
		contentPane.add(rdbtn3);
		
		//Agrega radiobutton a buttongroup
		bg1.add(rdbtn1);
		bg1.add(rdbtn2);
		bg1.add(rdbtn3);
		
	
		
		//Crea Checkbox para que se indique el tipo de especialidad
		JCheckBox CheckBox1 = new JCheckBox("Programacion");
		CheckBox1.setBounds(51, 164, 142, 23);
		contentPane.add(CheckBox1);
		
		JCheckBox CheckBox2 = new JCheckBox("Dise\u00F1o Grafico");
		CheckBox2.setBounds(51, 190, 142, 23);
		contentPane.add(CheckBox2);
		
		JCheckBox CheckBox3 = new JCheckBox("Administracion");
		CheckBox3.setBounds(51, 216, 142, 23);
		contentPane.add(CheckBox3);
		
		
		
		//Crea boton para guardar y mostrar los resultados de la encuesta
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBounds(249, 143, 129, 33);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("Sistema Operativo: ");
				if(rdbtn1.isSelected()) {
					System.out.println("Windows");
				}else if (rdbtn2.isSelected()) {
					System.out.println("Linux");
				}else if (rdbtn3.isSelected()) {
					System.out.println("Mac");
				}
			
				System.out.println("Especialidad: ");
				if(CheckBox1.isSelected()) {
					System.out.println("Programacion");
				}
				if (CheckBox2.isSelected()) {
					System.out.println("Diseño Grafico");
				}
				if (CheckBox3.isSelected()) {
					System.out.println("Administracion");
				}
				
				System.out.println("Horas dedicadas en el ordenador: ");
				System.out.println(slider.getValue());
		}
		});
		
		
		//Agrega componentes al Jpanel
		contentPane.add(btnNewButton);
		contentPane.add(slider);

		

	}
}
