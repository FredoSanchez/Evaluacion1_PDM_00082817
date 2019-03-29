package com.mramirez.evaluation1sol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mramirez.evaluation1sol.utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    LinearLayout mLLayout1, mLLayout2, mLLayout3, mLLayout4, mLLayout5, mLLayout6, mLLayout7, mLLayout8, mLLayout9;
    TextView mContador1, mContador2, mContador3, mContador4, mContador5, mContador6, mContador7, mContador8, mContador9;
    EditText mUserName, mEmail;
    Button mBotonEnviar;
    int cant1, cant2, cant3, cant4, cant5, cant6, cant7, cant8, cant9, suma = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linear Loyouts
        mLLayout1 = findViewById(R.id.ll_prod1);
        mLLayout2 = findViewById(R.id.ll_prod2);
        mLLayout3 = findViewById(R.id.ll_prod3);
        mLLayout4 = findViewById(R.id.ll_prod4);
        mLLayout5 = findViewById(R.id.ll_prod5);
        mLLayout6 = findViewById(R.id.ll_prod6);
        mLLayout7 = findViewById(R.id.ll_prod7);
        mLLayout8 = findViewById(R.id.ll_prod8);
        mLLayout9 = findViewById(R.id.ll_prod9);


        mContador1 = findViewById(R.id.tv_prod1);
        mContador2 = findViewById(R.id.tv_prod2);
        mContador3 = findViewById(R.id.tv_prod3);
        mContador4 = findViewById(R.id.tv_prod4);
        mContador5 = findViewById(R.id.tv_prod5);
        mContador6 = findViewById(R.id.tv_prod6);
        mContador7 = findViewById(R.id.tv_prod7);
        mContador8 = findViewById(R.id.tv_prod8);
        mContador9 = findViewById(R.id.tv_prod9);
        mUserName =findViewById(R.id.et_user);
        mEmail = findViewById(R.id.et_email);
        mBotonEnviar = findViewById(R.id.btn_send);


        //Cantidades de productos
        cant1 = Integer.parseInt(mContador1.getText().toString());
        cant2 = Integer.parseInt(mContador2.getText().toString());
        cant3 = Integer.parseInt(mContador3.getText().toString());
        cant4 = Integer.parseInt(mContador4.getText().toString());
        cant5 = Integer.parseInt(mContador5.getText().toString());
        cant6 = Integer.parseInt(mContador6.getText().toString());
        cant7 = Integer.parseInt(mContador7.getText().toString());
        cant8 = Integer.parseInt(mContador8.getText().toString());
        cant9 = Integer.parseInt(mContador9.getText().toString());


        mLLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cant1 = cant1 + 1;
                mContador1.setText(Integer.toString(cant1));
            }
        });

        mLLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cant2 = cant2 + 1;
                mContador2.setText(Integer.toString(cant2));
            }
        });

        mLLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cant3 = cant3 + 1;
                mContador3.setText(Integer.toString(cant3));
            }
        });

        mLLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cant4 = cant4 + 1;
                mContador4.setText(Integer.toString(cant4));
            }
        });

        mLLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cant5 = cant5 + 1;
                mContador5.setText(Integer.toString(cant5));
            }
        });

        mLLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cant6 = cant6 + 1;
                mContador6.setText(Integer.toString(cant6));
            }
        });

        mLLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cant7 = cant7 + 1;
                mContador7.setText(Integer.toString(cant7));
            }
        });

        mLLayout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cant8 = cant8 + 1;
                mContador8.setText(Integer.toString(cant8));
            }
        });

        mLLayout9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cant9 = cant9 + 1;
                mContador9.setText(Integer.toString(cant9));
            }
        });


        mBotonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = mUserName.getText().toString(),
                        email = mEmail.getText().toString();
                suma = cant1 + cant2 + cant3 + cant4 + cant5 + cant6 + cant7 + cant8 + cant9;



                Intent mIntent = new Intent(MainActivity.this, ReportActivity.class);
                mIntent.putExtra(AppConstants.USER_KEY,userName);
                mIntent.putExtra(AppConstants.EMAIL_KEY, email);
                mIntent.putExtra(AppConstants.SUMA,Integer.toString(suma));
                mIntent.putExtra(AppConstants.CANT1,Integer.toString(cant1));
                mIntent.putExtra(AppConstants.CANT2,Integer.toString(cant2));
                mIntent.putExtra(AppConstants.CANT3,Integer.toString(cant3));
                mIntent.putExtra(AppConstants.CANT4,Integer.toString(cant4));
                mIntent.putExtra(AppConstants.CANT5,Integer.toString(cant5));
                mIntent.putExtra(AppConstants.CANT6,Integer.toString(cant6));
                mIntent.putExtra(AppConstants.CANT7,Integer.toString(cant7));
                mIntent.putExtra(AppConstants.CANT8,Integer.toString(cant8));
                mIntent.putExtra(AppConstants.CANT9,Integer.toString(cant9));
                startActivity(mIntent);
            }
        });
    }




}
