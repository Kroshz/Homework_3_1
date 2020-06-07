package com.kroshz.homework_3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Date;

public class ActivityPressure extends AppCompatActivity {
    private static final String TAG = "MyAPP.Pressure";
    boolean tah = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);

        Init();
    }

    private void Init() {
        Button ch_tah = findViewById(R.id.ch_tah);
        ch_tah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tah = true;
            }
        });

        Button bt_savePressure =findViewById(R.id.bt_savePressure);
        bt_savePressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Нажата кнопка сохранить");
                EditText tv_pUp = findViewById(R.id.tv_pUp);
                EditText tv_pDown = findViewById(R.id.tv_pDown);
                EditText tv_pulse = findViewById(R.id.tv_pulse);
                EditText tv_date = findViewById(R.id.tv_date);
                EditText tv_time = findViewById(R.id.tv_time);

                String pUp = tv_pUp.getText().toString();
                String pDown = tv_pDown.getText().toString();
                String pulse = tv_pulse.getText().toString();
                String date = tv_date.getText().toString();
                String time = tv_time.getText().toString();

                if (pUp.length() == 0 | pDown.length() == 0 | pulse.length() == 0 | date.length() == 0 | time.length() == 0) {
                    Toast.makeText(ActivityPressure.this, "Введите данные", Toast.LENGTH_LONG).show();
                    Log.e(TAG, "Данные пустые");
                } else {
                    try {
                        int pUpInt = Integer.parseInt(pUp);
                        int pDownInt = Integer.parseInt(pDown);
                        int pulseInt = Integer.parseInt(pulse);
                        int dateInt = Integer.parseInt(date);
                        int timeInt = Integer.parseInt(time);
                        Pressure pressure = new Pressure(pUpInt, pDownInt, pulseInt, dateInt, timeInt, tah);
                        Toast.makeText(ActivityPressure.this, getString(R.string.String_save), Toast.LENGTH_LONG).show();
                        Log.i(TAG, "Данные давления сохранены");
                    } catch (Exception ex) {

                        Toast.makeText(ActivityPressure.this, getString(R.string.string_toastWrong), Toast.LENGTH_LONG).show();
                        Log.e(TAG, "Получено исключение", ex);
                    }
                }
            }
        });
        Button bt_pressureBack = findViewById(R.id.bt_pressureBack);
        bt_pressureBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Нажата кнопка назад");
                finish();
            }
        });

    }
}
