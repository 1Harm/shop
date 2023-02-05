package com.moccha.shoppingcart.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.moccha.shoppingcart.MainActivity;
import com.moccha.shoppingcart.R;

public class IntroActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(IntroActivity.this,WelcomeActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);

    }
}

