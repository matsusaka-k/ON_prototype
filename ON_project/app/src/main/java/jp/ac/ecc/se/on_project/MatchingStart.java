package jp.ac.ecc.se.on_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MatchingStart extends AppCompatActivity {
    private TextView timer;
    private Button sleepButton;
    private Button stopButton;

    private Handler handler;
    private Runnable runnable;
    private long startTime;
    private long timeInMillis;
    private boolean isRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matching_start);

        timer = findViewById(R.id.timer);
        TextView message = findViewById(R.id.message);
        TextView userid = findViewById(R.id.userId);
        TextView username = findViewById(R.id.userName);
        sleepButton = findViewById(R.id.sleep);
        stopButton = findViewById(R.id.wake);

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                timeInMillis = System.currentTimeMillis() - startTime;
                updateTimer();
                handler.postDelayed(this, 1000);
            }
        };


        sleepButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sleepTimer();
            }
        });


        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MatchingStart.class);
                stopTimer();
            }
        });
    }

    private void sleepTimer() {
        if (!isRunning) {
            startTime = System.currentTimeMillis() - timeInMillis;
            handler.postDelayed(runnable, 0);
            isRunning = true;
        }
    }

    private void stopTimer() {
        if (isRunning) {
            handler.removeCallbacks(runnable);
            isRunning = false;
        }
    }

    private void resetTimer() {
        stopTimer();
        timeInMillis = 0;
        updateTimer();
    }

    private void updateTimer() {
        int seconds = (int) (timeInMillis / 1000) % 60;
        int minutes = (int) ((timeInMillis / (1000 * 60)) % 60);
        int hours = (int) ((timeInMillis / (1000 * 60 * 60)) % 24);

        String timeFormatted = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        timer.setText(timeFormatted);
    }


}


