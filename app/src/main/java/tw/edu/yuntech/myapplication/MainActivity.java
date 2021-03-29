package tw.edu.yuntech.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    String[] strs={"BBB","CCC","VVV"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,strs);
        spinner=findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

    }
}