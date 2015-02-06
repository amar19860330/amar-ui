package com.amar.android.ui;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.amar.android.ui.R;
import com.beardedhen.androidbootstrap.FontAwesomeText;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main);

        initUI();
    }


    void initUI()
    {
        final FontAwesomeText tv1 = (FontAwesomeText) findViewById(R.id.lblOne);
        FontAwesomeText tv2 = (FontAwesomeText) findViewById(R.id.lblTwo);
        FontAwesomeText tv3 = (FontAwesomeText) findViewById(R.id.lblThree);

        tv1.startFlashing(this, true, FontAwesomeText.AnimationSpeed.FAST);

        tv2.startRotate(this, true, FontAwesomeText.AnimationSpeed.SLOW);

        tv3.startRotate(this, false, FontAwesomeText.AnimationSpeed.MEDIUM);
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
