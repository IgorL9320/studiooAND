package com.example.registrationformappp;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextName;
    EditText editTextEmail;
    EditText editTextPassword;
    EditText editTextCheckPassword;
    Button Submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.name);
        editTextEmail = findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);
        editTextCheckPassword = findViewById(R.id.password);

        Submit = findViewById(R.id.submit);
        Submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String name = editTextName.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();
                String checkpassword = editTextCheckPassword.getText().toString().trim();

                if(name.isEmpty()){
                    Toast.makeText(MainActivity.this,"Podaj Imie", Toast.LENGTH_SHORT).show();
                }else if(email.isEmpty()){
                    Toast.makeText(MainActivity.this,"Podaj E-mail", Toast.LENGTH_SHORT).show();
                }else if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    Toast.makeText(MainActivity.this,"Niepoprawny adres email", Toast.LENGTH_SHORT).show();
                }else if(password.length()<6){
                    Toast.makeText(MainActivity.this,"Podane hasło jest za krótkie", Toast.LENGTH_SHORT).show();
                }else if(!password.equals(checkpassword)){
                    Toast.makeText(MainActivity.this,"Podane hasła różnią się", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Formularz został przesłany", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}









