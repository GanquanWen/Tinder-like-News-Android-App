package com.laioffer.tinnews.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import io.reactivex.Flowable;

import com.laioffer.tinnews.retrofit.response.News;


@Dao
public interface NewsDao {

    @Insert
    void insertNews(News news);

    //3.1
    @Query("SELECT * FROM news")
    Flowable<List<News>> getAll();

    //4.4
    @Query("DELETE FROM news")
    void deleteAllNews();
}

