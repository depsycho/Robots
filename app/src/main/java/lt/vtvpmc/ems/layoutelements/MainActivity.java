package lt.vtvpmc.ems.layoutelements;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {

    private TextView textViewTwo;
    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTwo = (TextView) findViewById(R.id.textViewTwo);
        buttonOne = (Button) findViewById(R.id.buttonOne);
        buttonTwo = (Button) findViewById(R.id.buttonTwo);
        buttonThree = (Button) findViewById(R.id.buttonThree);
    }

    public void clickButton(View view) {
        switch (view.getId()) {
            case R.id.buttonOne:
                textViewTwo.setBackgroundColor(getResources().getColor(R.color.redColor);

            case R.id.buttonTwo:
                textViewTwo.setBackgroundColor(getResources().getColor(R.color.greenColor);

             case R.id.buttonThree:
                textViewTwo.setBackgroundColor(getResources().getColor(R.color.blueColor);
}
    }
}
