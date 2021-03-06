package com.dragonsoft.reflectanno.application_orm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**  
 * 加在字段上的注解
 * @author ronin  
 * @date 2019年3月24日  
 */

@Target(value=ElementType.FIELD)
@Retention(value=RetentionPolicy.RUNTIME)
public @interface Column {
	String cloumnName();
	String dadaType();
	int length();
}
