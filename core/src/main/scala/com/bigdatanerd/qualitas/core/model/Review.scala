package com.bigdatanerd.qualitas.core.model

import com.bigdatanerd.qualitas.core.QualitasType
import com.bigdatanerd.qualitas.core.annotations.{Qualitas, QualitasConstraints, QualitasProperty, QualitasEntity}


@QualitasEntity(entity = "review")
case class Review(@QualitasProperty(name = "review") @QualitasConstraints (qualitas = Array (new Qualitas(qualitasType = QualitasType.NONE), new Qualitas)) reviewId : Long = 0,
                  reviewTitle : String = "", reviewText : String = "", rating : Int = 0) {

}
