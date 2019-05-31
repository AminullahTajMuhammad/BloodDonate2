package blooddonate.com.blooddonate.screens;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import blooddonate.com.blooddonate.R;

public class RegisterScreen extends AppCompatActivity {

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    DocumentReference document;

    String mName = "";
    String mEmail = "";
    String mPassword = "";
    String mNumber = "";


    TextInputEditText edtName, edtEmail, edtPassword, edtNumber;
    TextView tvLoginHere;
    Button btnRegister;

    FirebaseUser firebaseUser;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);
        findViewByIds();
        tvLoginHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mAuth = FirebaseAuth.getInstance();
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getRegisterDataAndCheckValidation();
            }
        });
    }

    private void getRegisterDataAndCheckValidation() {
        String name = edtName.getText().toString();
        String email = edtEmail.getText().toString();
        String password = edtPassword.getText().toString();
        String number = edtNumber.getText().toString();

        if(!name.equals("") && !email.equals("") && !password.equals("") && !number.equals("")) {
            createUserOnFirebase(name, email, password, number);
            //finish();
        }

        if(name.equals("")) {
            edtName.setError("Name is Empty");
        }

        if (email.equals("")) {
            edtEmail.setError("Email is Empty");
            return;
        }
        if (password.equals("")) {
            edtPassword.setError("Password is Empty");
            return;
        }
        if(number.equals("")) {
            edtNumber.setError("Number is Empty");
        }

    }

    private void createUserOnFirebase(String name, String email, String password, String number) {

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(RegisterScreen.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Toast.makeText(RegisterScreen.this, "createUserWithEmail:onComplete:" + task.isSuccessful(), Toast.LENGTH_SHORT).show();
                        // If sign in fails, display a message to the user. If sign in succeeds
                        // the auth state listener will be notified and logic to handle the
                        // signed in user can be handled in the listener.
                        if (!task.isSuccessful()) {
                            Toast.makeText(RegisterScreen.this, "Authentication failed." + task.getException(),
                                    Toast.LENGTH_SHORT).show();
                            Log.e("Error", "Authentication failed." + task.getException());
                        }
                    }
                });


        createUserOnFirebaseFirestore(name, email, password, number);
    }


    private void createUserOnFirebaseFirestore(String name, String email, String password, String number) {
        
        Map<String, Object> user = new HashMap<>();
        user.put("User_Name", name);
        user.put("Email", email);
        user.put("Password", password);
        user.put("Number", number);
        user.put("User_ID", mAuth.getCurrentUser().getUid());

        mName = name;
        mEmail = email;
        mPassword = password;
        mNumber = number;

        DocumentReference doc = db.collection("users").document();
        document = doc;

//        user.put("User_ID", doc.getId());
        
//        doc.set(user)


                db.collection("users").document(mAuth.getCurrentUser().getUid()).set(user).addOnSuccessListener(this, new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(RegisterScreen.this, "Registered Account", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(RegisterScreen.this, BloodDetail.class);
                        intent.putExtra("Name", mName);
                        intent.putExtra("Email", mEmail);
                        intent.putExtra("Password", mPassword);
                        intent.putExtra("Number", mNumber);
                        intent.putExtra("UID", document.getId());
                        startActivity(intent);
                        finish();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(RegisterScreen.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                    }
                });


////        // Send Data to BloodDetailed Screen
//        Intent intent = new Intent(RegisterScreen.this, BloodDetail.class);
//        intent.putExtra("Name", name);
//        intent.putExtra("Email", email);
//        intent.putExtra("Password", password);
//        intent.putExtra("Number", number);
//        intent.putExtra("UID",mAuth.getCurrentUser().getUid().toString());
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
