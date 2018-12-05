package com.example.edilson.assistance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    EditText usernameE;
    EditText passwordE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameE = findViewById(R.id.et_username);
        passwordE = findViewById(R.id.et_password);
    }

    public void login(View view){
        String username = usernameE.getText().toString().trim();
        String password = passwordE.getText().toString().trim();

        if (username.isEmpty()){

            return;
        }else if (password.isEmpty()){
            return;
        }

        Call<User> call = RetrofitClient.getInstance().getApi().login(username, password);

        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                User user = response.body();

                if (user != null){
                    Toast.makeText(MainActivity.this, "Bienvenido", Toast.LENGTH_LONG).show();

                }else{
                    Toast.makeText(MainActivity.this, "Verifique los datos", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
