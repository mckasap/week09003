package org.kasapbasi.week09003;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView) findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView) findViewById(R.id.textView3);
        t4=(TextView) findViewById(R.id.textView4);

        t4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                final int actionPeformed = motionEvent.getAction();

                switch (actionPeformed){
                    case MotionEvent.ACTION_DOWN:
                        final float x=motionEvent.getX();
                        final float y= motionEvent.getY();
                        t1.setText(x+"");
                        t2.setText(y+"");


                        break;
                    case MotionEvent.ACTION_MOVE: break;




                }

                return false;

            }
        });
    }
}
