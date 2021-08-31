package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    //@NotEmpty
    //@Size(min = 2, max = 100)
    private String firstName;

    //@NotEmpty
    //@Size(min = 2, max = 100)
    private String lastName;

    //@NotEmpty
    //@CPF
    private String cpf;

    private String birthDate;

    //@Valid
    //@NotEmpty
    private List<PhoneDTO> phone;
}
