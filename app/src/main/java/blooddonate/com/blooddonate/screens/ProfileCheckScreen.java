package blooddonate.com.blooddonate.screens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

import blooddonate.com.blooddonate.models.NewsFeedData;
import blooddonate.com.blooddonate.adapters.ProfileCheckAdapter;
import blooddonate.com.blooddonate.R;

public class ProfileCheckScreen extends AppCompatActivity {

    ArrayList<NewsFeedData> data1 = new ArrayList<>();
    ImageButton imgBtnOption, imgBtnBack;
    TextView tvToolBarName;

    RecyclerView recyclerView;
    RecyclerView.LayoutManager mlayoutManager = new LinearLayoutManager(this);
    ProfileCheckAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_check_screen);
        recyclerView = findViewById(R.id.profileRecyclerView);

        initDummy();
        setRecyclerView();
    }

    public void initDummy() {
        data1 = new ArrayList<>();

        data1.add( new NewsFeedData("Amanda","5:20 PM","Hyderabad",
                "individuals thought of as a group because of a " +
                        "common quality or qualities type may suggest strong and clearly marked " +
                        "similarity throughout the items included so that each is typical of the group." +
                        " one of three basic body types kind may suggest"));

        data1.add(new NewsFeedData("Amanda","5:20 PM","Hyderabad",
                "individuals thought of as a group because of a " +
                        "common quality or qualities type may suggest strong and clearly marked " +
                        "similarity throughout the items included so that each is typical of the group." +
                        " one of three basic body types kind may suggest"));

        data1.add(new NewsFeedData("Tailor Swift","5:20 PM","Hyderabad",
                "individuals thought of as a group because of a " +
                        "common quality or qualities type may suggest strong and clearly marked " +
                        "similarity throughout the items included so that each is typical of the group." +
                        " one of three basic body types kind may suggest"));

        data1.add(new NewsFeedData("Cramer","5:20 PM","Hyderabad",
                "individuals thought of as a group because of a " +
                        "common quality or qualities type may suggest strong and clearly marked " +
                        "similarity throughout the items included so that each is typical of the group." +
                        " one of three basic body types kind may suggest"));

        data1.add(new NewsFeedData("Kressy","5:20 PM","Hyderabad",
                "individuals thought of as a group because of a " +
                        "common quality or qualities type may suggest strong and clearly marked " +
                        "similarity throughout the items included so that each is typical of the group." +
                        " one of three basic body types kind may suggest"));

        data1.add(new NewsFeedData("Henry","5:20 PM","Hyderabad",
                "individuals thought of as a group because of a " +
                        "common quality or qualities type may suggest strong and clearly marked " +
                        "similarity throughout the items included so that each is typical of the group." +
                        " one of three basic body types kind may suggest"));
    }

    public void setRecyclerView() {
        mAdapter = new ProfileCheckAdapter(data1);
        recyclerView.setLayoutManager(mlayoutManager);
        recyclerView.setAdapter(mAdapter);
    }
}
