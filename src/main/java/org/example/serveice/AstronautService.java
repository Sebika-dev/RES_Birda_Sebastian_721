package org.example.serveice;

import org.example.model.*;
import org.example.repository.AstronautRepository;
import org.example.repository.MissionEventRepository;
import org.example.repository.SupplyRepository;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AstronautService {
    private AstronautRepository astronautRepository;
    private MissionEventRepository missionEventRepository;
    private SupplyRepository supplyRepository;

    public AstronautService(AstronautRepository astronautRepository, MissionEventRepository missionEventRepository, SupplyRepository supplyRepository) {
        this.astronautRepository = astronautRepository;
        this.missionEventRepository = missionEventRepository;
        this.supplyRepository = supplyRepository;
    }

    public List<Astronaut> getAllAstronauts() {
        return astronautRepository.findAll();
    }

    public List<MissionEvent> getAllMissionEvents() {
        return missionEventRepository.findAll();
    }

    public List<Supply> getAllSupplies() {
        return supplyRepository.findAll();
    }

}
