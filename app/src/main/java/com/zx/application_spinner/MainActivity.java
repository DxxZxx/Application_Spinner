package com.zx.application_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Expert expert =new Expert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickFind(View view){
        TextView textview = (TextView) findViewById(R.id.textView);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String type = String.valueOf(spinner.getSelectedItem());

        List<String> list = expert.getColor(type);
        StringBuilder formatted = new StringBuilder();
        for(String tex : list){
            formatted.append(tex).append('\n');
        }
        textview.setText(formatted);
    }
}