package com.nuclode.movie;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	@Autowired
	MovieRepository movieRepository;
	
	public List<Movie> getAllMoives() {
		List<Movie> movies = new ArrayList<>();
		movieRepository.findAll().forEach(movies::add);
		return movies;
	}
	
	public Movie getMovie(String id) {
		return movieRepository.findOne(id);
	}
	
	public void addMovie(Movie movie) {
		movieRepository.save(movie);
	}
	
	public void updateMovie(String id, Movie movie) {
		movieRepository.save(movie);
	}
	
	public void deleteMovie(String id) {
		movieRepository.delete(id);
	}
}
