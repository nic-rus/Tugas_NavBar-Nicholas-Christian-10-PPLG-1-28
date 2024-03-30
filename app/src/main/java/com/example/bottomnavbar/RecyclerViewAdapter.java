package com.example.bottomnavbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private List<DataSiswa> mData;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;
    Context context;

    RecyclerViewAdapter(Context context, List<DataSiswa> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.row_recycler_view, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        DataSiswa dataSiswa = mData.get(position);
        holder.txt_Siswa.setText(dataSiswa.getNama());
        holder.txt_NoAbsen.setText(dataSiswa.getNoAbsen());
        Glide.with(context)
                .load(mData.get(position).getProfileUrl())
                .placeholder(R.drawable.avatar)
                .error(R.drawable.avatar)
                .into(holder.img_Profile);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txt_Siswa;
        TextView txt_NoAbsen;
        ImageView img_Profile;

        ViewHolder(View itemView) {
            super(itemView);
            txt_Siswa = itemView.findViewById(R.id.txt_NamaSiswa);
            txt_NoAbsen = itemView.findViewById(R.id.txt_NoAbsen);
            img_Profile = itemView.findViewById(R.id.img_Profile);

            // Set click listener for the whole item view (card)
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) {
                mClickListener.onItemClick(view, getAdapterPosition());
            }
        }
    }


    // convenience method for getting data at click position
    String getItem(int id) {
        return  "";
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }



}