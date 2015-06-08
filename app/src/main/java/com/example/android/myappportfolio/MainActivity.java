package com.example.android.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonSpotifyStreamer).setOnClickListener(this);
        findViewById(R.id.buttonScoresApp).setOnClickListener(this);
        findViewById(R.id.buttonLibraryApp).setOnClickListener(this);
        findViewById(R.id.buttonBuildItBigger).setOnClickListener(this);
        findViewById(R.id.buttonXYZReader).setOnClickListener(this);
        findViewById(R.id.buttonCapstone).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonSpotifyStreamer:
                showToast(getString(R.string.spotify_toast));
                break;
            case R.id.buttonScoresApp:
                showToast(getString(R.string.scores_toast));
                break;
            case R.id.buttonLibraryApp:
                showToast(getString(R.string.library_toast));
                break;
            case R.id.buttonBuildItBigger:
                showToast(getString(R.string.bigger_toast));
                break;
            case R.id.buttonXYZReader:
                showToast(getString(R.string.xyz_toast));
                break;
            case R.id.buttonCapstone:
                showToast(getString(R.string.capstone_toast));
                break;
            default:
                break;
        }
    }

    private void showToast(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
