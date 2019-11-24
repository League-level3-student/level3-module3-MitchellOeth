package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String a = "";
		for (int i = s.length();  i > 0; i--) {
			a += s.substring(i);
		}
		s = a;
		return s;
	}
}
