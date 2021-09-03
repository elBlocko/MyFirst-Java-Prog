package uebung11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FahrenheitCelsius extends JFrame {

	private JPanel contentPane;
	private JTextField tfFahrenheit;
	private JTextField tfCelsius;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FahrenheitCelsius frame = new FahrenheitCelsius();
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
	public FahrenheitCelsius() {
		setTitle("Umrechner Fahrenheit Celsius");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblFahrenheit = new JLabel("Grad Fahrenheit");
		lblFahrenheit.setBounds(10, 11, 126, 14);
		contentPane.add(lblFahrenheit);

		tfFahrenheit = new JTextField();
		tfFahrenheit.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					umrechnen(); // Enter was pressed. Your code goes here.
				}
			}
		});
		tfFahrenheit.setBounds(10, 36, 86, 20);
		contentPane.add(tfFahrenheit);
		tfFahrenheit.setColumns(10);

		JLabel lblCelsius = new JLabel("Grad Celsius");
		lblCelsius.setBounds(10, 67, 126, 14);
		contentPane.add(lblCelsius);

		tfCelsius = new JTextField();
		tfCelsius.setEditable(false);
		tfCelsius.setColumns(10);
		tfCelsius.setBounds(10, 92, 86, 20);
		contentPane.add(tfCelsius);

		JButton btnUmrechnen = new JButton("umrechnen");
		btnUmrechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				umrechnen();
			}
		});

		btnUmrechnen.setBounds(127, 35, 89, 23);
		contentPane.add(btnUmrechnen);

		JButton btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(127, 91, 89, 23);
		contentPane.add(btnEnde);
	}

	private void umrechnen() {
		double fahrenheit = Double.parseDouble(tfFahrenheit.getText().replace(",", "."));
		double celsius;
		celsius = (fahrenheit - 32) * 5 / 9;
		DecimalFormat f = new DecimalFormat("#0.00");
		tfCelsius.setText(f.format(celsius));
		tfFahrenheit.requestFocus(); // tf erhält Fokus
		tfFahrenheit.selectAll(); // Markiert den Eintrag
		
	}
}
