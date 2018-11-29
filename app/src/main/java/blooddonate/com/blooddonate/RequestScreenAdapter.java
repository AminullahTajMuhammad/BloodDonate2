package blooddonate.com.blooddonate;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
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

    }

    @Override
    public int getItemCount() {
        return requestScreenData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvCityName;
        ImageButton imgPic


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
