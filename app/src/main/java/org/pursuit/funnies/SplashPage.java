package org.pursuit.funnies;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

import com.bumptech.glide.Glide;
import com.felipecsl.gifimageview.library.GifImageView;

import org.pursuit.funnies.MainActivity;
import org.pursuit.funnies.R;

public class SplashPage extends AppCompatActivity {
    private CountDownTimer countDownTimer;
    private Handler handler;
    private Runnable runnable;
    private GifImageView gifImageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_page);
        gifImageView = findViewById(R.id.laughing_gif);


        Glide.with(this).load(R.raw.tenor).into(gifImageView);
        countDownTimer = new CountDownTimer(4000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        }.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {

    }
}
