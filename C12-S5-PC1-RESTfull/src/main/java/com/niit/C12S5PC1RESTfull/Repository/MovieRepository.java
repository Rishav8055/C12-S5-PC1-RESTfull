package com.niit.C12S5PC1RESTfull.Repository;

import com.niit.C12S5PC1RESTfull.Domain.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie,Integer> {
}
