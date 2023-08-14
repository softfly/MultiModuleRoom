package pl.softfly.roommodule.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import pl.softfly.multi_module_room.entity.Card;
import pl.softfly.roommodule.dao.ModuleCardDao;

@Database(
        entities = {Card.class},
        version = 1
)
public abstract class ModuleDatabase extends RoomDatabase {
    public abstract ModuleCardDao cardDao();
}
