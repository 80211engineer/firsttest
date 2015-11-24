package com.example.luisgalvan.myrecicler.model;

import android.widget.ImageView;

/**
 * Created by Luis Galvan on 11/19/2015.
 */
public class Movie {


    private String mTitle;
    private ImageView mImagem;

    public Movie(String mTitle) {
        this.mTitle = mTitle;
    }

    public Movie(String mTitle, int mId) {
        this.mTitle = mTitle;
       // this.mImagem =  mId.
    }


    public ImageView getmImagem() {
        return mImagem;
    }

    public void setmImagem(ImageView mImagem) {
        this.mImagem = mImagem;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
