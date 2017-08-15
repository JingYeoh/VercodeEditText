package com.jkb.vercodeedittext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jkb.vcedittext.VerificationCodeEditText;

public class MainActivity extends AppCompatActivity {

    private VerificationCodeEditText verificationCodeEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        verificationCodeEditText = (VerificationCodeEditText) findViewById(R.id.am_et);
        verificationCodeEditText.setOnVerificationCodeChangedListener(new VerificationCodeEditText
                .OnVerificationCodeChangedListener() {

            @Override
            public void onVerCodeChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void onInputCompleted(CharSequence s) {

            }
        });
    }
}
