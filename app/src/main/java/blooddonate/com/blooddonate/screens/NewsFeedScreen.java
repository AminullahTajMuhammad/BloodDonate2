package blooddonate.com.blooddonate.screens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

import blooddonate.com.blooddonate.models.NewsFeedData;
import blooddonate.com.blooddonate.R;
import blooddonate.com.blooddonate.adapters.NewsFeedAdapter;

public class NewsFeedScreen extends AppCompatActivity {

    ImageButton btnList;
    RecyclerView recyclerView;
    NewsFeedAdapter newsFeedAdapter;
    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
    ArrayList<NewsFeedData> newsFeedData = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_feed_screen);
        recyclerView = findViewById(R.id.newsFeedRecycler);

        btnList = findViewById(R.id.btnList);
        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewsFeedScreen.this, SameDonerScreen.class);
                startActivity(intent);
            }
        });


        setData();
        setAdapter();
    }

    public void setData() {
        newsFeedData.add(new NewsFeedData("Amanda","5:20 PM","Hyderabad",
                "individuals thought of as a group because of a " +
                "common quality or qualities type may suggest strong and clearly marked " +
                "similarity throughout the items included so that each is typical of the group." +
                " one of three basic body types kind may suggest"));

        newsFeedData.add(new NewsFeedData("John","5:20 PM","Hyderabad",
                "individuals thought of as a group because of a " +
                        "common quality or qualities type may suggest strong and clearly marked " +
                        "similarity throughout the items included so that each is typical of the group." +
                        " one of three basic body types kind may suggest"));

        newsFeedData.add(new NewsFeedData("Handler","5:20 PM","Hyderabad",
                "individuals thought of as a group because of a " +
                        "common quality or qualities type may suggest strong and clearly marked " +
                        "similarity throughout the items included so that each is typical of the group." +
                        " one of three basic body types kind may suggest"));

        newsFeedData.add(new NewsFeedData("Amanda","5:20 PM","Hyderabad",
                "individuals thought of as a group because of a " +
                        "common quality or qualities type may suggest strong and clearly marked " +
                        "similarity throughout the items included so that each is typical of the group." +
                        " one of three basic body types kind may suggest"));

        newsFeedData.add(new NewsFeedData("Tailor Swift","5:20 PM","Hyderabad",
                "individuals thought of as a group because of a " +
                        "common quality or qualities type may suggest strong and clearly marked " +
                        "similarity throughout the items included so that each is typical of the group." +
                        " one of three basic body types kind may suggest"));

        newsFeedData.add(new NewsFeedData("Cramer","5:20 PM","Hyderabad",
                "individuals thought of as a group because of a " +
                        "common quality or qualities type may suggest strong and clearly marked " +
                        "similarity throughout the items included so that each is typical of the group." +
                        " one of three basic body types kind may suggest"));

        newsFeedData.add(new NewsFeedData("Kressy","5:20 PM","Hyderabad",
                "individuals thought of as a group because of a " +
                        "common quality or qualities type may suggest strong and clearly marked " +
                        "similarity throughout the items included so that each is typical of the group." +
                        " one of three basic body types kind may suggest"));

        newsFeedData.add(new NewsFeedData("Henry","5:20 PM","Hyderabad",
                "individuals thought of as a group because of a " +
                        "common quality or qualities type may suggest strong and clearly marked " +
                        "similarity throughout the items included so that each is typical of the group." +
                        " one of three basic body types kind may suggest"));

    }

    public void setAdapter() {
        newsFeedAdapter = new NewsFeedAdapter(newsFeedData);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(newsFeedAdapter);
    }
}
