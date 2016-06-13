package com.bigdatanerd.qualitas.core.model

import com.bigdatanerd.qualitas.core.QualitasType
import com.bigdatanerd.qualitas.core.annotations.{Qualitas, QualitasConstraints, QualitasProperty, QualitasEntity}


@QualitasEntity(entity = "review")
case class Review(@QualitasConstraints (qualitas = Array (new Qualitas(QualitasType.NONE), new Qualitas)) @QualitasProperty("review") reviewId : Long = 0,
                  reviewTitle : String = "", reviewText : String = "", rating : Int = 0) {

}
