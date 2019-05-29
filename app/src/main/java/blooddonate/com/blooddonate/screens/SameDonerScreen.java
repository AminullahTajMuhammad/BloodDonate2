package blooddonate.com.blooddonate.screens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

import blooddonate.com.blooddonate.models.AllDonerData;
import blooddonate.com.blooddonate.R;
import blooddonate.com.blooddonate.adapters.SmaeDonerScreenAdapter;

public class SameDonerScreen extends AppCompatActivity {

    ImageButton imgBack;

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
    SmaeDonerScreenAdapter adapter;
    ArrayList<AllDonerData> requestScreenData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_same_doner_screen);

        recyclerView = findViewById(R.id.requestRecycler);

        imgBack = findViewById(R.id.btnBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        setData();
        setRecyclerView();
    }

    public void setRecyclerView() {
        adapter = new SmaeDonerScreenAdapter(requestScreenData);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void setData() {
        requestScreenData.add(new AllDonerData("John", "New York", "B+", "03128136056"));
        requestScreenData.add(new AllDonerData("Cramer", "Hong Kong", "B-","03215693338"));
        requestScreenData.add(new AllDonerData("Amanda", "Maxico", "O+", "03426744829"));
        requestScreenData.add(new AllDonerData("Handler", "Sillcon Velly", "A+","03238795493"));
        requestScreenData.add(new AllDonerData("Kressy", "America", "AB+","03128136056"));
        requestScreenData.add(new AllDonerData("Tailor Swift", "Islamabad", "B+","03426744829"));
        requestScreenData.add(new AllDonerData("Henry", "Lahore", "O+","03238795493"));
        requestScreenData.add(new AllDonerData("Handler", "Zambia", "AB-","03128136056"));
        requestScreenData.add(new AllDonerData("Kressy", "Bangladesh", "AB+"));
        requestScreenData.add(new AllDonerData("Handler", "Abu Dhabi", "B-","03128136056"));
    }
}
