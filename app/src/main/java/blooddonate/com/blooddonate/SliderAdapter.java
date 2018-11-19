package blooddonate.com.blooddonate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutinflater;

    public int[] slidesImages = {
            R.drawable.picture_one,
            R.drawable.picture_second,
            R.drawable.picture_three
    };

    public String[] slideName = {
            "Blood Donate", "Search Blood Donate", "Explore Update around you"
    };

    public String[] slideDescriptions = {
            "lorem ispum is simple dummy text of the printing and typesetting",
            "lorem ispum is simple dummy text of the printing and typesetting",
            "lorem ispum is simple dummy text of the printing and typesetting"
    };

    public SliderAdapter(Context context) {
        this.context = context;
    }


    @Override
    public int getCount() {
        return slideName.length;
    }


    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutinflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutinflater.inflate(R.layout.slide_layout, container,false);

        ImageView imageView = view.findViewById(R.id.img1st);
        TextView tvName = view.findViewById(R.id.tvTitle);
        TextView tvDesc = view.findViewById(R.id.tvDesc);


        imageView.setImageResource(slidesImages[position]);
        tvName.setText(slideName[position]);
        tvDesc.setText(slideDescriptions[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView ((RelativeLayout)object);
    }
}
