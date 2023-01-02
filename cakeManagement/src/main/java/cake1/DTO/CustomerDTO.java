package cake1.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CustomerDTO {

       @NotBlank(message="Customer Name couldn't be empty")
       @NotNull(message="Customer Name couldn't be null")
       String crName;
	
       @NotNull(message="Customer Contact couldn't be null")
       @Pattern(regexp = "\\d{10}$", message = " Invalid phone number ")
       @Size(max=10 , message="Customer Contact size not less than 10")
       String crContact;
   
       @NotBlank(message="Customer Address couldn't be empty")
       @NotNull(message="Customer Address couldn't be null") 
       String crAddress;
    
	@NotBlank(message="Customer city couldn't be empty")
	@NotNull(message="Customer city couldn't be null")
	String crCity;
}
