package uebung11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Einkauf extends JFrame {

	private JPanel contentPane;
	private JTextField tfStueckzahl;
	private JTextField tfStueckpreis;
	private JTextField tfRabatt;
	private JLabel lblAusgabe;
	private String CerrMessage = "Die Eingaben sind unvollständig";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Einkauf frame = new Einkauf();
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
	public Einkauf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 227);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tfStueckzahl = new JTextField();
		tfStueckzahl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfStueckpreis.requestFocus(); // tf erhält Fokus
				}

			}
		});
		tfStueckzahl.setColumns(10);
		tfStueckzahl.setBounds(10, 36, 101, 20);
		contentPane.add(tfStueckzahl);

		JLabel lblStueckzahl = new JLabel("Stueckzahl:");
		lblStueckzahl.setBounds(10, 11, 101, 14);
		contentPane.add(lblStueckzahl);

		JButton btnBerechnen = new JButton("Berechnen");
		btnBerechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (allesAusgefuellt()) {
					calc();
				} else {
					lblAusgabe.setText(CerrMessage);
				}
			}
		});
		btnBerechnen.setBounds(343, 35, 89, 23);
		contentPane.add(btnBerechnen);

		JLabel lblStueckpreis = new JLabel("St\u00FCckpreis:");
		lblStueckpreis.setBounds(121, 11, 101, 14);
		contentPane.add(lblStueckpreis);

		tfStueckpreis = new JTextField();
		tfStueckpreis.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfRabatt.requestFocus(); // tf erhält Fokus
				}
			}
		});
		tfStueckpreis.setColumns(10);
		tfStueckpreis.setBounds(121, 36, 101, 20);
		contentPane.add(tfStueckpreis);

		JLabel lblRabatt = new JLabel("Rabatt (%)");
		lblRabatt.setBounds(232, 11, 101, 14);
		contentPane.add(lblRabatt);

		tfRabatt = new JTextField();
		tfRabatt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if (allesAusgefuellt()) {
						calc();
					} else {
						lblAusgabe.setText(CerrMessage);
					}
				}
			}
		});
		tfRabatt.setColumns(10);
		tfRabatt.setBounds(232, 36, 101, 20);
		contentPane.add(tfRabatt);

		JButton btnEnde = new JButton("Ende");
		btnEnde.setBounds(343, 69, 89, 23);
		contentPane.add(btnEnde);

		lblAusgabe = new JLabel(" . . . ");
		lblAusgabe.setBounds(10, 73, 323, 14);
		contentPane.add(lblAusgabe);
	}

	boolean allesAusgefuellt() {
		if (tfStueckzahl.getText().equals("") || tfStueckpreis.getText().equals("") || tfRabatt.getText().equals("")) {
			return false;
		} else
			return true;
	}

	void calc() {
		double stueckZahl, stueckPreis, Rabatt;
		stueckZahl = Double.parseDouble(tfStueckzahl.getText().replace(",", "."));
		stueckPreis = Double.parseDouble(tfStueckpreis.getText().replace(",", "."));
		Rabatt = Double.parseDouble(tfRabatt.getText().replace(",", "."));

		double erg = (stueckZahl * stueckPreis) - (stueckZahl * stueckPreis) * Rabatt / 100;
		DecimalFormat f = new DecimalFormat("#0.00");
		lblAusgabe.setText("Der EK beträgt: " + f.format(erg) + " €");
		
		tfStueckzahl.requestFocus(); // tf erhält Fokus
		tfStueckzahl.selectAll(); // Markiert den Eintrag

	}

}
