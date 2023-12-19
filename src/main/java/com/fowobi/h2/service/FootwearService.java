package com.fowobi.h2.service;

import com.fowobi.h2.models.Footwear;
import com.fowobi.h2.repository.FootwearRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FootwearService {

    private final FootwearRepository footwearRepository;

    public FootwearService(FootwearRepository footwearRepository) {
        this.footwearRepository = footwearRepository;
    }

    public Footwear createNew(Footwear footwear) {
        return footwearRepository.save(footwear);
    }

    public List<Footwear> getAll() {
        return footwearRepository.findAll();
    }

    public Footwear getById(long id) {
        return footwearRepository.findById(id).get();
    }

    public String delete(long id) {
        String output = "";
        try {
            footwearRepository.deleteById(id);
            output = "Successfully deleted";
        } catch (Exception e) {
            output = "Failed to delete";
            e.printStackTrace();
        }

        return output;
    }
}
