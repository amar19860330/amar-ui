package ui.amar.com.amar_ui;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.amar.android.ui.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main);

        initUI();
    }

    void initUI()
    {
        ImageView image_1 = (ImageView )this.findViewById( R.id.image_wait_for_load_1 );
        ImageView image_2 = (ImageView )this.findViewById( R.id.image_wait_for_load_2 );
        ImageView image_3 = (ImageView )this.findViewById( R.id.image_wait_for_load_3 );

        String url = "http://upload.wikimedia.org/wikipedia/commons/4/4d/Angel_Dark.jpg";
        Picasso.with( this ).load(url).error( R.drawable.ic_launcher ).into(image_1,callBack);
        Picasso.with( this ).load(url).error( R.string.app_name ).into( image_2 ,callBack);
        Picasso.with( this ).load(url).into(image_3,callBack);
    }

    Callback callBack = new Callback(){

        @Override
        public void onSuccess()
        {
            Log.d("Callback","onSuccess");
        }

        @Override
        public void onError()
        {
            Log.d("Callback","onError");
        }
    };


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
