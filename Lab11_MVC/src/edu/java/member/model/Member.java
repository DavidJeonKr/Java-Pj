package edu.java.member.model;
// Model 클래스. VO(Value Object). DTO(Data Transfer Object)

public class Member {
	//filed
	private String memberId;
	private String memberPassword;
	//default 생성자
	public Member() {}
	//memberId, memberPassword 생성자
	public Member(String memberId, String memberPassword) {
//		super();
		super();
		this.memberId = memberId; //초기화
		this.memberPassword = memberPassword; //초기화
	}
	//getters & setters
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	
	@Override
	public String toString() {
		String info = "member{Id: " + memberId + ", Password: " + memberPassword + "}";
		
		
		return info;
	}
	

	
	
}
