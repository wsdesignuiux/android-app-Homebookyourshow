package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import e.wolfsoft1.home_book_your_show.R;
import model.HomeModel;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder>{

    Context context;
    private ArrayList<HomeModel> homeModelArrayList1;

    public HomeAdapter(Context context, ArrayList<HomeModel> homeModelArrayList) {
        this.context = context;
        this.homeModelArrayList1 = homeModelArrayList;
    }

    @NonNull
    @Override
    public HomeAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_home, parent, false);
        return new HomeAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.MyViewHolder holder, int position) {
        HomeModel modelfoodrecycler = homeModelArrayList1.get(position);


        holder.homeimage1.setImageResource(modelfoodrecycler.getHomeimage1());

    }

    @Override
    public int getItemCount() {
        return homeModelArrayList1.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView homeimage1;


        public MyViewHolder(View itemView) {
            super(itemView);

            homeimage1 = itemView.findViewById(R.id.homeimage1);
        }
    }
}
