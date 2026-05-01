package com.kilncost.app.data.local.entity

import androidx.room.TypeConverter

class Converters {

    @TypeConverter
   fun fromPieceStatus(status: PieceStatus): String {
       return status.name
   }

    @TypeConverter
    fun toPieceStatus(status: String): PieceStatus{
        return PieceStatus.valueOf(status)
    }
}