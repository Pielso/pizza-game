package db_game.services;

import db_game.entities.ToppingIndex;
import db_game.repositories.ToppingIndexRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



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

//    public List <String> getListOfServedToppingsById(Long id){
//        List <String> listOfServedToppings = new ArrayList<>();
//        listOfServedToppings.add(toppingIndexRepo.findById(id).get().getTopping4());
//        listOfServedToppings.add(toppingIndexRepo.findById(id).get().getTopping5());
//        listOfServedToppings.add(toppingIndexRepo.findById(id).get().getTopping6());
//        listOfServedToppings.add(toppingIndexRepo.findById(id).get().getTopping7());
//        listOfServedToppings.add(toppingIndexRepo.findById(id).get().getTopping8());
//        listOfServedToppings.add(toppingIndexRepo.findById(id).get().getTopping9());
//        return listOfServedToppings;
//    }
}
