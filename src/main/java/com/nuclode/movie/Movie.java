package com.nuclode.movie;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Required;

import com.nuclode.actor.Actor;
import com.nuclode.director.Director;

@Entity
public class Movie {

	@Id
	private String id;
	private String name;
	private String url;
	private Date date;
	private String genre;
	
	@ManyToMany
	private List<Actor> actor;
	
	@ManyToOne
	Director director;
	
	public Movie() {
		super();
	}

	public Movie(String id, String name, String url, Date date, String genre, List<Actor> actor, Director director) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.date = date;
		this.genre = genre;
		this.actor = actor;
		this.director = director;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getDate() {
		return date;
	}

	@Required
	public void setDate(Date date) {
		this.date = date;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public List<Actor> getActor() {
		return actor;
	}

	@Required
	public void setActor(List<Actor> actor) {
		this.actor = actor;
	}

	public Director getDirector() {
		return director;
	}

	@Required
	public void setDirector(Director director) {
		this.director = director;
	}
	
}
