package com.class5.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Field level Annotation
//This annotation declares one string parameter with the name "key"
//and Empty string as a default value

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface JsonElement {
	public String key() default "";
	
}
