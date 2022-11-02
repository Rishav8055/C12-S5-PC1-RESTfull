package com.niit.C12S5PC1RESTfull.Service;

import com.niit.C12S5PC1RESTfull.Domain.Movie;

import java.util.List;

public interface MovieService {
    public Movie addMovieDetail(Movie movie);

    public List<Movie> getAllMovieDetail();
}
