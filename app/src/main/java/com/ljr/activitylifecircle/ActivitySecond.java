package com.ljr.activitylifecircle;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by lsx on 2016/7/22.
 */
public class ActivitySecond  extends AppCompatActivity{
    private TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String inforContent = getIntent().getStringExtra(MainActivity.BOOK_NAME);
       // Toast.makeText(ActivitySecond.this, inforContent, Toast.LENGTH_SHORT).show();
        setContentView(R.layout.second_activity);
        textView = (TextView) findViewById(R.id.second_activity_text_view);
        textView.setText(inforContent);


    }
}
