package annotationBug

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target
import org.junit.platform.commons.annotation.Testable

@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
//@Testable //Uncomment to show that IntelliJ does not show error although it is one in Groovy < 2.5
@interface MyTestable {
}
