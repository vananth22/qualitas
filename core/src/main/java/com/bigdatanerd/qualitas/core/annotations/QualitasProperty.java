package com.bigdatanerd.qualitas.core.annotations;

/**
 * Created by ananth.durai on 6/13/16.
 */
public @interface QualitasProperty {

    String name() default "qualitasProperty";




     @interface constraints {

         String constraint();
         String threshold();
    }

}
