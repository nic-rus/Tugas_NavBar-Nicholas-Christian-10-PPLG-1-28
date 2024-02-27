package com.example.listsiswa10pplg1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private final List<DataSiswa> mData;
    private final LayoutInflater mInflater;
    private Context mContext;
    private ItemClickListener mClickListener;

    // data is passed into the constructor
    RecyclerViewAdapter(Context context, List<DataSiswa> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
        this.mContext = context; // Assign the context passed to the adapter
    }


    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.row_recycler_view, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        DataSiswa Siswa = mData.get(position);
        holder.txt_Siswa.setText(Siswa.getNama());
        holder.txt_NoAbsen.setText(Siswa.getNoAbsen());
        int profileResourceId = Siswa.getProfile();
        holder.img_Profile.setImageResource(profileResourceId);
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return mData.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txt_Siswa;
        TextView txt_NoAbsen;
        ImageView img_Profile;

        ViewHolder(View itemView) {
            super(itemView);
            txt_Siswa = itemView.findViewById(R.id.txt_NamaSiswa);
            txt_NoAbsen = itemView.findViewById(R.id.txt_NoAbsen);
            img_Profile = itemView.findViewById(R.id.img_Profile);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // convenience method for getting data at click position
    /*
    String getItem(int id) {
        return mData.get(id);
    }
    */

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}