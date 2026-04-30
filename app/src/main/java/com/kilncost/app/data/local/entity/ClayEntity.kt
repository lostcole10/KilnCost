package com.kilncost.app.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Clays")
data class ClayEntity(
    @PrimaryKey
    val id: String,
    val name: String,
    val pricePerLBCents: Int,


)
