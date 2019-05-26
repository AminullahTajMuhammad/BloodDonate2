package blooddonate.com.blooddonate.screens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import blooddonate.com.blooddonate.R;

public class MainActivity extends AppCompatActivity {

    ImageButton btnMakeRequest, btnSameDoner, btnYourRequests, btnYourProfile;
    TextView tvMakeRequest, tvSameDoner, tvYourRequests, tvYourProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewByIds();

    }

    private void findViewByIds() {
        btnMakeRequest = findViewById(R.id.btnMakeRequest);
        tvMakeRequest = findViewById(R.id.tvMakeRequest);

        btnSameDoner = findViewById(R.id.btnSameDoner);
        tvSameDoner = findViewById(R.id.tvSameDoner);

        btnYourRequests = findViewById(R.id.btnYourRequest);
        tvYourRequests = findViewById(R.id.tvYourRequest);

        btnYourProfile = findViewById(R.id.btnYourProfile);
        tvYourProfile = findViewById(R.id.tvYourProfile);

    }


}
