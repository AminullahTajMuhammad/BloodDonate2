package blooddonate.com.blooddonate.screens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

import blooddonate.com.blooddonate.R;
import blooddonate.com.blooddonate.adapters.UserRequestAdapter;
import blooddonate.com.blooddonate.models.UserRequestDataModel;

public class UsersRequestScreen extends AppCompatActivity {

    FirebaseFirestore db;
    FirebaseAuth auth;

    ArrayList<UserRequestDataModel> list = new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
    UserRequestAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_request_screen);

        db = FirebaseFirestore.getInstance();
        auth = FirebaseAuth.getInstance();

        recyclerView = findViewById(R.id.userRequestRecycler);

        setData();
        setRecyclerView();
    }

    private void setRecyclerView() {
        myAdapter = new UserRequestAdapter(list, this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myAdapter);

    }

    private void setData() {


        db.collection("request").whereEqualTo("UID", auth.getCurrentUser().getUid()).get()
                .addOnSuccessListener(this, new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                        for(QueryDocumentSnapshot document: queryDocumentSnapshots) {
                            String bloodFor = (String)document.get("Blood_For");
                            String bGroup = (String) document.get("B_Group");
                            String city = (String) document.get("City");

                            list.add(new UserRequestDataModel(bloodFor, city, bGroup));
                            myAdapter.notifyDataSetChanged();
                        }
                    }
                });



//
//        list.add(new UserRequestDataModel("Spouse", "Karachi", "A+"));
//        list.add(new UserRequestDataModel("Sister", "Lahore", "AB+"));
//        list.add(new UserRequestDataModel("Brother", "Islamabad", "AB-"));
//        list.add(new UserRequestDataModel("Father", "Lahore", "B+"));
//        list.add(new UserRequestDataModel("Mother", "Hyderabad", "A-"));
//        list.add(new UserRequestDataModel("Relatives", "Karachi", "AB-"));
//        list.add(new UserRequestDataModel("Brother", "Hyderabad", "B-"));
//        list.add(new UserRequestDataModel("Mother", "Lahore", "O+"));
//        list.add(new UserRequestDataModel("Relatives", "Hyderabad", "AB-"));
//        list.add(new UserRequestDataModel("Brother", "Karachi", "O-"));
    }


}
