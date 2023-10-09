
public class Email {
	private String firstName, lastName, organization, domain;
	private int number;
	
	//Construct an email given first name, last name, organization, and domain
	public Email(String f, String l, String o, String d) {
		firstName = f;
		lastName = l;
		organization = o;
		domain = d;
		number = (int)(Math.random()*10)+1;
	}
	
	//Construct an email given first name, last name, organization, domain, and number
	public Email(String f, String l, String o, String d, int n) {
		firstName = f;
		lastName = l;
		organization = o;
		domain = d;
		number = n;
	}
	
	@Override
	public String toString() {
		return lastName.charAt(0)+firstName+number+'@'+organization+'.'+domain;
	}
}
