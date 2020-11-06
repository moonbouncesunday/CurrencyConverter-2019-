package currencyconverter;

import java.awt.Font;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.Locale;

public class CurrencyConversion {
	
	//currencies
	public static double usd = 0;
	public static double rup = 0; 
	public static double yen = 0;
	public static double euro = 0;
	
	//conversion factor from usd to the three other currencies
	public static double USDtoRup = 71.3447;
	public static double USDtoYen = 6.99812;
	public static double USDtoEuro = 0.900868;
	
	//conversion factor from the other currencies to usd
	public static double RuptoUSD = (1/USDtoRup);
	public static double YentoUSD = (1/USDtoYen);
	public static double EurotoUSD = (1/USDtoEuro);
	

public static double convert(double money, double conversionFactor) {
		
		double converted = money * conversionFactor;
		return converted;
	}


public static void printConversion(){

	JLabel labelU = new JLabel("Stuff");
	labelU.setFont(new Font("Arial", Font.BOLD, 28));;
	labelU.setText("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(usd));
	
	JLabel labelI = new JLabel("Stuff");
	labelI.setFont(new Font("Arial", Font.BOLD, 28));;
	labelI.setText("India: " + NumberFormat.getCurrencyInstance(new Locale("in","in")).format(rup));
	
	JLabel labelC = new JLabel("Stuff");
	labelC.setFont(new Font("Arial", Font.BOLD, 28));;
	labelC.setText("China: " + NumberFormat.getCurrencyInstance(Locale.CHINESE).format(yen));
	
	JLabel labelF = new JLabel("Stuff");
	labelF.setFont(new Font("Arial", Font.BOLD, 28));;
	labelF.setText("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(euro));
	
	JOptionPane.showMessageDialog(null, labelU);
	JOptionPane.showMessageDialog(null, labelI);
	JOptionPane.showMessageDialog(null, labelC);
	JOptionPane.showMessageDialog(null, labelF);
	
	
	//String usText = "US: " + NumberFormat.getCurrencyInstance(Locale.US).format(usd);
	//String inText = "India: " + NumberFormat.getCurrencyInstance(new Locale("in","in")).format(rup);
	//String chText = "China: " + NumberFormat.getCurrencyInstance(Locale.CHINESE).format(yen);
	//String frText = "France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(euro);
	
	
	//System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(usd));
	//System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("in","in")).format(rup));
	//System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINESE).format(yen));
	//System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(euro));

}


}

