package cake1.enities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Customer {

	@GeneratedValue
	@Id
	@Column(name="CustomerId")
	private int crid;
	
	@Column(name="CustomerName")
	private String crname;
	
	@Column(name="CustomerContact")
	private String crcontact;
	
	@Column(name="CustomerAddress")
	private String craddress;
	
	@Column(name="CustomerCity")
	private String crcity;
	
	@ManyToOne
	@JoinColumn(name="cake_id")
	private Cake cake;
	    
}
