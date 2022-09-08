package com.github.ssferraz.pdmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void logar(View view) {
        Button buttonLogIn = (Button) findViewById(R.id.buttonLogIn);
        EditText name = (EditText) findViewById(R.id.editTextName);
        EditText password = (EditText) findViewById(R.id.editTextPassword);
        CheckBox isKeepLogged = (CheckBox) findViewById(R.id.checkBoxIsKeepLogged);
        buttonLogIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               System.out.println(name.getText());
               System.out.println(password.getText());
               System.out.println(isKeepLogged.isChecked());
            }
        });
    }
}