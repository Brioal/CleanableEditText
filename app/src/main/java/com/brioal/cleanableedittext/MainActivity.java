package com.brioal.cleanableedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.brioal.cleanableedittextview.ClearEditText;

public class MainActivity extends AppCompatActivity {
    private ClearEditText mClearEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mClearEditText = findViewById(R.id.main_editText);
        mClearEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                System.out.println(mClearEditText.getInputPhone());
            }
        });
    }
}
