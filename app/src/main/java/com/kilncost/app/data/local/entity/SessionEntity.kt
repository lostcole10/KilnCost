package com.kilncost.app.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "Session")
data class SessionEntity(
    @PrimaryKey
    val id: String = UUID.randomUUID().toString(),
    var label: String? = null, //used for short notes e.g trimming, etc.
    var status: SessionStatus = SessionStatus.ACTIVE,
    var totalMins: Int = 0


)
