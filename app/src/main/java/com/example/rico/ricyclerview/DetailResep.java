package com.example.rico.ricyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailResep extends AppCompatActivity {

    ImageView gambarDetail;
    TextView resepDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail_resep);
        gambarDetail=(ImageView)findViewById(R.id.img_detail);
        resepDetail=(TextView)findViewById(R.id.detail_resep);

        Intent obj = getIntent();

        int gambar = obj.getIntExtra("gambar", 0);
        gambarDetail.setImageResource(gambar);

        String detail = obj.getStringExtra("detail");
        resepDetail.setText(detail);
    }

}
