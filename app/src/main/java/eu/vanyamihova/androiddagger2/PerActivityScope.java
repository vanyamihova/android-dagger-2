package eu.vanyamihova.androiddagger2;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 19.04.2019
 */
@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivityScope {
}
