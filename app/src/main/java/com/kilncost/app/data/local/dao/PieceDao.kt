package com.kilncost.app.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.kilncost.app.data.local.entity.PieceEntity
import com.kilncost.app.data.local.entity.PieceStatus
import kotlinx.coroutines.flow.Flow

@Dao
 interface PieceDao {

     @Insert
    suspend fun insertPiece(piece: PieceEntity) : Long

    @Update
    suspend fun updatePiece(piece: PieceEntity)

    @Delete
    suspend fun deletePiece(piece: PieceEntity)

    @Query("SELECT * FROM Piece")
    fun getAllPieces() : Flow<List<PieceEntity>>

    @Query("SELECT * FROM Piece WHERE id = :id")
    fun getPiece( id : String): Flow<PieceEntity>

    @Query("SELECT * FROM Piece WHERE status = :status")
    fun getAllPiecesByStatus (status: PieceStatus) : Flow<List<PieceEntity>>

    @Query("SELECT * FROM Piece WHERE category = :category")
    fun getAllPiecesByCategory(category: String): Flow<List<PieceEntity>>
}