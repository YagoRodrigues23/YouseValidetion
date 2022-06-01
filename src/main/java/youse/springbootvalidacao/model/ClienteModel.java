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
    @NotBlank(message = "Campo não informado")
    @Pattern(regexp = "^[A-Z]+(.)*", message = "Campo nome deve inciar com letra maiúscula")
    private String nome;
    @Email(message = "Campo inválido")
    @NotBlank(message = "Campo não informado")
    private String email;
    @CPF(message = "Campo inválido")
    @NotBlank(message = "Campo não informado")
    private String cpf;
    @NotBlank(message = "Campo não informado")
    @PlacaCarro(message = "Campo inválido")
    private String placaCarro;
}
