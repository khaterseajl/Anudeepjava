package cake1.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CakeDTO {
	
	@NotBlank(message="cake name can't be empty")
        @NotNull(message="Cake Name can't be null")
	String ckName;
	
	@NotBlank(message="Cake flavour can't be empty")
	@NotNull(message="Cake flavour can't be null")
	String ckFlavour;
	
	@Range(min=10,max=1000 , message="Cake price must be in between 10 to 50000")
	int ckPrice;
	          
	
	
}
