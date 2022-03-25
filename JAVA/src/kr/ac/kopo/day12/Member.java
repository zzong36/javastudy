package kr.ac.kopo.day12;

import java.util.Objects;

public class Member {
	
	private String name;
	private String phone;

	public Member() {
	}

	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", phone=" + phone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}

	
	
	
	/*
//	public boolean equals(Object obj = new Member("홍길동", "010-1111-2222") 
	@Override
	public boolean equals(Object obj) {		// member 객체를 object로 쓴다. 
		
		if(obj == null) {
			return false;
		}
		Member m = (Member)obj;
		if(this.name !=null && !this.name.equals(m.name)) {
			return false;
		}
		
		if(this.phone !=null && !this.phone.equals(m.phone)) {
			return false;
		}
		
		return true;
	}
	
	
	 */
	
	

}
