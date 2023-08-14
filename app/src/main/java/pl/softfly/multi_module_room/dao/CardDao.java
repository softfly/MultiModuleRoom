package pl.softfly.multi_module_room.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public abstract class CardDao {
    @Query("SELECT count(*) FROM Card")
    public abstract int count();

}