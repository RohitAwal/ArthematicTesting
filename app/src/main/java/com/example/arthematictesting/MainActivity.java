package com.example.arthematictesting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etFisrt,etSecond;
    Button btnAdd,btnSub,btnDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFisrt = findViewById(R.id.etFirst);
        etSecond = findViewById(R.id.etSecond);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnDiv = findViewById(R.id.btnDiv);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add();
            }
        });
    }
    private void Add(){
        float first = Float.parseFloat(etFisrt.getText().toString());
        float second = Float.parseFloat(etSecond.getText().toString());
        Arthematic arthematic = new Arthematic();
        float result = arthematic.add(first,second);

//        Intent intent = new Intent(MainActivity.this,ResultActivity.class);

        Toast.makeText(this, ""+result, Toast.LENGTH_SHORT).show();
    }
}
