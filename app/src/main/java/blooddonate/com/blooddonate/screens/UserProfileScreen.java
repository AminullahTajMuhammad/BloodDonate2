package blooddonate.com.blooddonate.screens;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.firestore.Source;

import java.util.Objects;

import blooddonate.com.blooddonate.R;

public class UserProfileScreen extends AppCompatActivity {

    ImageButton imgBack;
    FirebaseAuth auth;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    TextView tvName, tvEmail, tvAddress, tvGender, tvNumber, tvBloodGroup;
    String documentID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile_screen);
        auth = FirebaseAuth.getInstance();
        findViewByIds();

        documentID = getIntent().getStringExtra("UID");

        imgBack = findViewById(R.id.btnUserScreenBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        fetchDataFromFirebase();


    }

    private void findViewByIds() {
        tvName = findViewById(R.id.tvName);
        tvEmail = findViewById(R.id.tvEmail);
        tvAddress = findViewById(R.id.tvAddress);
        tvGender = findViewById(R.id.tvGender);
        tvNumber = findViewById(R.id.tvNumber);
        tvBloodGroup = findViewById(R.id.tvBloodGroup);
    }

    private void fetchDataFromFirebase() {
        db.collection("users").whereEqualTo("UID", auth.getCurrentUser().getUid()).get()
                .addOnSuccessListener(this, new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                        for(QueryDocumentSnapshot document: queryDocumentSnapshots) {

                            String name = (String) document.get("Name");
                            String email = (String) document.get("Email");
                            String address = (String) document.get("Address");
                            String gender = (String) document.get("Gender");
                            String number = (String) document.get("Number");
                            String blood = (String) document.get("Blood_Group");

                            tvName.setText(name);
                            tvEmail.setText(email);
                            tvAddress.setText(address);
                            tvGender.setText(gender);
                            tvNumber.setText(number);
                            tvBloodGroup.setText(blood);

                        }
                    }
                });
    }
}
