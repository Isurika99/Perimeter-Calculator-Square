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

import com.example.myapplication01.databinding.ActivityParallelogramBinding;

public class parallelogram extends AppCompatActivity {

   TextView text_1,text_2,text_3,txt_ans;
   EditText inputa,inputb;
   Button btn,btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_parallelogram);
        text_1=findViewById(R.id.text_1);
        text_2=findViewById(R.id.text_2);
        text_3=findViewById(R.id.text_3);
        txt_ans=findViewById(R.id.txt_ans);
        inputa=findViewById(R.id.inputa);
        inputb=findViewById(R.id.inputb);
        btn=findViewById(R.id.btn);
        btn1=findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float con1=Float.parseFloat(inputa.getText().toString());
                float con2=Float.parseFloat(inputb.getText().toString());
                float answer=2*(con1+con2);
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