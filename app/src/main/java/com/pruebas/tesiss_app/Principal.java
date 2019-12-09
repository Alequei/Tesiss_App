package com.pruebas.tesiss_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class    Principal extends AppCompatActivity {
    List<Slider> sliderList;
    private ViewPager sliderpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        sliderpager = findViewById(R.id.viewPager);
        sliderList = new ArrayList<>();
        sliderList.add(new Slider(R.drawable.servicio_corte,"Cortes"));
        sliderList.add(new Slider(R.drawable.servicio_maquillaje,"Maquillaje"));
        sliderList.add(new Slider(R.drawable.servicio_peinado_boda_2,"Peinado"));
        sliderList.add(new Slider(R.drawable.servicio_tt_facial,"Tratamietno Facil"));
        sliderList.add(new Slider(R.drawable.servicio_corte,"Cortes"));

        SliderAdapter adapter = new SliderAdapter(this,sliderList);
        sliderpager.setAdapter(adapter);
        }


    }


