package com.example.firstchallangefaizaankhan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnSubmit(View view){
        TextView txtFN = findViewById(R.id.textView2);
        TextView txtSN = findViewById(R.id.textView3);
        TextView txtE = findViewById(R.id.textView4);

        EditText edtxt = findViewById(R.id.editTextTextPersonName);
        EditText edtxt2 = findViewById(R.id.editTextTextPersonName3);
        EditText edtxt3 = findViewById(R.id.editTextTextPersonName4);

        txtFN.setText(edtxt.getText().toString());
        txtSN.setText(edtxt2.getText().toString());
        txtE.setText(edtxt3.getText().toString());
    }
}
