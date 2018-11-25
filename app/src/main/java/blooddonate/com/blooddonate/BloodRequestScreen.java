package blooddonate.com.blooddonate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class BloodRequestScreen extends AppCompatActivity {

    Spinner spnBloodFor, spnCity;
    Button btnApositive, btnBpositive, btnAnegative, btnBnegative,
            btnOpositive, btnOnegative, btnABpositive, btnABnegative;
    Button btnSubmit;
    ImageButton imgBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_request_screen);

        // Spinner id Declaration
        spnBloodFor = findViewById(R.id.spnBloodFor);
        spnCity = findViewById(R.id.spnCity);

        // button for blood
        // Button Blood Group Id's
        btnApositive = findViewById(R.id.btnApositive);
        btnAnegative = findViewById(R.id.btnAnegative);
        btnBpositive = findViewById(R.id.btnBpositive);
        btnBnegative = findViewById(R.id.btnBnegative);
        btnOpositive = findViewById(R.id.btnOpositive);
        btnOnegative = findViewById(R.id.btnOnegative);
        btnABpositive = findViewById(R.id.btnABpositive);
        btnABnegative = findViewById(R.id.btnABnegative);

        imgBack = findViewById(R.id.btnBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BloodRequestScreen.this, ExploreDonerScreen.class);
                startActivity(intent);
            }
        });

        // function of Spinners
        setBloodSpinner();
        setCitySpinner();

    }

    public void setBloodSpinner() {
        String[] strRelationForBlood = {"Friend", "Relatives", "Spouse", "Brother", "Sister"};
        ArrayAdapter<String> bloodAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,strRelationForBlood);
        spnBloodFor.setAdapter(bloodAdapter);
    }

    public void setCitySpinner() {
        String[] strCity = {"Hyderabad", "Shukkur", "Karachi", "Lahore", "Islamabad", "Hala", "Peshawar"};
        ArrayAdapter<String> cityAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,strCity);
        spnCity.setAdapter(cityAdapter);
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
