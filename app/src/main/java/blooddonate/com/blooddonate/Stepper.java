package blooddonate.com.blooddonate;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Stepper extends AppCompatActivity {
    private ViewPager viewPager;
    private LinearLayout linearLayout;
    private SliderAdapter Madapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stepper);

        viewPager = findViewById(R.id.viewPager);
        linearLayout = findViewById(R.id.dotsLayout);

        Madapter = new SliderAdapter(this);
        viewPager.setAdapter(Madapter);
    }
}
