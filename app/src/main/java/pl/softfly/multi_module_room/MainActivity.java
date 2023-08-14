package pl.softfly.multi_module_room;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import pl.softfly.multi_module_room.db.AppDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        RoomModule.getInstance(this).insert();
        TextView count = (TextView) findViewById(R.id.count);

        AppDatabase db = Room.databaseBuilder(
                        getApplicationContext(),
                        AppDatabase.class,
                        "database-name")
                .allowMainThreadQueries()
                .build();
        count.setText(String.valueOf(db.cardDao().count()));
    }
}