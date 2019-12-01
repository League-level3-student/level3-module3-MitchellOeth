package _00_Text_Funkifier;

import javax.swing.JOptionPane;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String a = "";
		for (int i = s.length();  i > 0; i--) {
			a += s.substring(i - 1, i);
			//System.out.println(a);
		}
		s = a;
		//JOptionPane.showMessageDialog(null, s);
		return s;
	}
} 
