package blooddonate.com.blooddonate;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

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
        myViewHolder.tvName.setText(data.get(i).name);
        myViewHolder.tvCity.setText(data.get(i).cityName);
        myViewHolder.btnBloodGroup.setText(data.get(i).bloodGroup);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvCity;
        Button btnBloodGroup, btnAskForHelp;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvCity = itemView.findViewById(R.id.tvCity);
            btnAskForHelp = itemView.findViewById(R.id.btnAskForHelp);
            btnBloodGroup = itemView.findViewById(R.id.btnBloodGroup);
        }
    }
}
