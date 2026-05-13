package com.kilncost.app.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "Piece Time Allocation")
data class PieceTimeAllocationEntity(
    @PrimaryKey
    val id: String = UUID.randomUUID().toString(),
    val sessionId: String,
    val pieceId: String,
    var allocatedMins: Int = 0,
    var isOverridden: Boolean = false
)