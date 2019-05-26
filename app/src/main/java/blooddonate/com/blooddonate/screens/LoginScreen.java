package blooddonate.com.blooddonate.screens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import blooddonate.com.blooddonate.R;
import blooddonate.com.blooddonate.dialogs.VerifyNumber;

public class LoginScreen extends AppCompatActivity {

    TextView tvRegisterHere;

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
    }
    private void findViewByIds() {
        tvRegisterHere = findViewById(R.id.tvRegisterHere);
    }
}
