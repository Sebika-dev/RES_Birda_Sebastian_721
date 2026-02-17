package org.example;

import org.example.repository.AstronautRepository;
import org.example.repository.MissionEventRepository;
import org.example.repository.SupplyRepository;
import org.example.serveice.MissionService;
import org.example.ui.ConsoleView;

public class Main {
    public static void main(String[] args) {
        AstronautRepository astronautRepository = new AstronautRepository();
        MissionEventRepository missionEventRepository = new MissionEventRepository();
        SupplyRepository supplyRepository = new SupplyRepository();

        MissionService service = new MissionService(new AstronautRepository(), new MissionEventRepository(), new SupplyRepository());
        ConsoleView view = new ConsoleView(service);
        view.start();
    }
}