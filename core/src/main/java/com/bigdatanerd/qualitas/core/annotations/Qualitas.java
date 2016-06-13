package com.bigdatanerd.qualitas.core.annotations;


import com.bigdatanerd.qualitas.core.QualitasThreshold;
import com.bigdatanerd.qualitas.core.QualitasType;


/**
 * Created by ananth.durai on 6/13/16.
 */
public @interface Qualitas {

    QualitasType type() default QualitasType.NONE;
    String thresholdValue() default "";
    QualitasThreshold qualitasThreshold() default QualitasThreshold.NONE;

}
