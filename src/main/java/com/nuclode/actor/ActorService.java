package com.nuclode.actor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorService {

	@Autowired
	ActorRepository actorRepository;
	
	public List<Actor> getAllActors() {
		List<Actor> actors = new ArrayList<>();
		actorRepository.findAll().forEach(actors::add);
		return actors;
	}
	
	public Actor getActor(String id) {
		return actorRepository.findOne(id);
	}
	
	public void addActor(Actor actor) {
		actorRepository.save(actor);
	}
	
	public void updateActor(String id, Actor actor) {
		actorRepository.save(actor);
	}
	
	public void deleteActor(String id) {
		actorRepository.delete(id);
	}
	
}
