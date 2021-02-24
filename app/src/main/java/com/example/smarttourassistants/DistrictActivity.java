package com.example.smarttourassistants;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class DistrictActivity extends AppCompatActivity {

    RecyclerView recview;
    Districtadapter adapter;
    Query query = FirebaseDatabase.getInstance().getReference().child("places");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district);
        recview=(RecyclerView)findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));






        FirebaseRecyclerOptions<Districtmodel> options =
                new FirebaseRecyclerOptions.Builder<Districtmodel>()
                        .setQuery(query, Districtmodel.class)
                        .setLifecycleOwner(this).build();

//
//        val options = FirebaseRecyclerOptions.Builder<User>()
//                .setQuery(ONLINE_USERS.limitToLast(10), User::class.java)
//        .setLifecycleOwner(this)
//                .build()





        Log.d("Options: ", options.toString());
        adapter=new Districtadapter(options);
        recview.setAdapter(adapter);






    }
    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}