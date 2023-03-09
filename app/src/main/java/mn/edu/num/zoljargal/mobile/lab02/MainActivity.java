package mn.edu.num.zoljargal.mobile.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static String logTag = MainActivity.class.toString();
    TextView myTextView;
    Button myButton;

    Button mBtnAdd;
    Button mBtnSub;
    Button mBtnMul;
    Button mBtnDiv;

    EditText valueA;
    EditText valueB;
    EditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab02);

//        myTextView = findViewById(R.id.myTextVewId);
//        myTextView.setText("This is my text view");
//
//        myButton = findViewById(R.id.myButton);
//        myButton.setOnClickListener(this); // bind event listener to button
        valueA = findViewById(R.id.etValueA);
        valueB = findViewById(R.id.etValueB);
        result = findViewById(R.id.etResult);

        mBtnAdd = findViewById(R.id.btAdd);
        mBtnSub = findViewById(R.id.btSub);
        mBtnMul = findViewById(R.id.btMulti);
        mBtnDiv = findViewById(R.id.btDivide);

        mBtnAdd.setOnClickListener(this);
        mBtnSub.setOnClickListener(this);
        mBtnMul.setOnClickListener(this);
        mBtnDiv.setOnClickListener(this);

        Log.i(logTag, "onCreate");
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btAdd){
            int a = Integer.parseInt(valueA.getText().toString());
            int b = Integer.parseInt(valueB.getText().toString());
            int sum = a+b;
            result.setText(sum);
        }
        if(view.getId() == R.id.btSub){

        }
        myTextView.setText("Button is clicked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(logTag, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(logTag, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(logTag, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(logTag, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(logTag, "onDestroy");
    }

}