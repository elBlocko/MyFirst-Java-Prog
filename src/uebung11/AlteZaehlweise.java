package uebung11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

public class AlteZaehlweise extends JFrame {

	private JPanel contentPane;
	private JTextField tfEingabe;
	JLabel lblAusgabeSchock;
	JLabel lblAusgabeDutzend;
	JLabel lblAusgabeStueck;
	JLabel lblAusgabeGros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlteZaehlweise frame = new AlteZaehlweise();
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
	public AlteZaehlweise() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 226);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnEnde = new JButton("Ende");
		btnEnde.setBounds(228, 137, 89, 23);
		contentPane.add(btnEnde);

		lblAusgabeGros = new JLabel(" . . . ");
		lblAusgabeGros.setBounds(10, 66, 46, 14);
		contentPane.add(lblAusgabeGros);

		JLabel lblAufforderung = new JLabel("Geben Sie eine St\u00FCckzahl an:");
		lblAufforderung.setBounds(10, 11, 126, 14);
		contentPane.add(lblAufforderung);

		tfEingabe = new JTextField();
		tfEingabe.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						fillLabels(); // Enter was pressed. Your code goes here.
					} // Enter was pressed. Your code goes here.
			
			}
		});
		tfEingabe.setColumns(10);
		tfEingabe.setBounds(10, 36, 86, 20);
		contentPane.add(tfEingabe);

		JButton btnInAlteZhlmae = new JButton("in alte Z\u00E4hlma\u00DFe umrechnen");
		btnInAlteZhlmae.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fillLabels();
			}

		});
		btnInAlteZhlmae.setBounds(106, 36, 211, 23);
		contentPane.add(btnInAlteZhlmae);

		lblAusgabeSchock = new JLabel(" . . . ");
		lblAusgabeSchock.setBounds(10, 91, 46, 14);
		contentPane.add(lblAusgabeSchock);

		lblAusgabeDutzend = new JLabel(" . . . ");
		lblAusgabeDutzend.setBounds(10, 116, 46, 14);
		contentPane.add(lblAusgabeDutzend);

		lblAusgabeStueck = new JLabel(" . . . ");
		lblAusgabeStueck.setBounds(10, 141, 46, 14);
		contentPane.add(lblAusgabeStueck);
	}

	private void fillLabels() {
		int gros, schock, dutzend;
		int stueck = Integer.parseInt(tfEingabe.getText());
		gros = stueck / 144;
		stueck = stueck % 144;
		schock = stueck / 60;
		stueck = stueck % 60;
		dutzend = stueck / 12;
		stueck = stueck % 12;

		lblAusgabeGros.setText(gros + " Gros");
		lblAusgabeSchock.setText(schock + " Schock");
		lblAusgabeDutzend.setText(dutzend +"Dutzend");
		lblAusgabeStueck.setText(stueck +" Stueck");

		tfEingabe.requestFocus(); // tf erhält Fokus
		tfEingabe.selectAll(); // Markiert den Eintrag
	}

}
