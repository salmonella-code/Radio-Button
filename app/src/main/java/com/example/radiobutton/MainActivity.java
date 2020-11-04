package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.onChecked ChangeListener {
RadioGroup rg;
RadioButton rbtn, rbtn1, rbtn2, rbtn3, rbtn4, rbtn5;

Button btn;
@Override
    protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    rg = (RadioGroup) findViewById(R.id.radioGroup);
    rg.setOnCheckedChangeListener(this);
    rbtn =  (RadioButton) findViewById(R.id.rb);
    rbtn1 =  (RadioButton) findViewById(R.id.rb1);
    rbtn2 =  (RadioButton) findViewById(R.id.rb2);
    rbtn3 =  (RadioButton) findViewById(R.id.rb3);
    rbtn4 =  (RadioButton) findViewById(R.id.rb4);
    rbtn5 =  (RadioButton) findViewById(R.id.rb5);

    btn = (Button)  findViewById(R.id.btn);

    }

    public void onCheckedChanged(RadioGroup group, int checkedId){
        if(checkedId == R.id.rb){
            Toast.makeText(this "Makanan favorit anda Sate", Toast.LENGTH_LONG).show();
        }

        if(checkedId == R.id.rb1){
            Toast.makeText(this "Makanan favorit anda Bakso", Toast.LENGTH_LONG).show();
        }

        if(checkedId == R.id.rb2){
            Toast.makeText(this "Makanan favorit anda Nasi Goreng", Toast.LENGTH_LONG).show();
        }

        if(checkedId == R.id.rb3){
            Toast.makeText(this "Makanan favorit anda Minas", Toast.LENGTH_LONG).show();
        }

        if(checkedId == R.id.rb4){
            Toast.makeText(this "Makanan favorit anda Ayam Penyet", Toast.LENGTH_LONG).show();
        }

        if(checkedId == R.id.rb5){
            Toast.makeText(this "Makanan favorit anda Ketoprak", Toast.LENGTH_LONG).show();
        }
    }

    public void keluar(View view){
    finish();
    }


}