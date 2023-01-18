package com.example.new_projectss1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText loginText,passwordText;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        loginText = (EditText) findViewById(R.id.login);
        passwordText = (EditText) findViewById(R.id.password);
        btnlogin = (Button) findViewById(R.id.buttonlogin);

        btnlogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                String username = loginText.getText().toString();
                String password = passwordText.getText().toString();

                if(username.equals("user") && (password.equals("123456")))
                {
                    Toast.makeText(MainActivity2.this, "Done", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),NewActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity2.this, "Invalid", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}