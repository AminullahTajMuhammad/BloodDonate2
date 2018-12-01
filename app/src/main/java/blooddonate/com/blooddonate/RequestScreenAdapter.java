package blooddonate.com.blooddonate;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RequestScreenAdapter extends RecyclerView.Adapter<RequestScreenAdapter.MyViewHolder> {

    ArrayList<AllDonerData> requestScreenData = new ArrayList<>();

    public RequestScreenAdapter(ArrayList<AllDonerData> requestScreenData) {
        this.requestScreenData = requestScreenData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.request_screen_listitem,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.tvName.setText(requestScreenData.get(i).getName());
        myViewHolder.tvCityName.setText(requestScreenData.get(i).getCityName());
        myViewHolder.btnNumber.setText(requestScreenData.get(i).getMobileNumber());
        myViewHolder.btnbloodGroup.setText(requestScreenData.get(i).getBloodGroup());

        if (requestScreenData.get(i).getName().equals("Amanda")) {
            myViewHolder.imgPic.setImageResource(R.drawable.picture_one);
        } else if(requestScreenData.get(i).getName().equals("John")) {
            myViewHolder.imgPic.setImageResource(R.drawable.picture_second);
        } else if(requestScreenData.get(i).getName().equals("Handler")) {
            myViewHolder.imgPic.setImageResource(R.drawable.seven);
        } else if(requestScreenData.get(i).getName().equals("Kressy")) {
            myViewHolder.imgPic.setImageResource(R.drawable.four);
        } else if(requestScreenData.get(i).getName().equals("Tailor Swift")) {
            myViewHolder.imgPic.setImageResource(R.drawable.five);
        } else if(requestScreenData.get(i).getName().equals("Cramer")) {
            myViewHolder.imgPic.setImageResource(R.drawable.six);
        } else if(requestScreenData.get(i).getName().equals("Henry")) {
            myViewHolder.imgPic.setImageResource(R.drawable.seven);
        }

    }

    @Override
    public int getItemCount() {
        return requestScreenData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvCityName;
        ImageView imgPic;
        Button btnNumber, btnbloodGroup;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvRequestName);
            tvCityName = itemView.findViewById(R.id.tvRequestCity);
            btnNumber = itemView.findViewById(R.id.btnRequestNumber);
            btnbloodGroup = itemView.findViewById(R.id.btnRequestBloodGroup);
            imgPic = itemView.findViewById(R.id.imgRequestPic);
        }
    }
}
