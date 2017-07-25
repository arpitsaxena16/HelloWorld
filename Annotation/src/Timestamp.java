import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by katkhedd on 7/24/2017.
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
@interface Timestamp {
    Day day();
    Month month();
    Year year();
}
