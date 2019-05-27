package blooddonate.com.blooddonate.screens;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import blooddonate.com.blooddonate.R;
import blooddonate.com.blooddonate.dialogs.VerifyNumber;

public class LoginScreen extends AppCompatActivity {

    TextView tvRegisterHere;
    Button btnLogin;

    TextInputLayout txtEmail;
    TextInputLayout txtPassword;

    TextInputEditText edtEmail;
    TextInputEditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        findViewByIds();

        tvRegisterHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginScreen.this, RegisterScreen.class));
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLoginAndValidate();
            }
        });
    }
    private void findViewByIds() {
        tvRegisterHere = findViewById(R.id.tvRegisterHere);
        btnLogin = findViewById(R.id.btnLogin);

        txtEmail = findViewById(R.id.txtEmail);
        txtPassword = findViewById(R.id.txtPassword);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
    }

    private void setLoginAndValidate() {
        String email = edtEmail.getText().toString();
        String password = edtPassword.getText().toString();

        if(!email.equals("") && !password.equals("")) {
            startActivity(new Intent(LoginScreen.this, BloodDetail.class));
        }

        if(email.equals("")) {
            txtEmail.setError("Email is Empty");
            return;
        }
        if(password.equals("")) {
            txtPassword.setError("Password is Empty");
            return;
        }
    }
}
