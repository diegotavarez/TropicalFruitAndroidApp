package com.example.tropicalfruitlist.activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tropicalfruitlist.R;
import com.example.tropicalfruitlist.adapters.FruitAdapter;
import com.example.tropicalfruitlist.api.ApiClient;
import com.example.tropicalfruitlist.api.ApiInterface;
import com.example.tropicalfruitlist.model.Fruit;
import com.example.tropicalfruitlist.model.Pojo;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends Activity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_fruit_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(mAdapter);

        loadData();
    }

    private void loadData(){
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<Pojo> call = apiService.getData();
        call.enqueue(new Callback<Pojo>() {
            @Override
            public void onResponse(Call<Pojo> call, Response<Pojo> response) {
                fruitList = new ArrayList(response.body().getFruitList());
                mAdapter = new FruitAdapter(fruitList);
                recyclerView.setAdapter(mAdapter);
                mAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<Pojo> call, Throwable t) {
                Log.d("TAG","Response = "+t.toString());
            }
        });
    }

//    private void loadData(){
//        Fruit fruit1 = new Fruit("Almond", "runus dulcis", "Amendoa", "http://tropicalfruitandveg.com/thumb.php?image=images/almondfruit.jpg");
//        fruitList.add(fruit1);
//
//        Fruit fruit2 = new Fruit("Almond", "runus dulcis", "Amendoa", "http://tropicalfruitandveg.com/thumb.php?image=images/almondfruit.jpg");
//        fruitList.add(fruit2);
//
//        mAdapter.notifyDataSetChanged();
//    }
}