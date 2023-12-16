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

import com.example.myapplication01.databinding.ActivityTriangleBinding;

public class triangle extends AppCompatActivity {

    TextView text_1,text_2,text_3,text_4,text_ans;
    EditText inputa,inputb,inputc;
    Button btn,btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
        text_1=findViewById(R.id.text_1);
        text_2=findViewById(R.id.text_2);
        text_3=findViewById(R.id.text_3);
        text_4=findViewById(R.id.text_4);
        inputa=findViewById(R.id.inputa);
        inputb=findViewById(R.id.inputb);
        inputc=findViewById(R.id.inputc);
        text_ans=findViewById(R.id.text_ans);
        btn=findViewById(R.id.btn);
        btn1=findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float con1=Float.parseFloat(inputa.getText().toString());
                float con2=Float.parseFloat(inputb.getText().toString());
                float con3=Float.parseFloat(inputc.getText().toString());
                float answer=con1+con2+con3;
                text_ans.setText("Answer is "+answer);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }


}