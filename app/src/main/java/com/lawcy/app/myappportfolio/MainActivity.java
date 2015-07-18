package com.lawcy.app.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private Button mSpotifyStreamerButton;
    private Button mScoreAppButton;
    private Button mLibraryAppButton;
    private Button mBuildItBiggerButton;
    private Button mXyzReaderButton;
    private Button mCapstoneButton;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        String toastString = getText(R.string.launching_text).toString();
        switch (view.getId()) {
            case R.id.button_spotify_streamer:
                toastString = toastString.replace("|-APPNAME-|", getText(R.string.spotify_streamer).toString());
                Toast.makeText(this, toastString, Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_scores_app:
                toastString = toastString.replace("|-APPNAME-|", getText(R.string.scores_app).toString());
                Toast.makeText(this, toastString, Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_library_app:
                toastString = toastString.replace("|-APPNAME-|", getText(R.string.library_app).toString());
                Toast.makeText(this, toastString, Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_build_it_bigger:
                toastString = toastString.replace("|-APPNAME-|", getText(R.string.build_it_bigger).toString());
                Toast.makeText(this, toastString, Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_xyz_reader:
                toastString = toastString.replace("|-APPNAME-|", getText(R.string.xyz_reader).toString());
                Toast.makeText(this, toastString, Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_capstone:
                toastString = toastString.replace("|-APPNAME-|", getText(R.string.capstone).toString());
                Toast.makeText(this, toastString, Toast.LENGTH_SHORT).show();
                break;

            default:
                // do nothing
                break;
        }
    }
}
