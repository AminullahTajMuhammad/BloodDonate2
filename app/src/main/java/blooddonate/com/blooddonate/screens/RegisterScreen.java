package blooddonate.com.blooddonate.screens;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import blooddonate.com.blooddonate.R;

public class RegisterScreen extends AppCompatActivity {

    TextInputEditText edtName, edtEmail, edtPassword, edtNumber;
    TextView tvLoginHere;
    Button btnRegister;

    String mName = "";
    String mEmail = "";
    String mPassword = "";
    String mNumber = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);
        findViewByIds();

        tvLoginHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterScreen.this, LoginScreen.class));
                finish();
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getRegisterDataAndCheckValidation();
            }
        });
    }

    private void getRegisterDataAndCheckValidation() {

    }

    private void findViewByIds() {
        edtName = findViewById(R.id.edtRegisterName);
        edtEmail = findViewById(R.id.edtRegisterEmail);
        edtPassword = findViewById(R.id.edtRegisterPassword);
        edtNumber = findViewById(R.id.edtRegisterNumber);

        tvLoginHere = findViewById(R.id.tvLoginHere);
        btnRegister = findViewById(R.id.btnRegister);
    }
}
