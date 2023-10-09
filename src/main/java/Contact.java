
public class Contact {
	private String firstName, lastName;
	int id;
	private Email email;
	private Birthday bday;
	
	public Contact(String f, String l, Email e, Birthday b) {
		firstName = f;
		id = hashCode();
		lastName = l;
		email = e;
		bday = b;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public Birthday getBday() {
		return bday;
	}

	public void setBday(Birthday bday) {
		this.bday = bday;
	}

	@Override
	public String toString() {
		return "Contact [ID: " + id + "firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", bday=" + bday
				+ "]";
	}
}
