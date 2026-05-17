package com.kilncost.app.data.local.dao

import android.se.omapi.Session
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.kilncost.app.data.local.entity.SessionEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SessionDao {

    @Insert
    suspend fun insertSession(session: SessionEntity) : Long

    @Delete
    suspend fun deleteSession(session: SessionEntity)

    @Update
    suspend fun updateSession(session: SessionEntity)

   @Query("SELECT * FROM Session")
   fun getAllSessions() : Flow<List<SessionEntity>>

   @Query("SELECT * FROM Session WHERE  status = 'ACTIVE'")
   fun getActiveSession() : Flow<SessionEntity?>

    // TODO: PieceTimeAllocation portion




}