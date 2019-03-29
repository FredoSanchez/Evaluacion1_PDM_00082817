package com.mramirez.evaluation1sol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mramirez.evaluation1sol.utils.AppConstants;

public class ReportActivity extends AppCompatActivity {

    private TextView mUserName, mEmail, mTotal, mCant1, mCant2, mCant3, mCant4, mCant5, mCant6, mCant7, mCant8, mCant9;
    private Button mShareBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        mUserName = findViewById(R.id.tv_username);
        mEmail = findViewById(R.id.tv_email);
        mTotal = findViewById(R.id.tv_total);

        mCant1 = findViewById(R.id.tv_prod1_1);
        mCant2 = findViewById(R.id.tv_prod2_2);
        mCant3 = findViewById(R.id.tv_prod3_3);
        mCant4 = findViewById(R.id.tv_prod4_4);
        mCant5 = findViewById(R.id.tv_prod5_5);
        mCant6 = findViewById(R.id.tv_prod6_6);
        mCant7 = findViewById(R.id.tv_prod7_7);
        mCant8 = findViewById(R.id.tv_prod8_8);
        mCant9 = findViewById(R.id.tv_prod9_9);

        mShareBtn = findViewById(R.id.btn_share);

        Intent mIntent = getIntent();


        if (mIntent != null){
            mUserName.setText(mIntent.getStringExtra(AppConstants.USER_KEY));
            mEmail.setText(mIntent.getStringExtra(AppConstants.EMAIL_KEY));
            mTotal.setText(mIntent.getStringExtra(AppConstants.SUMA));
            mCant1.setText(mIntent.getStringExtra(AppConstants.CANT1));
            mCant2.setText(mIntent.getStringExtra(AppConstants.CANT2));
            mCant3.setText(mIntent.getStringExtra(AppConstants.CANT3));
            mCant4.setText(mIntent.getStringExtra(AppConstants.CANT4));
            mCant5.setText(mIntent.getStringExtra(AppConstants.CANT5));
            mCant6.setText(mIntent.getStringExtra(AppConstants.CANT6));
            mCant7.setText(mIntent.getStringExtra(AppConstants.CANT7));
            mCant8.setText(mIntent.getStringExtra(AppConstants.CANT8));
            mCant9.setText(mIntent.getStringExtra(AppConstants.CANT9));
        }

        /*
        mShareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        */


    }





}
