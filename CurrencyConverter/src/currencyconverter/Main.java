package currencyconverter;

import java.awt.Font;
import javax.swing.*;

public class Main extends CurrencyConversion{

	public static void main(String[] args) {
		
		//JOptionPane message = new JOptionPane("Test");
		//message.showInputDialog("Please enter: ");
		
		JLabel label1 = new JLabel("Please enter payment amount: ");//input message for payment
		label1.setFont(new Font("Arial", Font.BOLD, 28));;
		
		JLabel label2 = new JLabel("Please enter country: ");//input message for country
		label2.setFont(new Font("Arial", Font.BOLD, 28));;
		
		double payment = Double.parseDouble(JOptionPane.showInputDialog(null, label1, ""));//sets variable payment to user input
		String country = JOptionPane.showInputDialog(null, label2, "");//sets variable country to user input
		
		//System.out.println("Input payment and country: ");

		//Scanner sc = new Scanner(System.in);
		//double payment = sc.nextDouble();
		//String country = sc.next();
		//sc.close();
		
		//conversion
		switch (country) {
			case "US" : usd = payment;
						rup = convert(payment, USDtoRup);
						yen = convert(payment, USDtoYen);
						euro = convert(payment, USDtoEuro);
						printConversion();
				break;
			case "India" : rup = payment;
						usd = convert(payment, RuptoUSD);
						yen = convert(usd, USDtoYen);
						euro = convert(usd, USDtoEuro);
						printConversion();
				break;
			case "China" : yen = payment;
						usd = convert(payment, YentoUSD);
						rup = convert(usd, USDtoRup);
						euro = convert(usd, USDtoEuro);
						printConversion();
				break;
			case "France" : euro = payment;
							usd = convert(payment, EurotoUSD);
							yen = convert(usd, USDtoYen);
							rup = convert(usd, USDtoRup);
						printConversion();
				break;

		}

	}

}
