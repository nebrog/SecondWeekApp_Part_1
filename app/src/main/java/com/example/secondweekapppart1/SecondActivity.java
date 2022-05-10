package com.example.secondweekapppart1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.FragmentManager;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i("LifeCycle", "onCreateSecondActivity");

        Button button = findViewById(R.id.show_dialog);
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog();

            }
        };
        button.setOnClickListener(clickListener);
    }



    private void myDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(SecondActivity.this);
        builder.setTitle("Alert Dialog");
        builder.setMessage("Это всего лишь пример, не беспокойтесь)");
        builder.setPositiveButton("ОК", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LifeCycle", "onStartSecondActivity");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LifeCycle", "onResumeSecondActivity");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LifeCycle", "onPauseSecondActivity");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LifeCycle", "onStopSecondActivity");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LifeCycle", "onDestroySecondActivity");

    }


}