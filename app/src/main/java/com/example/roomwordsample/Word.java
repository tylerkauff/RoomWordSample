package com.example.roomwordsample;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

// Represents an SQLite table
@Entity(tableName = "word_table")
public class Word {
    @PrimaryKey // Every entity event needs a primary key.
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    public Word(@NonNull String word) { this.mWord = word; }
    public String getWord() { return this.mWord; }
}
