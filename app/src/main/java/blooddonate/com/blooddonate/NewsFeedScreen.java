package blooddonate.com.blooddonate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class NewsFeedScreen extends AppCompatActivity {

    RecyclerView recyclerView;
    NewsFeedAdapter newsFeedAdapter;
    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
    ArrayList<NewsFeedData> newsFeedData = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_feed_screen);
        recyclerView = findViewById(R.id.newsFeedRecycler);

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
