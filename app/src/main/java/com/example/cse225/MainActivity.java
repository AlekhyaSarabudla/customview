package com.example.cse225;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void customcheckbox(View view)
    {
        Intent i=new Intent(this,checkbox.class);
        startActivity(i);
    }

    public void customradiobutton(View view)
    {
        Intent i=new Intent(this,Radiobutton.class);
        startActivity(i);

    }

    public void custombutton(View view)
    {
        Intent i=new Intent(this, aa.class);
        startActivity(i);
    }
}
