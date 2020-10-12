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
        int a = vlab.tech.hcm.MainActivity.Plus(1,2);
        tv.setText(String.valueOf(a));
        Log.d("hehe", String.valueOf(a));
    }
}