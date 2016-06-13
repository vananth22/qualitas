package com.bigdatanerd.qualitas.core.annotations;


import com.bigdatanerd.qualitas.core.QualitasThreshold;
import com.bigdatanerd.qualitas.core.QualitasType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface Qualitas {

    QualitasType qualitasType() default QualitasType.NONE;
    String thresholdValue() default "";
    QualitasThreshold qualitasThreshold() default QualitasThreshold.NONE;

}
