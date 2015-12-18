package in.divyamary.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] appButtons = new int[]{
                R.id.app1_button, R.id.app2_button, R.id.app3_button, R.id.app4_button, R.id.app5_button, R.id.finalapp_button
        };
        for (int appButton : appButtons) {
            findViewById(appButton).setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.app1_button:
                Toast.makeText(this, getResources().getString(R.string.app1_toast), Toast.LENGTH_SHORT).show();
                break;
            case R.id.app2_button:
                Toast.makeText(this, getResources().getString(R.string.app2_toast), Toast.LENGTH_SHORT).show();
                break;
            case R.id.app3_button:
                Toast.makeText(this, getResources().getString(R.string.app3_toast), Toast.LENGTH_SHORT).show();
                break;
            case R.id.app4_button:
                Toast.makeText(this, getResources().getString(R.string.app4_toast), Toast.LENGTH_SHORT).show();
                break;
            case R.id.app5_button:
                Toast.makeText(this, getResources().getString(R.string.app5_toast), Toast.LENGTH_SHORT).show();
                break;
            case R.id.finalapp_button:
                Toast.makeText(this, getResources().getString(R.string.final_app_toast), Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
