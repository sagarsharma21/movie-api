package com.freecode.movies;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	public List<Movie> allMovies() {
		return movieRepository.findAll();
	}
	
	//find single movie by id
//	public Optional<Movie> singleMovie(ObjectId id) {
//		return movieRepository.findById(id);
//	}
	
	//find single movie by imdbId
	public Optional<Movie> singleMovie(String imdbId){
		return movieRepository.findMovieByImdbId(imdbId);
	}
}
