package main.anotacao;


import java.lang.annotation.*;

/**
 * @author roberto.dinamite
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}