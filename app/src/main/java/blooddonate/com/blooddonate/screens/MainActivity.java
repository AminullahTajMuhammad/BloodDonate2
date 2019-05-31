package blooddonate.com.blooddonate.screens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

import blooddonate.com.blooddonate.R;

public class MainActivity extends AppCompatActivity {

    FirebaseAuth auth;
    ImageButton btnMakeRequest, btnSameDoner, btnYourRequests, btnYourProfile;
    TextView tvMakeRequest, tvSameDoner, tvYourRequests, tvYourProfile, tvLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewByIds();


        auth = FirebaseAuth.getInstance();

        tvLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auth.signOut();
                finish();
            }
        });



        btnMakeRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickCreateRequest();
            }
        });

        btnSameDoner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickSameDoners();
            }
        });

        btnYourProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickUserProfile();
            }
        });

        btnYourRequests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickYourRequests();
            }
        });

    }

    private void findViewByIds() {
        tvLogout = findViewById(R.id.tvLogout);

        btnMakeRequest = findViewById(R.id.btnMakeRequest);
        tvMakeRequest = findViewById(R.id.tvMakeRequest);

        btnSameDoner = findViewById(R.id.btnSameDoner);
        tvSameDoner = findViewById(R.id.tvSameDoner);

        btnYourRequests = findViewById(R.id.btnYourRequest);
        tvYourRequests = findViewById(R.id.tvYourRequest);

        btnYourProfile = findViewById(R.id.btnYourProfile);
        tvYourProfile = findViewById(R.id.tvYourProfile);

    }

    private void onClickSameDoners() {
        startActivity(new Intent(MainActivity.this, SameDonerScreen.class));
    }

    private void onClickYourRequests() {
        startActivity(new Intent(MainActivity.this, UsersRequestScreen.class));
    }

    private void onClickUserProfile() {
        startActivity(new Intent(MainActivity.this, UserProfileScreen.class));
    }

    private void onClickCreateRequest() {
        startActivity(new Intent(MainActivity.this, BloodRequestScreen.class));
    }


}
