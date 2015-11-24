package com.example.luisgalvan.myrecicler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.luisgalvan.myrecicler.adapter.MovieAdapter;
import com.example.luisgalvan.myrecicler.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        setUpRecyclerView();
    }

    private void setUpRecyclerView() {

        mRecyclerView = (RecyclerView) findViewById(R.id.list_of_movies);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(new MovieAdapter(this, createMovies()));
    }

    private List<Movie> createMovies() {
        List<Movie> movies = new ArrayList<>();


        for(int i=0; i<8; i++){

           // movies.add(new Movie("Ley de Herodes", R.drawable.cueva));
            movies.add(new Movie("SPECTRE"));
            movies.add(new Movie("Los 33"));
            movies.add(new Movie("Snoopy & Charlie"));
        }

        return movies;

    }
}
