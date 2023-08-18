package com.test1.user;

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

        //first name
        TextView txtHello = findViewById(R.id.hellotxt);
        txtHello.setText("First Name");

        //second name
        TextView name2 = findViewById(R.id.hellotxt);
        name2.setText("Second Name");
    }

    public void onBtnClick (View view) {
        TextView txtHello = findViewById(R.id.hellotxt);
        TextView name2 = findViewById(R.id.hellotxt);

        //user input
        // first name
        EditText edtTxt = findViewById(R.id.editTextText);
        txtHello.setText("First Name: " + edtTxt.getText().toString());

        //second name
        EditText secondName = findViewById(R.id.editTextText2);
        name2.setText("Second Name: " + secondName.getText().toString());


    }
}