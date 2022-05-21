package sg.edu.rp.c346.id21018157.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tv2 = findViewById(R.id.textView2);

        //receives char a from MainActivity
        Intent intentReceived = getIntent();
        String valueSelected = intentReceived.getStringExtra("value");
        tv2.setText("Character value received is: " + valueSelected);
    }
}