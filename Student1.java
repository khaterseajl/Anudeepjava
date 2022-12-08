package LabTestjdbc1.LabTestonStudent.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="Student_details")
@Entity


public class Student1 {

	@Id
	@GeneratedValue
	
	@Column(name="St_id")
	private int sid;
	
	@Column(name="St_name",length=50,nullable=false)
	private String sname;
	
	@Column(name="St_conts",length=10,nullable=false,unique=true)
    private String Contacts;
}	

