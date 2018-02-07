package com.nuclode.actor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorController {

	@Autowired
	private ActorService actorService;
	
	@RequestMapping("/actors")
	public List<Actor> getAllActors() {
		return actorService.getAllActors();
	}
	
	@RequestMapping("/actors/{id}")
	public Actor getActor(@PathVariable String id) {
		return actorService.getActor(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/actors")
	public void addActor(@RequestBody Actor actor) {
		actorService.addActor(actor);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/actors/{id}")
	public void updateActor(@RequestBody Actor actor, @PathVariable String id) {
		actorService.updateActor(id, actor);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/actors/{id}")
	public void deleteDirector(@PathVariable String id) {
		actorService.deleteActor(id);
	}
	
}
