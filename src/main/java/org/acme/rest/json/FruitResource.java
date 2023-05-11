package org.acme.rest.json;

import java.io.IOException;
import java.util.*;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/fruits")
public class FruitResource {

    private Map<UUID, Fruit> fruits = Collections.synchronizedMap(new LinkedHashMap<>());

    public FruitResource() {
        Fruit apple = new Fruit("Apple", "Winter fruit");
        fruits.put(apple.id, apple);
        Fruit pineapple = new Fruit("Pineapple", "Tropical fruit");
        fruits.put(pineapple.id, pineapple);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Fruit> getFruits() {
        return fruits.values();
    }

    @GET
    @Path("/{id}")
    public Fruit get(String id) throws IOException {
        return fruits.get(id);
    }

    @POST
    public Collection<Fruit> add(Fruit fruit) {
        fruits.put(fruit.id, fruit);
        return fruits.values();
    }

    @DELETE
    @Path("{id}")
    public Collection<Fruit> delete(UUID id) {
        fruits.remove(id);
        return fruits.values();
    }
}
