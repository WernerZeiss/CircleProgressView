package com.cwq.circleprogressview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cwq.library.CircleProgressView;

public class MainActivity extends AppCompatActivity {
    private CircleProgressView cpv1;
    private CircleProgressView cpv2;
    private CircleProgressView cpv3;
    private Button btn_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cpv1 = findViewById(R.id.cpv1);
        cpv2 = findViewById(R.id.cpv2);
        cpv3 = findViewById(R.id.cpv3);
        btn_start = findViewById(R.id.btn_start);

        cpv1.setGradientColors(Color.RED, Color.YELLOW, Color.BLUE, Color.GREEN);
        cpv3.setSweepAngle(270);
        cpv3.isShowAsPercent(false);

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cpv1.start(200f, 100f);
                cpv2.start(200f, 165f);
                cpv3.start(200f, 165f);
            }
        });
    }
}
