package org.example.serveice;

import org.example.model.*;
import org.example.repository.AstronautRepository;
import org.example.repository.MissionEventRepository;
import org.example.repository.SupplyRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MissionService {
    private AstronautRepository astronautRepository;
    private MissionEventRepository missionEventRepository;
    private SupplyRepository supplyRepository;

    public MissionService(AstronautRepository astronautRepository, MissionEventRepository missionEventRepository, SupplyRepository supplyRepository) {
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

    // Cerinta 2: filtrare dupa spacecraft si status
    public List<Astronaut> getActiveAstronautsBySpacecraft(String spacecraft) {
        return getAllAstronauts().stream()
                .filter(a -> a.getSpacecraft().equalsIgnoreCase(spacecraft) && a.getStatus() == AstronautStatus.ACTIVE)
                .collect(Collectors.toList());
    }
}
