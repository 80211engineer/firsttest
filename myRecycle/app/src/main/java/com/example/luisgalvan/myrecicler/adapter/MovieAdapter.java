package com.example.luisgalvan.myrecicler.adapter;



import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.luisgalvan.myrecicler.R;
import com.example.luisgalvan.myrecicler.model.Movie;

import java.util.List;


/**
 * Created by Luis Galvan on 11/19/2015.
 */
public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private List<Movie> mMovies;
    private LayoutInflater mInflater;


    public MovieAdapter(Context context, List<Movie> movies) {
        mInflater = LayoutInflater.from(context);
        mMovies = movies;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.li_movies, parent, false);
        MovieViewHolder viewHolder = new MovieViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        Movie curz = mMovies.get(position);

        holder.setmTitle(curz.getmTitle());
        //holder.setmImage(curz.getmImagem());

    }

    @Override
    public int getItemCount() {
        return mMovies.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder{


        private TextView mTitle;
        private ImageView mImage;

        public MovieViewHolder(View itemView) {
            super(itemView);

            mTitle = (TextView) itemView.findViewById(R.id.text_movie);
            mImage = (ImageView) itemView.findViewById(R.id.image_movie);

        }


        public void setmImage(ImageView mImage) {
            //this.mImage.setImageResource(R.drawable.herodes);
        }

        public void setmTitle(String titlez) {
            this.mTitle.setText(titlez);

        }
    }


}
