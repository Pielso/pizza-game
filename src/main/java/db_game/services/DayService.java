package db_game.services;

import db_game.entities.Day;
import db_game.repositories.DayRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DayService {

    @Autowired
    private DayRepo dayRepo;

    public void createDay(){
        dayRepo.deleteAll();
        Day day = new Day();
        dayRepo.save(day);
    }

    public Long getAmountOfDaysPassed(){
        List <Day> days = dayRepo.findAll();
        Day day = days.getFirst();
        return day.getDaysPastCounter();
    }
}
