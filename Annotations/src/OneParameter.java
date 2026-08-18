import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;

@Retention(RetentionPolicy.SOURCE)
@Target(PARAMETER)

public @interface OneParameter {

    int par();

}
