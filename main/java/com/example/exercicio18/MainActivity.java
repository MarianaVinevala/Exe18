package com.example.exercicio18;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText edt;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn);
        edt=(EditText) findViewById(R.id.edt);
        txt=(TextView) findViewById(R.id.txt);
    }
    public void OnClick(View v)
    {
        int primo =Integer.parseInt(edt.getText().toString());
        int c=0;
         for( int i=1; i<=primo; i++)
         { if(primo%i==0)
             c++;
         }
         if(c==2){
            txt.getText();
            txt.setText(primo + " é primo");
         }else
         {
             txt.getText();
             txt.setText(primo + " não é primo");
         }

}
    }
