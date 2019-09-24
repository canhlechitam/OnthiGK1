package com.example.student.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivityB extends AppCompatActivity {
    TextView ketqua;
    Button thoat;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainb);
        ketqua=(TextView) findViewById(R.id.textView_kq);
        thoat=(Button)findViewById(R.id.button_thoat);

        String ht=getIntent().getExtras().getString("hoten");
        int ns =Integer.parseInt(getIntent().getExtras().getString("namsinh"));

        Calendar calendar= Calendar.getInstance();
        int tuoi=(calendar.getTime().getYear()+1900)-ns;
        ketqua.setText("Ket qua"+'\n'+"Ho ten :"+ ht +'\n'+ "Nam Sinh : "+ ns + '\n'+ "Tuoi:"+tuoi);
        thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
