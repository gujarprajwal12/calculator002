package gujarprawjal12gmail.com.example.calculator_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView workingTV;
    TextView resultTV;
    String working = "";
    private String givenvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTextViews();
    }

    private void initTextViews() {
        workingTV = (TextView)findViewById(R.id.WorkingText);
        resultTV = (TextView)findViewById(R.id.Result);

    }

    private void setWorking(){
        working = working + givenvalue;
        workingTV.setText(working);
    }


    public void clearOnClick(View view) {
        setWorking();
    }
    
    
    
    
    
}