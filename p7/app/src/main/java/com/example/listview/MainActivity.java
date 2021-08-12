package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lvItem;
    private String[] namaNegara = new String[]{
            "Indonesia","Malaysia", "Singapore",
            "Italia", "Inggris", "Belanda",
            "Argentina", "Chile",
            "Mesir", "Uganda"};
    private String[] ibukota =new String[]{
            "Jakarta", "Kuala Lumpur", "Singapore",
            "Roma", "London", "Amsterdam",
            "Buenos Aires", "Santiago, Chili",
            "Kairo", "Kampala"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("ListView Sederhana"); //tampil judul
        lvItem = (ListView)findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (MainActivity.this, R.layout.negara_view, R.id.textNegara, namaNegara);
        //menset data didalam listview
        lvItem.setAdapter(adapter);
        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Negara yang dipilih : " + namaNegara[position] + ", ibukotanya "+ibukota[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}