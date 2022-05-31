package youse.springbootvalidacao.validation.constraints;

import youse.springbootvalidacao.validation.PlacaCarroValidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PlacaCarroValidation.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PlacaCarro {

    String message() default "Placa inválida";
    Class<?>[] groups() default {};
    Class<? extends Payload> [] payload() default {};
}
