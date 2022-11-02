package com.niit.C12S5PC1RESTfull.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id
    private int id;
    private String movieName;
    private String releaseDate;
    private String genre;

    public Movie() {
    }

    public Movie(int id, String movieName, String releaseDate, String genre) {
        this.id = id;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
