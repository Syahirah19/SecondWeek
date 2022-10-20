package bits.mobile.secondweek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView txtVal; //declaration of txtval using TextView datatype
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtVal = findViewById(R.id.textView);
    }

    public void chgText(View view) {
            txtVal.setText("Haiiiii, its change!");

    }
}