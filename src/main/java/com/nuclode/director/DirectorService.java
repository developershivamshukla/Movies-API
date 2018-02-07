package com.nuclode.director;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectorService {

	@Autowired
	DirectorRepository directorRepository;
	
	public List<Director> getAllDirectors() {
		List<Director> directors = new ArrayList<>();
		directorRepository.findAll().forEach(directors::add);
		return directors;
	}
	
	public Director getDirector(String id) {
		return directorRepository.findOne(id);
	}
	
	public void addDirector(Director director) {
		directorRepository.save(director);
	}
	
	public void updateDirector(String id, Director director) {
		directorRepository.save(director);
	}
	
	public void deleteDirector(String id) {
		directorRepository.delete(id);
	}
	
}
