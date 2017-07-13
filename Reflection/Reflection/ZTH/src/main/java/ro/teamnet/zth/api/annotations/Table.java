package ro.teamnet.zth.api.annotations;

import com.sun.deploy.security.ValidationState;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.Type;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Alexandra.Mihalcea on 7/12/2017.
 */
@Target(TYPE)
@Retention(RUNTIME)
public @interface Table {
    String name() default "";
}
