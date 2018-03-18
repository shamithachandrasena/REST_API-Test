package com.samsl.restdemo;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
	static AlienRepository repo=new AlienRepository();

	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Alien> getAliens() {
		System.out.println("getAliens called");
		return repo.getAliens(); 
	}
	
	@GET
	@Path("alien/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Alien getAlien(@PathParam("id") int id) {
		System.out.println("getAlien called");
		return repo.getAlien(id); 
	}
	
	@POST
	@Path("alien")
	public Alien createAlien(Alien alien) {
		System.out.println("createAlien called");
		System.out.println(alien.toString());
		repo.createAlien(alien);
		return repo.getAlien(alien.getId()); 
	}
	
	@PUT
	@Path("alien")
	public void updateAlien(Alien alien) {
		System.out.println("updateAlien called");
		if(repo.getAlien(alien.getId())==null) {
			repo.createAlien(alien);
		}
		repo.updateAlien(alien);
		
	}
	
}
