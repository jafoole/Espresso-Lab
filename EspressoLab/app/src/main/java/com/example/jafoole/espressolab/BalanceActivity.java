package com.example.jafoole.espressolab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BalanceActivity extends AppCompatActivity {

    TextView mCurrentBalanceView;
    Button mIncreaseButton;
    Button mDecreaseButton;
    Button mUserName;
    TextView mDisplayUsername;
    TextView mDisplayEmail;
    EditText mAddBalance;
    Double mBalance;
    Double mInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance);

        mCurrentBalanceView = (TextView) findViewById(R.id.currentBalanceView);
        mIncreaseButton = (Button) findViewById(R.id.increaseButton);
        mDecreaseButton = (Button) findViewById(R.id.decreaseButton);
        mUserName = (Button) findViewById(R.id.userName);
        mDisplayUsername = (TextView) findViewById(R.id.displayUsername);
        mDisplayEmail = (TextView) findViewById(R.id.displayEmail);
        mAddBalance = (EditText) findViewById(R.id.addBalance);

        mBalance = 0.0;


        final String usersNAME = getIntent().getStringExtra("USERNAME");

        mDisplayUsername.setText(usersNAME);

        mDisplayEmail.setText(usersNAME + "@gmail.com");

        mUserName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BalanceActivity.this, ProfileDetailsActivity.class);
                intent.putExtra("DISPLAYNAME", usersNAME);
                startActivity(intent);
            }
        });


        mIncreaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInput = Double.parseDouble(mAddBalance.getText().toString());
                mBalance += mInput;
                mCurrentBalanceView.setText(mBalance.toString());
                mAddBalance.setText("");
            }
        });

        mDecreaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInput = Double.parseDouble(mAddBalance.getText().toString());
                mBalance -= mInput;
                mCurrentBalanceView.setText(mBalance.toString());
                mAddBalance.setText("");
            }
        });
    }
}
