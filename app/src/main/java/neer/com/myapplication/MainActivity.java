package neer.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity
{

    AutoCompleteTextView autoCompleteTextView;
    String arr [] = {"neeraja","nihaal","mounika","madhav","neeru"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView = (AutoCompleteTextView)findViewById(R.id.a1);

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.select_dialog_item, arr);
        autoCompleteTextView.setAdapter(aa);
        autoCompleteTextView.setThreshold(1);

    }

}
