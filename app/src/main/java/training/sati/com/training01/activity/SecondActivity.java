package training.sati.com.training01.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import training.sati.com.training01.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_3);
        TextView tvMsg = (TextView) findViewById(R.id.tv_layout_3_msg);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String msg = extras.getString("message");
            tvMsg.setText(msg);

        }
    }
}
