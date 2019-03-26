package org.pursuit.funnies.views;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import org.pursuit.funnies.MainActivity;
import org.pursuit.funnies.R;

public class SplashPage extends AppCompatActivity {
    private Handler handler;
    private Runnable runnable;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_page);

        runnable = new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        };
        handler = new Handler();
        handler.postDelayed(runnable,5000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(handler != null && runnable != null)
        handler.removeCallbacks(runnable);
    }
}
