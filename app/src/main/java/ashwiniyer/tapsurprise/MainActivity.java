package ashwiniyer.tapsurprise;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setting the onClickListener for both sides of the activity
        TextView left = (TextView) findViewById(R.id.leftTextView);
        TextView right = (TextView) findViewById(R.id.rightTextView);

        //Left Side Click
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leftClick();
            }
        });

        //Right Side Click
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rightClick();
            }
        });
    }


    //Starting the intent for the left side click
    private void leftClick(){
        Intent intent = new Intent(this, Lefty.class);
        startActivity(intent);
    }

    //Starting the intent for the right side click
    private void rightClick() {
        Intent intent = new Intent(this, Righty.class);
        startActivity(intent);
    }

}
