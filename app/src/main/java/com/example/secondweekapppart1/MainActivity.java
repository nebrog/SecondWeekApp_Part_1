package com.example.secondweekapppart1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Примеры использования ЖЦ в приложениях:
    //ВКонтаке, если слушать музыку и свернуть приложение,она выключиться(без подписки)
    //Youtube такое же поведение как и в приложении ВКонтакте
    //Яндекс.Карты приложение отслеживает геопозицию при следовании по указанному маршруту
    
    // Если пользователь работает с определённым окном,
    // система даёт приоритет соответствующему приложению.
    // И наоборот, если окно невидимо и система решает,
    // что работу приложения необходимо остановить,
    // чтобы мобилизовать дополнительные ресурсы,
    // будет прекращена работа приложения,
    // имеющего более низкий приоритет.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("LifeCycle","onCreateFirstActivity");
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.go_to_second);
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                MainActivity.this.startActivity(intent);
            }
        };
        button.setOnClickListener(clickListener);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LifeCycle","onStartFirstActivity");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LifeCycle","onResumeFirstActivity");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LifeCycle","onPauseFirstActivity");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LifeCycle","onStopFirstActivity");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LifeCycle","onDestroyFirstActivity");

    }
}