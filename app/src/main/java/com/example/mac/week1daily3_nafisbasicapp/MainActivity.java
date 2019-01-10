package com.example.mac.week1daily3_nafisbasicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
//    private Button showBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textViewId);
        editText = findViewById(R.id.editTextId);
//        showBtn = findViewById(R.id.showBtnId);



//        showBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String typedText = editText.getText().toString();
//                textView.setText(typedText);
//
//            }
//        });
    }

    public void onClick(View view){

        String typedText = editText.getText().toString();
        textView.setText(typedText);
    }
}
