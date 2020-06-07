package com.kroshz.homework_3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityLife extends AppCompatActivity {
    private static final String TAG = "MyAPP.Life";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life);

        Init();
    }
    private void Init() {
        Button bt_saveLife = findViewById(R.id.bt_saveLife);
        bt_saveLife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Нажата кнопка сохранить");
                EditText tv_weight = findViewById(R.id.tv_weight);
                EditText tv_steps = findViewById(R.id.tv_steps);

                String weight = tv_weight.getText().toString();
                String steps = tv_steps.getText().toString();
                if (weight.length() == 0 | steps.length() == 0) {
                    Toast.makeText(ActivityLife.this, "Введите данные", Toast.LENGTH_LONG).show();
                    Log.e(TAG, "Данные пустые");
                } else {
                    try {
                        int weightInt = Integer.parseInt(weight);
                        int stepsInt = Integer.parseInt(steps);
                        Life life = new Life(weightInt, stepsInt);
                        Toast.makeText(ActivityLife.this, getString(R.string.String_save), Toast.LENGTH_LONG).show();
                        Log.i(TAG, "Данные давления сохранены");
                    } catch (Exception ex) {
                        Toast.makeText(ActivityLife.this, getString(R.string.string_toastWrong), Toast.LENGTH_LONG).show();
                        Log.e(TAG, "Получено исключение", ex);
                    }
                }
            }
        });

        Button bt_lifeBack = findViewById(R.id.bt_lifeBack);
        bt_lifeBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Нажата кнопка назад");
                finish();
            }
        });
    }
}
