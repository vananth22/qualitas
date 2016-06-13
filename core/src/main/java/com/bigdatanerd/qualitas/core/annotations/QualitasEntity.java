package com.bigdatanerd.qualitas.core.annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
public @interface QualitasEntity {

    // Name of the entity
    String entity();

    /*
    Flag to indicate whether the quality check need to run against sample set of data or full set of data.
    By default it's true. Annotating it as a false will run the quality check against entire data sets.
     */
    boolean isApprox() default true;

    /* If approximation set to true, sample size annotate what is size of the sample to run with.
        By default it's 60.0
        Note: sampleSize will not be considered if isApprox been set to false
     */
    double sampleSize() default 60.0;

}
