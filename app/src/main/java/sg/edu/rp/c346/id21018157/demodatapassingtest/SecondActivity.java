package sg.edu.rp.c346.id21018157.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        
        textView = findViewById(R.id.textView);

        //receives integer 1 from MainActivity
        Intent intentReceived = getIntent();
        Integer valueSelected = intentReceived.getIntExtra("value", 1);
        textView.setText("Integer value received is: " + valueSelected);

    }
}