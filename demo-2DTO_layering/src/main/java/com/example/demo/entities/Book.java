package com.example.demo.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity

public class Book {

	@Id	
	@Column(name="Book_Id")
	private int bId;
	
	@Column(name="Book_Name")
	private String bBookName;
	
	@Column(name="Book_price")
	private int bPrice;
	
	@Column(name="Book_Authorname")
	private String bAuthorName;
	

  

	
	
}