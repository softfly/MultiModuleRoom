package pl.softfly.multi_module_room;

import android.content.Context;

import androidx.annotation.Nullable;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Grzegorz Ziemski
 */
public interface RoomModule {

    @Nullable
    static RoomModule getInstance(Context context) {
        try {
            return (RoomModule) Class.forName("pl.softfly.roommodule.RoomModuleImpl")
                    .getConstructor(new Class[]{Context.class})
                    .newInstance(context);
        } catch (ClassNotFoundException e) {
            return null;
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    void insert();

}
