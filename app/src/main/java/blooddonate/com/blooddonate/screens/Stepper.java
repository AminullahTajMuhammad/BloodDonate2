package blooddonate.com.blooddonate.screens;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import blooddonate.com.blooddonate.R;
import blooddonate.com.blooddonate.adapters.SliderAdapter;

public class Stepper extends AppCompatActivity {
    private ViewPager viewPager;
    private LinearLayout linearLayout;
    private SliderAdapter Madapter;
    private TextView[] mDots;
    private Button btnBack;
    private Button btnNext;
    private int currentPage, finishPage;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stepper);


        viewPager = findViewById(R.id.viewPager);
        linearLayout = findViewById(R.id.dotslayout);
        btnBack = findViewById(R.id.btnBack);
        btnNext = findViewById(R.id.btnNext);

//        btnBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                viewPager.setCurrentItem(currentPage - 1);
//            }
//        });
        viewPager.setCurrentItem(currentPage + 1);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Stepper.this, LoginScreen.class));
                finish();
            }
        });
        Madapter = new SliderAdapter(this);
        viewPager.setAdapter(Madapter);

        adddotsIndicator(0);

        viewPager.addOnPageChangeListener(viewListner);
    }


    public void adddotsIndicator(int position) {
        mDots = new TextView[3];
        linearLayout.removeAllViews();

        for (int i = 0; i < mDots.length; i++) {
            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorTransparent));
            linearLayout.addView(mDots[i]);
        }

        if (mDots.length > 0) {
            mDots[position].setTextColor(getResources().getColor(R.color.colorPrimary));
        }
    }

    ViewPager.OnPageChangeListener viewListner = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {

            adddotsIndicator(i);
            currentPage = i;
            finishPage = mDots.length;

            if(i == 0) {
                btnBack.setEnabled(false);
                btnNext.setEnabled(true);
                btnBack.setText("");

            } else if(i == mDots.length-1) {
                btnBack.setEnabled(true);
                btnNext.setEnabled(true);
                btnNext.setVisibility(View.VISIBLE);
                btnNext.setText("Finish");


            } else {
                btnBack.setEnabled(true);
                btnNext.setEnabled(true);
            }

        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}
