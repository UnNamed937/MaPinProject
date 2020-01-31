package myapplication.example.mapinproject.business.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


import com.google.firebase.auth.FirebaseAuth;

import com.google.firebase.database.FirebaseDatabase;

import myapplication.example.mapinproject.R;

import myapplication.example.mapinproject.data.storage.GetProvider;
import myapplication.example.mapinproject.data.storage.UserStorage;

public class UserRegisterActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText musernameText;
    private EditText mkomentoText;
    private FirebaseAuth mAuth;
    private FirebaseDatabase database;
    private TextView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register);

        musernameText = findViewById(R.id.usernameText3);
        mkomentoText = findViewById(R.id.komentoText6);
        findViewById(R.id.tourokuButton).setOnClickListener(this);
        mAuth = FirebaseAuth.getInstance();


    }


public void onClick(View v) {
    GetProvider getProvider = new GetProvider();
    UserStorage storage2 = new UserStorage();
    System.out.println(getProvider.getProviderData());
    int i = v.getId();
    if (i == R.id.tourokuButton) {
       storage2.newCreate(musernameText.getText().toString(),  mkomentoText.getText().toString(), getProvider.getProviderData());
        changeHomeActivity();
    }
}
    private void changeHomeActivity() {
        Intent intent = new Intent(UserRegisterActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    }




