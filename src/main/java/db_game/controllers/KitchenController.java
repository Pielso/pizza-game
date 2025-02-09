package db_game.controllers;

import db_game.entities.Pizza;
import db_game.entities.ToppingIndex;
import db_game.exceptions.MaxTenPizzas;
import db_game.services.PizzaService;
import db_game.services.ToppingIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class KitchenController {

    @Autowired
    private PizzaService pizzaService;
    @Autowired
    private ToppingIndexService toppingIndexService;

    @PostMapping("/pizzagame/kitchen")
    public String saveNewPizzaRecipe(@ModelAttribute Pizza pizza, @ModelAttribute ToppingIndex toppingIndex){

        if (pizzaService.returnNumberOfPizzas() < 10){
            pizzaService.saveNewPizzaRecipe(pizza);
            toppingIndex.setPizzaId(pizza.getNameOfPizza());
            toppingIndexService.saveNewToppingIndex(toppingIndex);
            return "redirect:/pizzagame/kitchen";
        }
        else {
            throw new MaxTenPizzas();
        }


    }

    @PostMapping("/pizzagame/kitchen/delete-pizza")
    public String deletePizza(Long id){
        pizzaService.deletePizzaRecipe(id);
        toppingIndexService.deleteToppingIndexById(id);
        return "redirect:/pizzagame/kitchen";
    }

}
