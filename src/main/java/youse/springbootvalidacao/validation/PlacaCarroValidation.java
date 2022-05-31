package youse.springbootvalidacao.validation;

import youse.springbootvalidacao.validation.constraints.PlacaCarro;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PlacaCarroValidation implements ConstraintValidator<PlacaCarro, String> {

    @Override
    public void initialize(PlacaCarro constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        String placa = value == null ? "" : value;
        return placa.matches("[a-zA-Z]{3}[0-9][A-Za-z0-9][0-9]{2}");
    }
}
