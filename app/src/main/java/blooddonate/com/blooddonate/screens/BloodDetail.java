package blooddonate.com.blooddonate.screens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import blooddonate.com.blooddonate.R;

public class BloodDetail extends AppCompatActivity {

    TextView tvMale, tvFemale;
    Button btnApositive, btnAnegative, btnBpositive, btnBnegative,
            btnABpositive, btnABnegative, btnOpositive, btnOnegative;
    Button btnDone;
    ImageButton btnBack;

    private EditText edtName, edtAddress;

    private String bloodGroup = "";
    private String gender = "";
    private String mName = "";
    private String mAddress = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_detail);

        findViewByIds();

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDonationDetailAndCheckValidation();
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void getDonationDetailAndCheckValidation() {
        mName = edtName.getText().toString();
        mAddress = edtAddress.getText().toString();
        String bGroup = bloodGroup;
        String gendar = gender;

        if(!gendar.equals("") && !bGroup.equals("") && !mName.equals("") && !mAddress.equals("")) {
            Intent intent = new Intent(BloodDetail.this, MainActivity.class);
            startActivity(intent);
        }

        if(mName.equals("")) {
            edtName.setError("Please Enter this field");
            return;
        }

        if(mAddress.equals("")) {
            edtAddress.setError("Please Enter this field");
        }

        if(gendar.equals("")) {
            Toast.makeText(this, "Please Select Gender", Toast.LENGTH_SHORT).show();
            return;
        }
        if(bGroup.equals("")) {
            Toast.makeText(this, "Please Select Blood Group", Toast.LENGTH_SHORT).show();
            return;
        }

    }

    private void findViewByIds() {

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

        btnBack = findViewById(R.id.btnBackBecomeDoner);

        // EditTexts
        edtName = findViewById(R.id.edtName);
        edtAddress = findViewById(R.id.edtAddress);

    }

    public void onCLickMale(View view) {
        tvMale.setTextColor(getResources().getColor(R.color.colorAccent));
        tvFemale.setTextColor(getResources().getColor(R.color.colorBlack));

        gender = "Male";
    }

    public void onClickFemale(View view) {
        tvFemale.setTextColor(getResources().getColor(R.color.colorAccent));
        tvMale.setTextColor(getResources().getColor(R.color.colorBlack));

        gender = "Female";
    }

    public void onClickBtnAPositive(View view) {

        // A+ and A-
        btnApositive.setBackgroundColor(getResources().getColor(R.color.colorLightAccent));
        btnApositive.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_border_color_ancent));

        bloodGroup = "A+";

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

        bloodGroup = "A-";

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

        bloodGroup = "B+";

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

        bloodGroup = "B-";

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

        bloodGroup = "O+";

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

        bloodGroup = "O-";

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

        bloodGroup = "AB+";

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

        bloodGroup = "AB-";
    }
}
