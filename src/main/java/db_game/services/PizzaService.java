package db_game.services;

import db_game.entities.Pizza;
import db_game.repositories.PizzaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepo pizzaRepo;

    public void saveNewPizzaRecipe(Pizza pizza){
        pizzaRepo.save(pizza);
    }

    public List <Pizza> getAllPizzas(){
        return pizzaRepo.findAll();
    }

    public void deletePizzaRecipe(Long id){
        pizzaRepo.deleteById(id);
    }

    public Pizza getPizzaById(Long id){
        return pizzaRepo.findById(id).get();
    }

    public int returnNumberOfPizzas(){
        return pizzaRepo.findAll().size();
    }
}
