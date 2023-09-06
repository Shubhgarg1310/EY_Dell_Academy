package com.class5.Annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Another Method level Annotation
//Let's imagine before serializing the object to a JSON String,
//we want to execute one method to initialize an object


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface Init {

}
