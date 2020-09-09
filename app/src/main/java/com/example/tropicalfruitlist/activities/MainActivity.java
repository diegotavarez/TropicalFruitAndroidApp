package com.example.tropicalfruitlist.activities;

import android.app.Activity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tropicalfruitlist.R;
import com.example.tropicalfruitlist.adapters.FruitAdapter;
import com.example.tropicalfruitlist.model.Fruit;

import java.util.ArrayList;
import java.util.List;

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
        Fruit fruit1 = new Fruit("Almond", "runus dulcis", "Amendoa", "http://tropicalfruitandveg.com/thumb.php?image=images/almondfruit.jpg");
        fruitList.add(fruit1);

        Fruit fruit2 = new Fruit("Almond", "runus dulcis", "Amendoa", "http://tropicalfruitandveg.com/thumb.php?image=images/almondfruit.jpg");
        fruitList.add(fruit2);

        mAdapter.notifyDataSetChanged();
    }
}