import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by katkhedd on 7/25/2017.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE,ElementType.METHOD})
@interface Company {
    String name();
    String location();
}