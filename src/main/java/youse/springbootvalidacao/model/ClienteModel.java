package youse.springbootvalidacao.model;

import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;
import youse.springbootvalidacao.validation.constraints.PlacaCarro;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class ClienteModel {

    private String id;
    @NotBlank
    @Pattern(regexp = "^[A-Z]+(.)*")
    private String nome;
    @Email
    private String email;
    @CPF
    private String cpf;
    @NotBlank
    @PlacaCarro
    private String placaCarro;
}
