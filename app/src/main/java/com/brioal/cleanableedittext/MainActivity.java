package com.brioal.cleanableedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.brioal.cleanableedittextview.ClearEditText;

public class MainActivity extends AppCompatActivity {
    private ClearEditText mClearEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mClearEditText = findViewById(R.id.main_editText);
        mClearEditText.setPhoneInput();
    }
}
