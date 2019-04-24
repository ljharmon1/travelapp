package edu.bumgarner.jacktravel;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String [ ] attraction={"Bradford Beach", "Arboretum", "Atwater Beach", "Hubbard Park"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.icon, attraction));

    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://bradfordbeachmke.com/main.html")));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, arboretum.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, atwater.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, hubbard.class));
                break;
        }
    }







}

