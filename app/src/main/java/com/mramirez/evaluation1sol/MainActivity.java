package com.mramirez.evaluation1sol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mramirez.evaluation1sol.utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    TextView mContador1, mContador2, mContador3, mContador4, mContador5, mContador6, mContador7, mContador8, mContador9;
    EditText mUserName, mEmail;
    Button mBotonEnviar;
    int cant1, cant2, cant3, cant4, cant5, cant6, cant7, cant8, cant9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        /*
        mContador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cant1 = cant1++;
                mContador1.setText(cant1.toString());
            }
        });
*/
        int suma = cant1 + cant2 + cant3 + cant4 + cant5 + cant6 + cant7 + cant8 + cant9;


        mBotonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = mUserName.getText().toString(),
                        email = mEmail.getText().toString();



                Intent mIntent = new Intent(MainActivity.this, ReportActivity.class);
                mIntent.putExtra(AppConstants.USER_KEY,userName);
                mIntent.putExtra(AppConstants.EMAIL_KEY, email);
                startActivity(mIntent);
            }
        });
    }




}
