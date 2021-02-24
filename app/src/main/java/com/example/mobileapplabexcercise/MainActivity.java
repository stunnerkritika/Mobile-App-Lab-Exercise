package com.example.mobileapplabexcercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button btn_Toast ,btn_count;
    TextView txtcount;
    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Toast = findViewById(R.id.btn_toast);
        btn_count = findViewById(R.id.btn_count);
        txtcount = findViewById(R.id.txt_count);


        btn_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++mCount;
                if (txtcount != null)
                    txtcount.setText(Integer.toString(mCount));

            }
        });
    }

    public void showToast(View view) {
/// .....................
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG);

        toast.show();
    }
}


