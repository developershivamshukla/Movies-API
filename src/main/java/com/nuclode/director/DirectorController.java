package com.nuclode.director;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DirectorController {

	@Autowired
	private DirectorService directorService;
	
	@RequestMapping("/directors")
	public List<Director> getAllDirectors() {
		return directorService.getAllDirectors();
	}
	
	@RequestMapping("/directors/{id}")
	public Director getDirector(@PathVariable String id) {
		return directorService.getDirector(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/directors")
	public void addDirector(@RequestBody Director director) {
		directorService.addDirector(director);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/directors/{id}")
	public void updateDirector(@RequestBody Director director, @PathVariable String id) {
		directorService.updateDirector(id, director);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/directors/{id}")
	public void deleteDirector(@PathVariable String id) {
		directorService.deleteDirector(id);
	}
	
}
