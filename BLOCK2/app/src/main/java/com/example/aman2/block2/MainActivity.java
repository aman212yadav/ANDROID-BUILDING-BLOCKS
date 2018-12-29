package com.example.aman2.block2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.list);
        final ArrayAdapter<CharSequence> arrayAdapter=ArrayAdapter.createFromResource(this,R.array.animalsList,android.R.layout.simple_list_item_1);
      listView.setAdapter(arrayAdapter);
      listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              String message=getString(R.string.toastMessage)+" "+arrayAdapter.getItem(position);
              Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
          }
      });
    }
}
