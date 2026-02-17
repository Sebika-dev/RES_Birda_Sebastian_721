package org.example.repository;

import org.example.model.Supply;

public class SupplyRepository extends FileRepository<Supply>{
    public SupplyRepository() {
        super("supplies.json", Supply.class);
    }
}
