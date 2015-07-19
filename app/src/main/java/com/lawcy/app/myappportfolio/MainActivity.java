package com.lawcy.app.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mSpotifyStreamerButton;
    private Button mScoreAppButton;
    private Button mLibraryAppButton;
    private Button mBuildItBiggerButton;
    private Button mXyzReaderButton;
    private Button mCapstoneButton;
    private Toast mToast;

    private void initializeView() {
        mSpotifyStreamerButton = (Button) findViewById(R.id.button_spotify_streamer);
        mScoreAppButton = (Button) findViewById(R.id.button_scores_app);
        mLibraryAppButton = (Button) findViewById(R.id.button_library_app);
        mBuildItBiggerButton = (Button) findViewById(R.id.button_build_it_bigger);
        mXyzReaderButton = (Button) findViewById(R.id.button_xyz_reader);
        mCapstoneButton = (Button) findViewById(R.id.button_capstone);

        mSpotifyStreamerButton.setOnClickListener(this);
        mScoreAppButton.setOnClickListener(this);
        mLibraryAppButton.setOnClickListener(this);
        mBuildItBiggerButton.setOnClickListener(this);
        mXyzReaderButton.setOnClickListener(this);
        mCapstoneButton.setOnClickListener(this);
    }

    private void showToast(String toastString) {
        if (mToast != null) {
            mToast.cancel();
        }
        mToast = Toast.makeText(this, toastString, Toast.LENGTH_SHORT);
        mToast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeView();
    }

    @Override
    public void onClick(View view) {
        String toastString = getText(R.string.launching_text).toString();
        switch (view.getId()) {
            case R.id.button_spotify_streamer:
                toastString = toastString.replace("|-APPNAME-|", getText(R.string.spotify_streamer).toString());
                showToast(toastString);
                break;

            case R.id.button_scores_app:
                toastString = toastString.replace("|-APPNAME-|", getText(R.string.scores_app).toString());
                showToast(toastString);
                break;

            case R.id.button_library_app:
                toastString = toastString.replace("|-APPNAME-|", getText(R.string.library_app).toString());
                showToast(toastString);
                break;

            case R.id.button_build_it_bigger:
                toastString = toastString.replace("|-APPNAME-|", getText(R.string.build_it_bigger).toString());
                showToast(toastString);
                break;

            case R.id.button_xyz_reader:
                toastString = toastString.replace("|-APPNAME-|", getText(R.string.xyz_reader).toString());
                showToast(toastString);
                break;

            case R.id.button_capstone:
                toastString = toastString.replace("|-APPNAME-|", getText(R.string.capstone).toString());
                showToast(toastString);
                break;

            default:
                // do nothing
                break;
        }
    }
}
