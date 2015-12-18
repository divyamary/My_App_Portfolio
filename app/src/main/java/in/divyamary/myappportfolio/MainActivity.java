package in.divyamary.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] clickables = new int[]{
                R.id.app1, R.id.app2_button, R.id.app3_button, R.id.app4_button, R.id.app5_button, R.id.finalapp_button
        };
        for(int clickable:clickables){
            findViewById(clickable).setOnClickListener(this);
        }

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
        switch (view.getId()) {
            case R.id.app1:
                Toast.makeText(this, "This button will launch the Spotify Streamer App", Toast.LENGTH_LONG).show();
                break;
            case R.id.app2_button:
                Toast.makeText(this, "This button will launch the Football Scores App", Toast.LENGTH_LONG).show();
                break;
            case R.id.app3_button:
                Toast.makeText(this, "This button will launch the Library App", Toast.LENGTH_LONG).show();
                break;
            case R.id.app4_button:
                Toast.makeText(this, "This button will launch the Build It Bigger App", Toast.LENGTH_LONG).show();
                break;
            case R.id.app5_button:
                Toast.makeText(this, "This button will launch the XYZ Reader App", Toast.LENGTH_LONG).show();
                break;
            case R.id.finalapp_button:
                Toast.makeText(this, "This button will launch the Capstone App", Toast.LENGTH_LONG).show();
                break;
        }
    }

}
