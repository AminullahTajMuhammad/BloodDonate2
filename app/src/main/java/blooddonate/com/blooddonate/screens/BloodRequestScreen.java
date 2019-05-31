package blooddonate.com.blooddonate.screens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

import blooddonate.com.blooddonate.R;

public class BloodRequestScreen extends AppCompatActivity {

    EditText spnBloodFor, spnCity;
    FirebaseFirestore db;
    FirebaseAuth auth;
    Button btnApositive, btnBpositive, btnAnegative, btnBnegative,
            btnOpositive, btnOnegative, btnABpositive, btnABnegative;
    Button btnSubmit;
    ImageButton imgBack;

    String bloodFor;
    String city;
    String bloodGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_request_screen);

        db = FirebaseFirestore.getInstance();
        auth = FirebaseAuth.getInstance();

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
                setDataOnFirebase();
                finish();
            }
        });


    }

    private void setDataOnFirebase() {
        String bloodFor = spnBloodFor.getText().toString();
        String city = spnCity.getText().toString();
        String bGroup = bloodGroup;

        Map<String, Object> user = new HashMap<>();
        user.put("Blood_For", bloodFor);
        user.put("City", city);
        user.put("B_Group", bGroup);

        DocumentReference doc = db.collection("request").document();
        user.put("Request_ID", doc.getId());
        user.put("UID", auth.getCurrentUser().getUid());
        doc.set(user)
                .addOnSuccessListener(this, new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(BloodRequestScreen.this, "Request Data Added", Toast.LENGTH_SHORT).show();
                    }
                });
    }


    public void onClickBtnAPositive(View view) {

        bloodGroup = "A+";

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

        bloodGroup = "A-";

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
        bloodGroup = "B+";

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

        bloodGroup = "B+";


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

        bloodGroup = "O+";

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

        bloodGroup = "O-";


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

        bloodGroup = "AB+";

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

        bloodGroup = "AB-";
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
