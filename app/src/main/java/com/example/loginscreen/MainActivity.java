package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText usernameTxt;
    private EditText passwordTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button loginBtn = (Button) findViewById(R.id.button);
        usernameTxt = (EditText) findViewById(R.id.editTextTextPersonName);
        passwordTxt = (EditText) findViewById(R.id.editTextTextPassword);


        loginBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                boolean legit = usernameTxt.getText().toString().equals("admin") && passwordTxt.getText().toString().equals("123456");
                String message;
                message = legit ? "Welcome!" : "Invalid account";
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}