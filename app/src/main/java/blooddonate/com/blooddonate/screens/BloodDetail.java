package blooddonate.com.blooddonate.screens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import blooddonate.com.blooddonate.R;

public class BloodDetail extends AppCompatActivity {

    TextView tvMale, tvFemale;
    Button btnApositive, btnAnegative, btnBpositive, btnBnegative,
            btnABpositive, btnABnegative, btnOpositive, btnOnegative;
    Button btnDone;
    ImageButton imgBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_detail);


        // Text View ids
        tvMale = findViewById(R.id.tvMale);
        tvFemale = findViewById(R.id.tvFemale);

        // Button Blood Group Id's
        btnApositive = findViewById(R.id.btnApositive);
        btnAnegative = findViewById(R.id.btnAnegative);
        btnBpositive = findViewById(R.id.btnBpositive);
        btnBnegative = findViewById(R.id.btnBnegative);
        btnOpositive = findViewById(R.id.btnOpositive);
        btnOnegative = findViewById(R.id.btnOnegative);
        btnABpositive = findViewById(R.id.btnABpositive);
        btnABnegative = findViewById(R.id.btnABnegative);


        // Button Done
        btnDone = findViewById(R.id.btnDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BloodDetail.this, BloodRequestScreen.class);
                startActivity(intent);
            }
        });

        imgBack = findViewById(R.id.btnBackBecomeDoner);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void onCLickMale(View view) {
        tvMale.setTextColor(getResources().getColor(R.color.colorAccent));
        tvFemale.setTextColor(getResources().getColor(R.color.colorBlack));
    }

    public void onClickFemale(View view) {
        tvFemale.setTextColor(getResources().getColor(R.color.colorAccent));
        tvMale.setTextColor(getResources().getColor(R.color.colorBlack));
    }

    public void onClickBtnAPositive(View view) {

        // A+ and A-
        btnApositive.setBackgroundColor(getResources().getColor(R.color.colorLightAccent));
        btnApositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border_color_ancent));

        btnAnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnAnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        // B+ and B-
        btnBpositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnBpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnBnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnBnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        // O+ and O-
        btnOpositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnOpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnOnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnOnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        //AB+ and AB-
        btnABpositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnABpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnABnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnABnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));
    }

    public void onClickBtnANegative(View view) {

        // A+ and A-
        btnApositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnApositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnAnegative.setBackgroundColor(getResources().getColor(R.color.colorLightAccent));
        btnAnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border_color_ancent));

        // B+ and B-
        btnBpositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnBpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnBnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnBnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        // O+ and O-
        btnOpositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnOpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnOnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnOnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        //AB+ and AB-
        btnABpositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnABpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnABnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnABnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));
    }

    public void onClickBtnBPositive(View view) {

        // A+ and A-

        btnApositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnApositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnAnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnAnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        // B+ and B-
        btnBpositive.setBackgroundColor(getResources().getColor(R.color.colorLightAccent));
        btnBpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border_color_ancent));

        btnBnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnBnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        // O+ and O-
        btnOpositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnOpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnOnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnOnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        //AB+ and AB-
        btnABpositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnABpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnABnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnABnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));
    }

    public void onClickBtnBNegative(View view) {

        // A+ and A-
        btnApositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnApositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnAnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnAnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        // B+ and B-
        btnBpositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnBpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnBnegative.setBackgroundColor(getResources().getColor(R.color.colorLightAccent));
        btnBnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border_color_ancent));

        // O+ and O-
        btnOpositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnOpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnOnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnOnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        //AB+ and AB-
        btnABpositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnABpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnABnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnABnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));
    }

    public void onClickBtnOPositive(View view) {
        // A+ and A-
        btnApositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnApositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnAnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnAnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        // B+ and B-
        btnBpositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnBpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnBnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnBnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        // O+ and O-
        btnOpositive.setBackgroundColor(getResources().getColor(R.color.colorLightAccent));
        btnOpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border_color_ancent));

        btnOnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnOnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        //AB+ and AB-
        btnABpositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnABpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnABnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnABnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));
    }

    public void onClickBtnONegative(View view) {
        // A+ and A-
        btnApositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnApositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnAnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnAnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        // B+ and B-
        btnBpositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnBpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnBnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnBnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        // O+ and O-
        btnOpositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnOpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnOnegative.setBackgroundColor(getResources().getColor(R.color.colorLightAccent));
        btnOnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border_color_ancent));

        //AB+ and AB-
        btnABpositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnABpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnABnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnABnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

    }

    public void onClickBtnABPositive(View view) {

        // A+ and A-
        btnApositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnApositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnAnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnAnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        // B+ and B-
        btnBpositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnBpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnBnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnBnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        // O+ and O-
        btnOpositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnOpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnOnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnOnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        //AB+ and AB-
        btnABpositive.setBackgroundColor(getResources().getColor(R.color.colorLightAccent));
        btnABpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border_color_ancent));

        btnABnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnABnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));
    }

    public void onClickBtnABNegative(View view) {
        // A+ and A-
        btnApositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnApositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnAnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnAnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        // B+ and B-
        btnBpositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnBpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnBnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnBnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        // O+ and O-
        btnOpositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnOpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnOnegative.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnOnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        //AB+ and AB-
        btnABpositive.setBackgroundColor(getResources().getColor(R.color.colorGray));
        btnABpositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border));

        btnABnegative.setBackgroundColor(getResources().getColor(R.color.colorLightAccent));
        btnABnegative.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border_color_ancent));
    }
}
