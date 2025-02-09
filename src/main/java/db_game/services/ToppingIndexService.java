package db_game.services;

import db_game.entities.ToppingIndex;
import db_game.repositories.ToppingIndexRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ToppingIndexService {

    @Autowired
    ToppingIndexRepo toppingIndexRepo;

    public void saveNewToppingIndex(ToppingIndex toppingIndex){
        toppingIndexRepo.save(toppingIndex);
    }

    public void deleteToppingIndexById(Long id){
        toppingIndexRepo.deleteById(id);
    }
}
