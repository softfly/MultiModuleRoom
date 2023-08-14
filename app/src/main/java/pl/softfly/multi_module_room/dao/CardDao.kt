package pl.softfly.multi_module_room.dao

import androidx.room.Dao
import androidx.room.Query

@Dao
abstract class CardDao {
    @Query("SELECT count(*) FROM Card")
    abstract fun count(): Int
}