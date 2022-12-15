package LabTestjdbc1.HibernateSpring1.entities;

import java.util.Set;


import javax.persistence.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {

	private int cid;
	private String cname;
	private Set<String> plist;
}
