package training.sati.com.training01.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import training.sati.com.training01.R;

public class MainActivity extends AppCompatActivity {
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.context = getBaseContext();
        setContentView(R.layout.layout_1);

    }

    public void onClick(View view){
//        if(view.getId() == R.id.btn_ok){
//            Intent intCalc = new Intent(MainActivity.this, SecondActivity.class);
//            intCalc.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this is required because we are starting a new activity outside of an parent activity
//            intCalc.putExtra("message", "This is my message");
//            startActivity(intCalc);
//        }
            if(view.getId() == R.id.btn_ok){
            Intent intCalc = new Intent(MainActivity.this, ContactActivity.class);
            //intCalc.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this is required because we are starting a new activity outside of an parent activity
            //intCalc.putExtra("message", "This is my message");
            startActivity(intCalc);
        }
    }
}
