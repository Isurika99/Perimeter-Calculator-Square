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

import com.example.myapplication01.databinding.ActivityTrapezoidBinding;

public class trapezoid extends AppCompatActivity {


   TextView text_1,text_2,text_3,txt_ans;
   EditText inputW1,inputL1,inputW2,inputL2;
   Button btn,btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_trapezoid);
        text_1=findViewById(R.id.text_1);
        text_2=findViewById(R.id.text_2);
        text_3=findViewById(R.id.text_3);
        txt_ans=findViewById(R.id.txt_ans);
        inputW1=findViewById(R.id.inputW1);
        inputL1=findViewById(R.id.inputL1);
        inputW2=findViewById(R.id.inputW2);
        inputL2=findViewById(R.id.inputL2);
        btn=findViewById(R.id.btn);
        btn1=findViewById(R.id.btn1);

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               float con1=Float.parseFloat(inputW1.getText().toString());
               float con2=Float.parseFloat(inputL1.getText().toString());
               float con3=Float.parseFloat(inputL2.getText().toString());
               float con4=Float.parseFloat(inputW2.getText().toString());
               float answer=con1+con2+con3+con4;
               txt_ans.setText("Answer is "+answer);
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