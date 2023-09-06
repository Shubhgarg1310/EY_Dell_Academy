package com.class5.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//First step toward creating the custom annotation is to declare
//using keyword @interface
//Next to add meta data - Runtime Visibility - Type means it can 
//apply to classes
//This class has no method so will mark as marker interface
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface JsonSerializable {
	
}
