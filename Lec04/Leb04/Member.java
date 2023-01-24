package Lec04.Leb04;

public class Member {
    private String username;
	private String password;
	private String name;
	private String address;
	private String mobile;
	private String email;
	
	
	
	public Member() {
		username = null;
		password = null;
		name = null;
		address = null;
		mobile = null;
		email = null;
	}

	public Member(String username,String password, String name, String address, String mobile, String email) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
