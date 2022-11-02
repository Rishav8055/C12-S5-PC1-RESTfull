package com.niit.C12S5PC1RESTfull.Service;

import com.niit.C12S5PC1RESTfull.Domain.Movie;
import com.niit.C12S5PC1RESTfull.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    MovieRepository movieRepository;
    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie addMovieDetail(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> getAllMovieDetail() {
        return (List<Movie>) movieRepository.findAll() ;
    }
}
