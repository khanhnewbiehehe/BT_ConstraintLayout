package com.example.bt_constranitlayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        TextView btn = findViewById(R.id.alreadyHaveAccount);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
            }
        });

        Button registerBtn = findViewById(R.id.btnRegister);
        EditText name = findViewById(R.id.inputUsername);
        EditText email = findViewById(R.id.inputEmail);
        EditText pass = findViewById(R.id.inputPassword);
        TextView inform = findViewById(R.id.displayInformation);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailEntered = email.getText().toString();
                String passEntered = pass.getText().toString();
                String nameEntered = name.getText().toString();
                inform.setText("Username: " + nameEntered + " Email: " + emailEntered + " Password: " + passEntered );
            }
        });
    }
}