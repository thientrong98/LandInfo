package vlab.tech.landinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.tv);
        vlab.tech.hcm.MainActivity.getDistance(0,0,0,0);
        tv.setText("heheh");
//        Log.d("hehe", String.valueOf(distance));
    }
}