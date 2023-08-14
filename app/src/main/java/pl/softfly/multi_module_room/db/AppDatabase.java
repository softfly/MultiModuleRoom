package pl.softfly.multi_module_room.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import pl.softfly.multi_module_room.dao.CardDao;
import pl.softfly.multi_module_room.entity.Card;

@Database(
        entities = {Card.class},
        version = 1
)
public abstract class AppDatabase extends RoomDatabase {
    public abstract CardDao cardDao();
}
