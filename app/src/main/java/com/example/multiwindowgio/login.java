package com.example.multiwindowgio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends Activity {
    @Override
    protected void onCreate(Bundle saveInstancestate){
        super.onCreate(saveInstancestate);
        setContentView(R.layout.activity_login);

        Button btn_login = findViewById(R.id.login_btn);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login.this, NewActivity.class));
            }
        });
    }
}
