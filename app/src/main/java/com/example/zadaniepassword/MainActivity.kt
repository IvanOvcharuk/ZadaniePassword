package com.example.zadaniepassword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var showHideBtn1: Button;
    lateinit var pwd1: EditText;
    lateinit var showHideBtn2: Button;
    lateinit var pwd2: EditText;
    lateinit var sprawdz1: Button;
    lateinit var sprawdz2: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showHideBtn1 = findViewById(R.id.button3);
        pwd1 = findViewById(R.id.editTextNumberPassword);
        showHideBtn2 = findViewById(R.id.button4);
        pwd2 = findViewById(R.id.editTextNumberPassword2);
        sprawdz1 = findViewById(R.id.button);
        sprawdz2 = findViewById(R.id.button2);

        var pass1 = "";
        var pass2 = "";

       showHideBtn1.setOnClickListener {
            if (showHideBtn1.text.toString().equals("Show")) {
                pwd1.transformationMethod = HideReturnsTransformationMethod.getInstance()
                showHideBtn1.text = "Hide"
            } else {
                pwd1.transformationMethod = PasswordTransformationMethod.getInstance()
                showHideBtn1.text = "Show"
            }
        }
        showHideBtn2.setOnClickListener {
            if (showHideBtn2.text.toString().equals("Show")) {
                pwd2.transformationMethod = HideReturnsTransformationMethod.getInstance()
                showHideBtn2.text = "Hide"
            } else {
                pwd2.transformationMethod = PasswordTransformationMethod.getInstance()
                showHideBtn2.text = "Show"
            }
        }

        showHideBtn2.setOnClickListener {
            pass1 = sprawdz1.text.toString();

        }



    }
}