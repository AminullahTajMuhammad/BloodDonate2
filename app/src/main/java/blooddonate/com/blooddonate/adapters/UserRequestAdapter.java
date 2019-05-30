package blooddonate.com.blooddonate.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import blooddonate.com.blooddonate.R;
import blooddonate.com.blooddonate.models.UserRequestDataModel;

public class UserRequestAdapter extends RecyclerView.Adapter<UserRequestAdapter.MyViewHolder> {

    private ArrayList<UserRequestDataModel> userRequestDataList = new ArrayList<>();
    private Context context;

    public UserRequestAdapter(ArrayList<UserRequestDataModel> userRequestDataList, Context context) {
        this.userRequestDataList = userRequestDataList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user_request_listitem, viewGroup, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.tvRequestFor.setText(userRequestDataList.get(i).getBloodRequestFor());
        myViewHolder.tvCity.setText(userRequestDataList.get(i).getCity());
        myViewHolder.btnBGroup.setText(userRequestDataList.get(i).getRequestBloodGroup());
    }


    @Override
    public int getItemCount() {
        return userRequestDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvRequestFor;
        TextView tvCity;
        Button btnBGroup;

        private MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvRequestFor = itemView.findViewById(R.id.tvRequestFor);
            tvCity = itemView.findViewById(R.id.tvCity);
            btnBGroup = itemView.findViewById(R.id.btnRequestItemBloodGroup);
        }
    }
}
