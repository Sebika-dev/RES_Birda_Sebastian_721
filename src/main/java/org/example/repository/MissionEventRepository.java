package org.example.repository;

import org.example.model.MissionEvent;

public class MissionEventRepository extends FileRepository<MissionEvent>{
    public MissionEventRepository() {
        super("events.json", MissionEvent.class);
    }
}
