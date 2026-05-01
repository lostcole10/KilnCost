package com.kilncost.app.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity
data class PieceEntity(
    @PrimaryKey
    val id: String = UUID.randomUUID().toString(),
    val name: String,                                       // required
    val category: String,                                   // required
    var status: PieceStatus = PieceStatus.IN_PROGRESS,
    val clayTypeId: String? = null,
    val clayWeightLbs: Float? = null,
    var totalLaborMins: Int = 0,
    var bisqueFiringCost: Int? = null,
    var bisqueBatchId: String? = null,
    var glazeFiringCost: Int? = null,
    var glazeBatchId: String? = null,
    var photoThrown: String? = null,
    var photoPostBisque: String? = null,
    var photoGlazed: String? = null,
    var photoFinished: String? = null,
    var notes: String? = null,
    var setId: String? = null,
    var sellingPrice: Int? = null,                          // should be nullable
    var soldPrice: Int? = null,                             // Int not Long
    var soldAt: Long? = null,                               // missing from yours
    val createdAt: Long = System.currentTimeMillis(),
    var updatedAt: Long = System.currentTimeMillis()
)

