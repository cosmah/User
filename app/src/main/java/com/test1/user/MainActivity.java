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
    }
//onBtnClick
    public void onBtnClick (View view) {
        //display
        TextView txtFirstName = findViewById(R.id.hellotxt);
        TextView txtLastName = findViewById(R.id.textView);
        TextView txtEmail = findViewById(R.id.textView2);

        //entry
        EditText edtTxtFirstName = findViewById(R.id.editTextText);
        EditText edtTxtSecondName = findViewById(R.id.editTextText2);
        EditText edtTxtEmail = findViewById(R.id.editTextTextEmailAddress);

        //set targets
        txtFirstName.setText("First Name: " + edtTxtFirstName.getText().toString());
        txtLastName.setText("Last name: " + edtTxtSecondName.getText().toString());
        txtEmail.setText("Email: " + edtTxtEmail.getText().toString());

    }
}