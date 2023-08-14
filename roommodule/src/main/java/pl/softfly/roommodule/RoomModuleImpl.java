package pl.softfly.roommodule;

import android.content.Context;

import androidx.room.Room;

import pl.softfly.multi_module_room.RoomModule;
import pl.softfly.multi_module_room.entity.Card;
import pl.softfly.roommodule.db.ModuleDatabase;

/**
 * @author Grzegorz Ziemski
 */
public class RoomModuleImpl implements RoomModule {

    private Context context;

    public RoomModuleImpl(Context context) {
        this.context = context;
    }

    public void insert() {
        ModuleDatabase db = Room.databaseBuilder(context, ModuleDatabase.class, "database-name")
                .allowMainThreadQueries()
                .build();

        db.cardDao().insert(new Card());
    }

}
