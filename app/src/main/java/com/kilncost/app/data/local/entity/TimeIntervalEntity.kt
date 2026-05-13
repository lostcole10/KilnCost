package com.kilncost.app.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "TimeInterval")
data class TimeIntervalEntity(
    @PrimaryKey
    val id: String = UUID.randomUUID().toString(),
    val sessionID: String,
    val clockIn: Long = System.currentTimeMillis(),
    var clockOut: Long? = null,
    var durationMins: Int? = null,
    var isManual: Boolean = false

)
