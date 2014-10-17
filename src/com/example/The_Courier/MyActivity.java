package com.example.The_Courier;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MyActivity extends Activity implements OnClickListener {
    Button btnRegister, btnGo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnGo.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnGo:
                Toast.makeText(this,"enter",Toast.LENGTH_LONG).show();
                break;
            case R.id.btnRegister:
                Intent regIntent = new Intent(this, Register.class);
                startActivity(regIntent);
                break;
        }
    }
}
