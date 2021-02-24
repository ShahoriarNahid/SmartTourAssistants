package com.example.smarttourassistants;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;



public class Districtadapter extends FirebaseRecyclerAdapter<Districtmodel,Districtadapter.myviewholder>
{
    public Districtadapter(@NonNull FirebaseRecyclerOptions<Districtmodel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull Districtadapter.myviewholder holder, int position, @NonNull Districtmodel model)
    {
        holder.districtName.setText(model.getDistrictName());
    }

    @NonNull
    @Override
    public Districtadapter.myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.placerow,parent,false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {

        TextView districtName;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            districtName=(TextView)itemView.findViewById(R.id.districtNameText);
        }
    }
}
