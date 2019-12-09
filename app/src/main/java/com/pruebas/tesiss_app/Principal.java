package com.pruebas.tesiss_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class    Principal extends AppCompatActivity {
    List<Slider> sliderList;
    private ViewPager sliderpager;
    private TabLayout indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        sliderpager = findViewById(R.id.viewPager);
        indicator = findViewById(R.id.indicator_id);
        sliderList = new ArrayList<>();
        sliderList.add(new Slider(R.drawable.servicio_corte,"Cortes"));
        sliderList.add(new Slider(R.drawable.servicio_maquillaje,"Maquillaje"));
        sliderList.add(new Slider(R.drawable.servicio_peinado_boda_2,"Peinado"));
        sliderList.add(new Slider(R.drawable.servicio_tt_facial,"Tratamietno Facil"));
        sliderList.add(new Slider(R.drawable.servicio_corte,"Cortes"));

        SliderAdapter adapter = new SliderAdapter(this,sliderList);
        sliderpager.setAdapter(adapter);
        indicator.setupWithViewPager(sliderpager,true);

        Timer time=new Timer();
        time.scheduleAtFixedRate(new Principal.sliderTimer(),4000,6000);
    }

        class sliderTimer extends TimerTask{

            @Override
            public void run() {
                Principal.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (sliderpager.getCurrentItem()<sliderList.size() - 1){
                            sliderpager.setCurrentItem(sliderpager.getCurrentItem()+1);
                        }else {
                            sliderpager.setCurrentItem(0);
                        }
                    }
                });
            }
        }
    }


