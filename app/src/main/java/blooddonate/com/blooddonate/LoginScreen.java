package blooddonate.com.blooddonate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class LoginScreen extends AppCompatActivity {

    LinearLayout fbLayout;
    LinearLayout googleLayout;
    LinearLayout numberLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        fbLayout = findViewById(R.id.layoutFB);
        googleLayout = findViewById(R.id.layoutGoogle);
        numberLayout = findViewById(R.id.layoutNumber);


        fbLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        googleLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        numberLayout.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(LoginScreen.this, VerifyNumber.class);
            }
        });
    }
}
