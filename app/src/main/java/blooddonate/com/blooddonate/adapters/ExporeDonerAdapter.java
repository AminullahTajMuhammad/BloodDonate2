package blooddonate.com.blooddonate.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import blooddonate.com.blooddonate.models.AllDonerData;
import blooddonate.com.blooddonate.R;

public class ExporeDonerAdapter extends RecyclerView.Adapter<ExporeDonerAdapter.MyViewHolder> {
    ArrayList<AllDonerData> data = new ArrayList<>();

    public ExporeDonerAdapter( ArrayList<AllDonerData> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.explore_doner_listitem,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.tvName.setText(data.get(i).getName());
        myViewHolder.tvCity.setText(data.get(i).getCityName());
        myViewHolder.btnBloodGroup.setText(data.get(i).getBloodGroup());

        if (data.get(i).getName().equals("Amanda")) {
            myViewHolder.imgPic.setImageResource(R.drawable.picture_one);
        } else if(data.get(i).getName().equals("John")) {
            myViewHolder.imgPic.setImageResource(R.drawable.picture_second);
        } else if(data.get(i).getName().equals("Handler")) {
            myViewHolder.imgPic.setImageResource(R.drawable.seven);
        } else if(data.get(i).getName().equals("Kressy")) {
            myViewHolder.imgPic.setImageResource(R.drawable.four);
        } else if(data.get(i).getName().equals("Tailor Swift")) {
            myViewHolder.imgPic.setImageResource(R.drawable.five);
        } else if(data.get(i).getName().equals("Cramer")) {
            myViewHolder.imgPic.setImageResource(R.drawable.six);
        } else if(data.get(i).getName().equals("Henry")) {
            myViewHolder.imgPic.setImageResource(R.drawable.seven);
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvCity;
        Button btnBloodGroup, btnAskForHelp;
        ImageView imgPic;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvCity = itemView.findViewById(R.id.tvCity);
            btnAskForHelp = itemView.findViewById(R.id.btnAskForHelp);
            btnBloodGroup = itemView.findViewById(R.id.btnBloodGroup);
            imgPic = itemView.findViewById(R.id.imgPic);
        }
    }
}
