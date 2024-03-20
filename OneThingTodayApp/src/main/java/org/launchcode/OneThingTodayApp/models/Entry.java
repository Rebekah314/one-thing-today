package org.launchcode.OneThingTodayApp.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class Entry {
	
	private long id;
	
	private LocalDate date;
	
	private String text;
	
	private String status;
	
	private String tag;
	
	private Member author;
	
	private Member accountabilityPartner;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Member getAuthor() {
		return author;
	}

	public void setAuthor(Member author) {
		this.author = author;
	}

	public Member getAccountabilityPartner() {
		return accountabilityPartner;
	}

	public void setAccountabilityPartner(Member accountabilityPartner) {
		this.accountabilityPartner = accountabilityPartner;
	}
	
	
	

}
