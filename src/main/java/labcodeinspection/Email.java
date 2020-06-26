package labcodeinspection;
public class Email {
	

	private String mfirstName; 
	private String mlastName;
	private String password = null;
	private String department;
	private int defaultpasswordLength = 8;
	private String email;

	public Email(String firstName, String lastName) {
		this.mfirstName = firstName;
		this.mlastName = lastName;
	}

	public void showInfo() {
		System.out.println("\nFIRST NAME= " + mfirstName + "\nLAST NAME= " + mlastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}

	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		}
	}

	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}

	public void generateEmail() {
		this.password = this.randomPassword(this.defaultpasswordLength);
		this.email = this.mfirstName.toLowerCase() + this.mlastName.toLowerCase() + "@" + this.department
				+ ".espol.edu.ec";
	}

	public String getM_firstName() {
		return mfirstName;
	}

	public void setM_firstName(String m_firstName) {
		this.mfirstName = m_firstName;
	}

	public String getM_lastName() {
		return mlastName;
	}

	public void setM_lastName(String m_lastName) {
		this.mlastName = m_lastName;
	}

	public int getDefaultpasswordLength() {
		return defaultpasswordLength;
	}

	public void setDefaultpasswordLength(int defaultpasswordLength) {
		this.defaultpasswordLength = defaultpasswordLength;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
