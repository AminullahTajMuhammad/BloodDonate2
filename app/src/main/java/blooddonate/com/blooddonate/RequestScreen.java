package blooddonate.com.blooddonate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class RequestScreen extends AppCompatActivity {

    ImageButton imgBtnOption;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
    RequestScreenAdapter adapter;
    ArrayList<AllDonerData> requestScreenData = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_screen);

        recyclerView = findViewById(R.id.requestRecycler);
        imgBtnOption = findViewById(R.id.btnOption);
        imgBtnOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RequestScreen.this, ProfileCheckScreen.class);
                startActivity(intent);
            }
        });

        setData();
        setRecyclerView();
    }

    public void setRecyclerView() {
        adapter = new RequestScreenAdapter(requestScreenData);
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
