package app.muhammed.com.androidlistviewwithcontextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

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

        registerForContextMenu(mContactListViewCompat);
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


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.list_item_menu,menu);
    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {


        switch (item.getItemId()) {
            case R.id.deleteMenu:
                Toast.makeText(this, "Delete clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.editMenu:
                Toast.makeText(this, "Edit clicked", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
        return super.onContextItemSelected(item);
    }
}
