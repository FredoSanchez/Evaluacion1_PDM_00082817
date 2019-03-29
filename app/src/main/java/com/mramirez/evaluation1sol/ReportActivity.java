package com.mramirez.evaluation1sol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mramirez.evaluation1sol.utils.AppConstants;

public class ReportActivity extends AppCompatActivity {

    TextView mUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        mUserName.findViewById(R.id.tv_username);

        Intent mIntent = getIntent();


        if (mIntent != null){
            mUserName.setText(mIntent.getStringExtra(AppConstants.USER_KEY));
        }

    }


}
