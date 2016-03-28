package com.example.jafoole.espressolab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mUsernameEditText;
    EditText mPasswordEditText;
    Button mSubmitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mUsernameEditText = (EditText)findViewById(R.id.username_edittext);
        mPasswordEditText = (EditText)findViewById(R.id.password_edittext);
        mSubmitButton = (Button)findViewById(R.id.submit_button);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BalanceActivity.class);
                String username = mUsernameEditText.getText().toString();

                intent.putExtra("USERNAME", username);
                startActivity(intent);
            }
        });
    }
}
