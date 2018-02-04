package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="member")
public class MemberBean {
    
	@Id
	private String member_id;
	private String member_name;
	private byte[] member_password;
	private String member_email;
	
	
	@Override
	public String toString() {
		return "MemberBean [member_id=" + member_id + ", member_name=" + member_name + ", member_password="
				+ member_password + ", member_email=" + member_email + "]";
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public byte[] getMember_password() {
		return member_password;
	}
	public void setMember_password(byte[] member_password) {
		this.member_password = member_password;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	
	
}

