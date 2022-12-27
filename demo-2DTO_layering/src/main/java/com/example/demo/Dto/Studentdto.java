package com.example.demo.Dto;

import java.util.Date;

import javax.validation.constraints.Email;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import com.example.demo.entities.Student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Studentdto {

	@Range(min=10,max=1000 , message="Student id must be between 10 to 1000")
	int sId;
	
	@NotBlank(message="Student Name couldn't be empty")
	@NotNull(message="Student Name couldn't be null")
	@Size(min=4,max=10,message="Student Name must be in between 4-10 chars")
	String sName;
	
    @NotNull(message="Student Contact couldn't be null")
    @Pattern(regexp = "\\d{10}$", message = " Invalid phone number ")
    @Size(max=10 , message="Student Contact size not less than 10")
    String sContact;
   
	@NotBlank(message="Department Name couldn't be empty")
	@NotNull(message="Department  Name  couldn't be null")
	@Size(max=12 ,message="Department Name not less than 12 ")
	String sDepartment;

	@NotBlank(message="Email couldn't be empty")
	@NotNull(message="Email couldn't be null")
	@Pattern(regexp = "^(.+)@(.+)$", message = " Invalid Email please enter Valid Mailid.... ")
	@Email(message="Please enter a Valid Email")
	String sEmail;
	
	
	/*@DateTimeFormat(pattern="dd/mm/yyyy")
	@NotNull(message="Date/Time couldn't be null")
	Date datetime;
	*/
	
}
