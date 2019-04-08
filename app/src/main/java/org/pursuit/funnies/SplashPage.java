package org.pursuit.funnies;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

import com.bumptech.glide.Glide;
import com.felipecsl.gifimageview.library.GifImageView;

import org.pursuit.funnies.MainActivity;
import org.pursuit.funnies.R;

public class SplashPage extends AppCompatActivity {
    private Handler handler;
    private Runnable runnable;
    private GifImageView gifImageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_page);
        gifImageView = findViewById(R.id.laughing_gif);


        Glide.with(this).load(R.raw.tenor).into(gifImageView);
        runnable = new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getBaseContext(), MainActivity.class));
            }
        };
        handler = new Handler();
        handler.postDelayed(runnable,2000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(handler != null && runnable != null)
        handler.removeCallbacks(runnable);
    }

    @Override
    public void onBackPressed() {

    }
}
