package cake1.enities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity

public class Cake {

	@Id
	@GeneratedValue
	@Column(name="Id")
	private int ckid;
	
	@Column(name="Price")
	private int ckprice;
	
	@Column(name="Name")
	private String ckname;
	
	@Column(name="Flavour")
	private String ckflavour;
	
	@OneToMany(mappedBy="cake",cascade=CascadeType.ALL)
	private List<Customer>clist;
  
}
