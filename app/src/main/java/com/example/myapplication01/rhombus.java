package com.example.myapplication01;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication01.databinding.ActivityRhombusBinding;

public class rhombus extends AppCompatActivity {

    EditText inputa;
    Button btn, btn1;
    TextView text_2, text_1, txt_ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rhombus);
        inputa = findViewById(R.id.inputa);
        btn = findViewById(R.id.btn);
        text_2 = findViewById(R.id.text_2);
        text_1=findViewById(R.id.text_1);
        txt_ans=findViewById(R.id.txt_ans);
        btn1=findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float con1=Float.parseFloat(inputa.getText().toString());
                float answer=con1*4;
                txt_ans.setText("Answewr is "+answer);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

