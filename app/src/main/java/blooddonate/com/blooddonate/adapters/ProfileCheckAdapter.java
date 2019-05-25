package blooddonate.com.blooddonate.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import blooddonate.com.blooddonate.models.NewsFeedData;
import blooddonate.com.blooddonate.R;

public class ProfileCheckAdapter extends RecyclerView.Adapter<ProfileCheckAdapter.MyViewHolder> {

    ArrayList<NewsFeedData> data = new ArrayList<>();

    public ProfileCheckAdapter(ArrayList<NewsFeedData> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.profile_check_listitem,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.tvName.setText(data.get(i).getName());
        myViewHolder.tvCityName.setText(data.get(i).getCityName());
        myViewHolder.tvUpdateTime.setText(data.get(i).getUpdateTime());
        myViewHolder.tvDescription.setText(data.get(i).desc);

        if (data.get(i).getName().equals("Amanda")) {
            myViewHolder.imgProfilePic.setImageResource(R.drawable.picture_one);
        } else if(data.get(i).getName().equals("John")) {
            myViewHolder.imgProfilePic.setImageResource(R.drawable.picture_second);
        } else if(data.get(i).getName().equals("Handler")) {
            myViewHolder.imgProfilePic.setImageResource(R.drawable.seven);
        } else if(data.get(i).getName().equals("Kressy")) {
            myViewHolder.imgProfilePic.setImageResource(R.drawable.four);
        } else if(data.get(i).getName().equals("Tailor Swift")) {
            myViewHolder.imgProfilePic.setImageResource(R.drawable.five);
        } else if(data.get(i).getName().equals("Cramer")) {
            myViewHolder.imgProfilePic.setImageResource(R.drawable.six);
        } else if(data.get(i).getName().equals("Henry")) {
            myViewHolder.imgProfilePic.setImageResource(R.drawable.seven);
        }


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvUpdateTime, tvCityName, tvDescription;
        ImageView imgProfilePic;
        ImageView imgImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_Check_Name);
            tvCityName = itemView.findViewById(R.id.tv_Check_City);
            tvUpdateTime = itemView.findViewById(R.id.tvUpdateTime);
            tvDescription = itemView.findViewById(R.id.tvCheckProfileDescription);
            imgProfilePic = itemView.findViewById(R.id.profileCheckPic);
            imgImage = itemView.findViewById(R.id.imgRequestPic);

        }
    }
}
