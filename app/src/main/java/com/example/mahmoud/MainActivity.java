package com.example.mahmoud;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvrez= findViewById(R.id.tv_rezult);

        EditText ednum1 =findViewById(R.id.ed_num_1);
        EditText ednum2 =findViewById(R.id.ed_num_2);

        Button btplus=findViewById(R.id.bt_plus);
        Button btminc=findViewById(R.id.bt_minc);
        Button btmulty=findViewById(R.id.bt_multy);
        Button btdiv=findViewById(R.id.bt_div);


        btplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1= Integer.parseInt( ednum1.getText().toString());
                int num2= Integer.parseInt( ednum2.getText().toString());
                int rez=num1+num2;
                tvrez.setText(String.valueOf(rez));
            }
        });
        btminc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1= Integer.parseInt( ednum1.getText().toString());
                int num2= Integer.parseInt( ednum2.getText().toString());
                int rez=num1-num2;
                tvrez.setText(String.valueOf(rez));
            }
        });
        btmulty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1= Integer.parseInt( ednum1.getText().toString());
                int num2= Integer.parseInt( ednum2.getText().toString());
                int rez=num1*num2;
                tvrez.setText(String.valueOf(rez));
            }
        });
        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try { int num1= Integer.parseInt( ednum1.getText().toString());
                    int num2= Integer.parseInt( ednum2.getText().toString());
                    int rez=num1/num2;
                    tvrez.setText(String.valueOf(rez));

                }catch (Exception ex){
                    Toast.makeText(MainActivity.this, "Mathematical error", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}