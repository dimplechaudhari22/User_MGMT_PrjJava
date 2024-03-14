package in.UserMgmt.binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class User {

	private String fullname;
	private String email;
	
	private Long mobile;
	
	private String gender;
	 
	private LocalDate dob;
	 
	private Long Ssn;

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Long getSsn() {
		return Ssn;
	}

	public void setSsn(Long ssn) {
		Ssn = ssn;
	}

	
}
