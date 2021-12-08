package com.example.gankdrama2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import com.example.gankdrama2.model.Drama;

public class DaftarDramaActivity extends AppCompatActivity {
    public final static String DRAMA_TERPILIH ="drama_obj_key";
    List<Drama> dramas;
    ListView listView;
    String genreDrama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_drama);
        Intent intent = getIntent();
        genreDrama = intent.getStringExtra(MainActivity.GENRE_GALERI_KEY);
        TextView txGenre = findViewById(R.id.text_title_daftar);
        txGenre.setText("Daftar Drama "+genreDrama.toUpperCase());
        dramas = DataProvider.getDramaByGenre(this,genreDrama);
        setupListView();
    }

    private void setupListView() {
        listView = findViewById(R.id.listview_daftar_drama);
        DaftarDramaAdapter adapter = new DaftarDramaAdapter(this,dramas);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onListClik);
    }

    private AdapterView.OnItemClickListener onListClik = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            Drama terpilih = dramas.get(position);
            bukaRincianDrama(terpilih);
        }
    };

    private void bukaRincianDrama(Drama dramaTerpilih) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this,RincianDramaActivity.class);
        intent.putExtra(DRAMA_TERPILIH,dramaTerpilih);
        startActivity(intent);
    }


}