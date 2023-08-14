package pl.softfly.roommodule.dao;

import androidx.room.Dao;
import androidx.room.Insert;

import pl.softfly.multi_module_room.dao.CardDao;
import pl.softfly.multi_module_room.entity.Card;

@Dao
public abstract class ModuleCardDao extends CardDao {
    @Insert
    public abstract Long insert(Card card);

}
