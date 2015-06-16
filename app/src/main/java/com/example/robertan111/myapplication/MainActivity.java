package com.example.robertan111.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.media.MediaPlayer;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    MediaPlayer pussyTonight;
    MediaPlayer eyBoss;
    MediaPlayer cancer;
    MediaPlayer pussypls;
    MediaPlayer scream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pussyTonight = MediaPlayer.create(this, R.raw.pt);
        eyBoss = MediaPlayer.create(this, R.raw.eyboss);
        cancer = MediaPlayer.create(this, R.raw.cancer);
        pussypls = MediaPlayer.create(this, R.raw.pussypls);
        scream = MediaPlayer.create(this, R.raw.scream);
        setTitle("FilthyFrank SoundBoard");
    }

    public void pussyTonight (View view) {
        pussyTonight.start();
    }

    public void eyBoss (View view) {
        eyBoss.start();
    }

    public void cancer (View view) {
        cancer.start();
    }

    public void pussypls (View view) {
        pussypls.start();
    }

    public void scream (View view) {
        scream.start();
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


}
