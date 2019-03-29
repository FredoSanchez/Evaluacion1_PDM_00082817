package com.mramirez.evaluation1sol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mramirez.evaluation1sol.utils.AppConstants;

public class ReportActivity extends AppCompatActivity {

    private TextView mUserName, mEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        mUserName = findViewById(R.id.tv_username);
        mEmail = findViewById(R.id.tv_email);

        Intent mIntent = getIntent();


        if (mIntent != null){
            mUserName.setText(mIntent.getStringExtra(AppConstants.USER_KEY));
            mEmail.setText(mIntent.getStringExtra(AppConstants.EMAIL_KEY));
        }

    }


}
