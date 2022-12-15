package LabTestjdbc1.HibernateSpring1.entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

	private int pid;
	private String pname;
	private int pprice;
}
