package com.example.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    ImageButton square,paralelogram,rectangle,rhombus,trapezoid,triangle,circle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        square=findViewById(R.id.image_square);
        paralelogram=findViewById(R.id.image_paralelogram);
        rectangle=findViewById(R.id.image_rectangle);
        rhombus=findViewById(R.id.image_rhombus);
        trapezoid=findViewById(R.id.image_trapezoid);
        triangle=findViewById(R.id.image_triangle);
        circle=findViewById(R.id.image_circle);

        //square perimeter
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),square.class);
                startActivity(intent);
            }
        });

        //parallelogram perimeter
        paralelogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(), parallelogram.class);
                startActivity(intent);
            }
        });


        //rectangle perimeter
        rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),rectangle.class);
                startActivity(intent);
            }
        });

        //Rhombus perimeter
        rhombus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),rhombus.class);
                startActivity(intent);
            }
        });

        //trapezoid perimeter
        trapezoid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),trapezoid.class);
                startActivity(intent);
            }
        });

        //triangle perimeter
        triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),triangle.class);
                startActivity(intent);
            }
        });

        //circle perimeter
        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),circle.class);
                startActivity(intent);
            }
        });
    }
}