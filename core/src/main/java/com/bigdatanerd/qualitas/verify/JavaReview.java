package com.bigdatanerd.qualitas.verify;


import com.bigdatanerd.qualitas.core.annotations.Qualitas;
import com.bigdatanerd.qualitas.core.annotations.QualitasConstraints;
import com.bigdatanerd.qualitas.core.annotations.QualitasEntity;
import com.bigdatanerd.qualitas.core.annotations.QualitasProperty;

/**
 * Created by ananth.durai on 6/11/16.
 */

@QualitasEntity(entity = "Review")
public class JavaReview {

    @QualitasProperty(name = "id")
    @QualitasConstraints(qualitas = {@Qualitas(), @Qualitas()})
    private String id;


}
