package sg.edu.rp.c346.id21018157.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tv = findViewById(R.id.textView5);

        //receives char a from MainActivity
        Intent intentReceived = getIntent();
        double valueSelected = intentReceived.getDoubleExtra("value",99.99);
        tv.setText("Double value received is: " + valueSelected);
    }
}