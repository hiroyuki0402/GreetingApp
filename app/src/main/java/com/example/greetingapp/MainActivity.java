package com.example.greetingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button doneButton;
    EditText inputed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doneButton = findViewById(R.id.doneButton);
        inputed = findViewById(R.id.editTextText);

        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputName =  inputed.getText().toString();
                String showMessage = "ようこそ" + inputName + "テストアプリへ";

                Toast.makeText(MainActivity.this, showMessage, Toast.LENGTH_SHORT).show();
            }
        });
    }


}