package com.example.newsapp.db;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.newsapp.models.Article;
import java.util.List;

@Dao
public interface NewsDao {

    @Insert
    void insert(List<Article> articles);

    @Query("DELETE FROM article")
    void deleteAll();

    @Query("SELECT * FROM article ")
    LiveData<List<Article>> getAllLive();

    @Query("SELECT * FROM article ")
    List<Article> getAll();
}
