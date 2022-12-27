package com.example.demo.entities;

import java.util.Date;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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

public class Student {
	
	@Id
	@GeneratedValue
	
	@Column(name="Student_Id")
	private int sId;
	
	@Column(name="Student_Name")
	private String sName;
	
	@Column(name="Student_Contact")
	private String sContact;
	
	@Column(name="Student_Email")
    private String sEmail;
	
	@Column(name="Student_Department")
    private String sDepartment;
	
    
    @OneToMany(targetEntity=Book.class,cascade=CascadeType.ALL)
    @JoinColumn(name="bId")
    private List<Book>booklist;
    
    /*@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="date")
    private String date;

    
   /* @OneToOne
	private String date;*/
    
}