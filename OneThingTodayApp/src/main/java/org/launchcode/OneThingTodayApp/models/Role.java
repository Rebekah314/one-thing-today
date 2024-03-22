package org.launchcode.OneThingTodayApp.models;


import org.springframework.security.core.GrantedAuthority;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

//Role is the authority for each type of member
//TODO (future sprint) change Role to have ManyToMany relationship with Member

@Entity
public class Role implements GrantedAuthority{
	
	private static final long serialVersionUID = -5886705475524378649L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	private Member member;
	
	private String authority;
	
	
	
	
	public Role() {}
	
	

	public Role(String authority) {
		this.authority = authority;
	}



	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Member getMember() {
		return member;
	}
	
	public void setMember(Member member) {
		this.member = member;
	}
	
	@Override
	public String getAuthority() {
		return authority;
	}
	
	public void setAuthority(String authority) {
		this.authority = authority;
	}

	

}
