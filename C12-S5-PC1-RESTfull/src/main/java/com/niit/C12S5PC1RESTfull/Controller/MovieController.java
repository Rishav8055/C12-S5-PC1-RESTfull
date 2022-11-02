package com.niit.C12S5PC1RESTfull.Controller;

import com.niit.C12S5PC1RESTfull.Domain.Movie;
import com.niit.C12S5PC1RESTfull.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movieDtl/v1/")
public class MovieController {

    MovieService movieService;
    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
    @PostMapping("/movie")
    public ResponseEntity<?> insertMovie(@RequestBody Movie movie){
        return new ResponseEntity<>(movieService.addMovieDetail(movie), HttpStatus.CREATED);
    }
    @GetMapping("/movie")
    public ResponseEntity<?> getAllMovie(){
        return new ResponseEntity<>(movieService.getAllMovieDetail(),HttpStatus.CREATED);
    }

}
