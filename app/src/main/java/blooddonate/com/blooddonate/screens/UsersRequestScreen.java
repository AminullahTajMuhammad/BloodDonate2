package blooddonate.com.blooddonate.screens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import blooddonate.com.blooddonate.R;
import blooddonate.com.blooddonate.adapters.UserRequestAdapter;
import blooddonate.com.blooddonate.models.UserRequestDataModel;

public class UsersRequestScreen extends AppCompatActivity {

    ArrayList<UserRequestDataModel> list = new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
    UserRequestAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_request_screen);

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

        list.add(new UserRequestDataModel("Firend", "Hyderabad", "B+"));
        list.add(new UserRequestDataModel("Spouse", "Karachi", "A+"));
        list.add(new UserRequestDataModel("Sister", "Lahore", "AB+"));
        list.add(new UserRequestDataModel("Brother", "Islamabad", "AB-"));
        list.add(new UserRequestDataModel("Father", "Lahore", "B+"));
        list.add(new UserRequestDataModel("Mother", "Hyderabad", "A-"));
        list.add(new UserRequestDataModel("Relatives", "Karachi", "AB-"));
        list.add(new UserRequestDataModel("Brother", "Hyderabad", "B-"));
        list.add(new UserRequestDataModel("Mother", "Lahore", "O+"));
        list.add(new UserRequestDataModel("Relatives", "Hyderabad", "AB-"));
        list.add(new UserRequestDataModel("Brother", "Karachi", "O-"));
    }


}
