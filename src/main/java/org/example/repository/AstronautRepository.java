package org.example.repository;

import org.example.model.Astronaut;

public class AstronautRepository extends FileRepository<Astronaut>{
    public AstronautRepository() {
        super("astronauts.json", Astronaut.class);
    }
}