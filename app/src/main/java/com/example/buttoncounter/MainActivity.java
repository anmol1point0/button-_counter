package com.example.buttoncounter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText userInput;
   // private Button button;
    private TextView textview;
    private static final String TAG = "MainActivity";
    private final String Textcontents= "textcontents";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG,"oncreate: in");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //all widgets in android are views.
        userInput=(EditText) findViewById(R.id.editText); // findViewBYID alwasy returns a view.
        Button button =(Button)findViewById(R.id.button);
        textview=(TextView) findViewById(R.id.textView);
        textview.setText("");
        userInput.setText("");
        textview.setMovementMethod(new ScrollingMovementMethod());
        View.OnClickListener ourOnclickListener =new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String res= userInput.getText().toString();
                res=res+"\n";
                userInput.setText("");
                textview.append(res);
            }
        };
        button.setOnClickListener(ourOnclickListener);
        Log.d(TAG,"oncreate: out");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: in");
        super.onStop();
        Log.d(TAG, "onStop: out");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "onSaveInstanceState: in");
        outState.putString(Textcontents,textview.getText().toString());
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState: out");
    }

    @Override
    protected void onRestart() {
        Log.d(TAG,"onRestart: in");
        super.onRestart();
        Log.d(TAG,"onRestart: out");
    }

    @Override
    protected void onResume() {
        Log.d(TAG,"onResume: in");
        super.onResume();
        Log.d(TAG,"onResume: out");
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG,"onDestroy: in");
        super.onDestroy();
        Log.d(TAG,"onDestroy: out");
    }

    @Override
    protected void onPause() {
        Log.d(TAG,"onPause: in");
        super.onPause();
        Log.d(TAG,"onPause: out");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        Log.d(TAG,"onRestoreInstanceState: in");
        super.onRestoreInstanceState(savedInstanceState);
        textview.setText(savedInstanceState.getString(Textcontents));
        Log.d(TAG,"onRestoreInstanceState: out");
    }

    @Override
    protected void onStart() {
        Log.d(TAG,"onstart: in");
        super.onStart();
        Log.d(TAG,"onstart: out");
    }
}
