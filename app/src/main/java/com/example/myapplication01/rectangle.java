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

import com.example.myapplication01.databinding.ActivityRectangleBinding;

public class rectangle extends AppCompatActivity {

   TextView text_1,text_2,text_3,txt_ans1;
   EditText inputL,inputW;
   Button btn,btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rectangle);
        text_1=findViewById(R.id.text_1);
        text_2=findViewById(R.id.text_2);
        text_3=findViewById(R.id.text_3);
        inputL=findViewById(R.id.inputL);
        inputW=findViewById(R.id.inputW);
        btn=findViewById(R.id.btn);
        btn1=findViewById(R.id.btn1);
        txt_ans1=findViewById(R.id.txt_ans1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float con1=Float.parseFloat(inputW.getText().toString());
                float con2=Float.parseFloat(inputL.getText().toString());
                float answer=(con1+con2)*2;
                txt_ans1.setText("Answer is "+answer);
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