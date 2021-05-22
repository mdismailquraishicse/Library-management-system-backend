package com.ismailquraishicse.librarymanagementsystem.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
		
	int bid;
	String btitle;
	String bauthor;
	double bprice;
	Date bissue;
	Date breturn;
	int brollno;
	public Book(@JsonProperty ("bid") int bid,
			@JsonProperty ("btitle") String btitle,
			@JsonProperty ("bauthor") String bauthor, 
			@JsonProperty ("bprice") double bprice,
			@JsonProperty ("bissue") Date bissue,
			@JsonProperty ("breturn") Date breturn,
			@JsonProperty ("brollno") int brollno
			) {
		super();
		this.bid = bid;
		this.btitle = btitle;
		this.bauthor = bauthor;
		this.bprice = bprice;
		this.bissue = bissue;
		this.breturn = breturn;
		this.brollno = brollno;
	}
	
	public Book() {}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public double getBprice() {
		return bprice;
	}
	public void setBprice(double bprice) {
		this.bprice = bprice;
	}

	public Date getBissue() {
		return bissue;
	}

	public void setBissue(Date bissue) {
		this.bissue = bissue;
	}

	public Date getBreturn() {
		return breturn;
	}

	public void setBreturn(Date breturn) {
		this.breturn = breturn;
	}

	public int getBrollno() {
		return brollno;
	}

	public void setBrollno(int brollno) {
		this.brollno = brollno;
	}
	
	
	
}

