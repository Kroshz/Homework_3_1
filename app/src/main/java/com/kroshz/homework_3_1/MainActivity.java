package com.kroshz.homework_3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyAPP.Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init () {
        Button bt_saveMain = findViewById(R.id.bt_saveMain);
        bt_saveMain.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText tv_nameUser = findViewById(R.id.tv_nameUser);
            EditText tv_ageUser = findViewById(R.id.tv_ageUser);
            String nameUser = tv_nameUser.getText().toString();
            String ageUser = tv_ageUser.getText().toString();
            if (nameUser.length() == 0 | ageUser.length() == 0) {
                Toast.makeText(MainActivity.this, "Введите данные", Toast.LENGTH_LONG).show();
                Log.e(TAG, "Имя пользователя или возраст пустое");
            } else {

                try {
                    int ageUserInt = Integer.parseInt(ageUser);
                    User user = new User(nameUser, ageUserInt);
                    Toast.makeText(MainActivity.this, getString(R.string.String_save), Toast.LENGTH_LONG).show();
                    Log.i(TAG, "Данные давления сохранены");
                } catch (Exception ex) {
                    Toast.makeText(MainActivity.this, getString(R.string.string_toastWrong), Toast.LENGTH_LONG).show();
                    Log.e(TAG, "Получено исключение", ex);
                }
            }
        }
        });

        Button bt_activityLife = findViewById(R.id.bt_activityLife);
        bt_activityLife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityLife.class);
                startActivity(intent);
            }
        });

        Button bt_activityPr = findViewById(R.id.bt_activityPr);
        bt_activityPr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityPressure.class);
                startActivity(intent);
            }
        });
    }
}
