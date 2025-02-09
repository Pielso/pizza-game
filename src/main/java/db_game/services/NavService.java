package db_game.services;

import db_game.repositories.CashRepo;
import db_game.repositories.DayRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NavService {

    @Autowired
    private CashRepo cashRepo;
    @Autowired
    private DayRepo dayRepo;

    public boolean testIfDatabaseIsEmpty(){
        if (cashRepo.findAll().isEmpty() || dayRepo.findAll().isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }

}
