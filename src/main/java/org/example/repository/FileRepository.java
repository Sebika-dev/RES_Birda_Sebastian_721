package org.example.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.Entity;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileRepository<T extends Entity<Long>> implements IRepository<T> {
    private String filename;
    private Class<T> type;
    private ObjectMapper mapper = new ObjectMapper();
    private Map<Long, T> entities = new HashMap<>();
    private long currentId = 1;

    public FileRepository(String filename, Class<T> type) {
        this.filename = filename;
        this.type = type;
        loadFromFile();
    }

    @Override
    public void add(T entity) {
        if (entity.getId() == null) {
            entity.setId(currentId++);
        }
        entities.put(entity.getId(), entity);
        saveToFile();
    }

    @Override
    public void delete(Long id) {
        entities.remove(id);
        saveToFile();
    }

    @Override
    public void update(T entity) {
        entities.put(entity.getId(), entity);
        saveToFile();
    }

    @Override
    public T findOne(Long id) {
        return entities.get(id);
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(entities.values());
    }

    private void saveToFile() {
        try {
            mapper.writeValue(new File(filename), new ArrayList<>(entities.values()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadFromFile() {
        File file = new File(filename);
        if (!file.exists()) return;
        try {
            List<T> loadedList = mapper.readValue(file,
                    mapper.getTypeFactory().constructCollectionType(List.class, type));

            long maxId = 0;
            for (T entity : loadedList) {
                entities.put(entity.getId(), entity);
                if ((Long)entity.getId() > maxId) maxId = (Long)entity.getId();
            }
            currentId = maxId + 1;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}