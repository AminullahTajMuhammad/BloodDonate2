package blooddonate.com.blooddonate.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import blooddonate.com.blooddonate.models.AllDonerData;
import blooddonate.com.blooddonate.R;

public class SmaeDonerScreenAdapter extends RecyclerView.Adapter<SmaeDonerScreenAdapter.MyViewHolder> {

    ArrayList<AllDonerData> requestScreenData = new ArrayList<>();

    public SmaeDonerScreenAdapter(ArrayList<AllDonerData> requestScreenData) {
        this.requestScreenData = requestScreenData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.same_doner_screen_listitem,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.tvName.setText(requestScreenData.get(i).getName());
        myViewHolder.tvCityName.setText(requestScreenData.get(i).getCityName());
        myViewHolder.btnNumber.setText(requestScreenData.get(i).getMobileNumber());
        myViewHolder.btnbloodGroup.setText(requestScreenData.get(i).getBloodGroup());

    }

    @Override
    public int getItemCount() {
        return requestScreenData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvCityName;
        Button btnNumber, btnbloodGroup;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvRequestName);
            tvCityName = itemView.findViewById(R.id.tvRequestCity);
            btnNumber = itemView.findViewById(R.id.btnRequestNumber);
            btnbloodGroup = itemView.findViewById(R.id.btnRequestBloodGroup);
        }
    }
}
