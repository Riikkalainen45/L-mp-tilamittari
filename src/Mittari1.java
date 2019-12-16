
	import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.AbstractButton;
	import javax.swing.JButton;
		import javax.swing.JFrame;
		import javax.swing.JTextArea;
	import javax.swing.JTextField;


public class Mittari1 implements ActionListener {

		
		JFrame ikkuna = new JFrame("Celsius to Fahrenheit");
		
		
		JTextField tekstikenttä = new JTextField("Celsius");

		
		
		JTextField syöte = new JTextField();
		

		JButton nappi = new JButton("Muunna");
		JTextField tulos =new JTextField();
				
					Mittari1(){
						
					ikkuna.setLayout(new GridLayout(2,2));	
						
					ikkuna.setSize(400,400);
					ikkuna.setLocation(500,500);
					
					
					ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					ikkuna.setVisible(true);
					
				
					nappi.addActionListener(this);
					
					ikkuna.add(tekstikenttä);
					ikkuna.add(syöte);
					ikkuna.add(nappi);
					ikkuna.add(tulos);
					ikkuna.pack();
					}			

		public void actionPerformed(ActionEvent e) {
		
			if (e.getSource()==nappi) {
				double c = Double.parseDouble(syöte.getText());
				double f= (c * 9/5+ 32);
				tulos.setText(" "+ f);
			}
		}
	}
				
				
