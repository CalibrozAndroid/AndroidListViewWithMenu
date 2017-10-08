package app.muhammed.com.androidlistviewwithcontextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListViewCompat mContactListViewCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setUI();
    }

    private void setUI() {
        mContactListViewCompat = (ListViewCompat) findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, android.R.id.text1,getAllContact());

        mContactListViewCompat.setAdapter(adapter);
    }

    private ArrayList<String> getAllContact() {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("test");
        strings.add("test");
        strings.add("test");
        strings.add("test");
        strings.add("test");
        strings.add("test");
        strings.add("test");
        strings.add("test");
        strings.add("test");
        strings.add("test");
        return strings;
    }
}
