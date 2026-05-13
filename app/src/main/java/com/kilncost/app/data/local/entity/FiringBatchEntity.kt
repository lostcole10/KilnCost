package com.kilncost.app.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate
import java.util.Date
import java.util.UUID


@Entity(tableName = "Firing Batch")
data class FiringBatchEntity(
    @PrimaryKey
    val id: String = UUID.randomUUID().toString(),
    val type: FiringType,
    var totalCostCents: Int,
    val date: LocalDate = LocalDate.now(),
    var costPerPieceCents: Int? = null,
    var isComplete: Boolean = false,
    val label: String? = null //optional
)
