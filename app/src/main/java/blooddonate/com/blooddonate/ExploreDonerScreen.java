package blooddonate.com.blooddonate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ExploreDonerScreen extends AppCompatActivity {

    ExporeDonerAdapter adapter;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
    ArrayList<AllDonerData> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_doner_screen);

        recyclerView = findViewById(R.id.my_recycler_view);
        recyclerView.setLayoutManager(layoutManager);
        setAdapter();
        intializeData();

    }

    public void setAdapter() {
        adapter = new ExporeDonerAdapter(data);
        recyclerView.setAdapter(adapter);
    }

    public void intializeData() {
        data.add(new AllDonerData("John", "New York", "B+"));
        data.add(new AllDonerData("Cramer", "Hong Kong", "B-"));
        data.add(new AllDonerData("Amanda", "Maxico", "O+"));
        data.add(new AllDonerData("Handler", "Sillcon Velly", "A+"));
        data.add(new AllDonerData("Kressy", "America", "AB+"));
        data.add(new AllDonerData("Tailor Swift", "Islamabad", "B+"));
        data.add(new AllDonerData("Henry", "Lahore", "O+"));
        data.add(new AllDonerData("Handler", "Zambia", "AB-"));
        data.add(new AllDonerData("Kressy", "Bangladesh", "AB+"));
        data.add(new AllDonerData("Handler", "Abu Dhabi", "B-"));

    }
}
