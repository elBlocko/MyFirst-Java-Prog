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
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class ZollZentimeter extends JFrame {

	private JPanel contentPane;
	private JTextField tfZoll;
	private JLabel lblAusgabe;
	private JLabel lblCm;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZollZentimeter frame = new ZollZentimeter();
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
	public ZollZentimeter() {
		setTitle("Zoll in Zentimeter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 274, 161);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfZoll = new JTextField();
		tfZoll.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					umrechnen(); // Enter was pressed. Your code goes here.
				}
			}
		});
		tfZoll.setColumns(10);
		tfZoll.setBounds(10, 11, 86, 20);
		contentPane.add(tfZoll);
		
		lblAusgabe = new JLabel(" . . . ");
		lblAusgabe.setBounds(10, 42, 86, 14);
		contentPane.add(lblAusgabe);
		
		JButton btnUmrechnen = new JButton("umrechnen");
		btnUmrechnen.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnUmrechnen.setForeground(new Color(0, 0, 0));
		btnUmrechnen.setBackground(SystemColor.window);
		btnUmrechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				umrechnen();
			}

		
		});
		btnUmrechnen.setBounds(10, 67, 126, 23);
		contentPane.add(btnUmrechnen);
		
		JButton btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(146, 68, 89, 23);
		contentPane.add(btnEnde);
		
		JLabel lblZoll = new JLabel("Zoll");
		lblZoll.setBounds(109, 14, 126, 14);
		contentPane.add(lblZoll);
		
		lblCm = new JLabel("cm");
		lblCm.setBounds(109, 42, 126, 14);
		contentPane.add(lblCm);
	}

	private void umrechnen() {
		double zoll = Double.parseDouble(tfZoll.getText().replace(",", "."));
		double cm;		
		cm = zoll * 2.54;
		DecimalFormat f = new DecimalFormat("#0.00");
		lblAusgabe.setText(f.format(cm));
		tfZoll.requestFocus(); // tf erhält Fokus
		tfZoll.selectAll(); // Markiert den Eintrag
	}
}
