package db_game.controllers;

import db_game.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/")
public class HomeAndNavigationController {

    @Autowired
    private CashService cashService;
    @Autowired
    private DayService dayService;
    @Autowired
    private NavService navService;
    @Autowired
    private PizzaService pizzaService;
    @Autowired
    CustomerService customerService;
    @Autowired
    ToppingIndexService toppingIndexService;

    @GetMapping("/pizzagame")
    public String getHomePage(){
        return "start-page";
    }

    @GetMapping("/pizzagame/new-restaurant")
    public String getRestaurantPageFirstTime(Model model){
        cashService.takeLoan();
        dayService.createDay();
        model.addAttribute("cash", cashService.getAmountOfCash());
        model.addAttribute("debt", cashService.getAmountOfDebt());
        model.addAttribute("day", dayService.getAmountOfDaysPassed());
        return "restaurant-page";
    }

    @GetMapping("/pizzagame/restaurant")
    public String getRestaurantPage(Model model){
        if (!navService.testIfDatabaseIsEmpty()){

            // For header values
            model.addAttribute("cash", cashService.getAmountOfCash());
            model.addAttribute("debt", cashService.getAmountOfDebt());
            model.addAttribute("amountOfCustomers", customerService.getAmountOfCustomers());
            model.addAttribute("day", dayService.getAmountOfDaysPassed());

            // Page Specifics
            model.addAttribute("customers", customerService.getAllCustomers());
            model.addAttribute("pizzas", pizzaService.getAllPizzas());

            return "restaurant-page";
        }
        else {
            return "redirect:/pizzagame";
        }

    }

//    @PostMapping("/pizzagame/restaurant/serve-customer")
//    public String serveCustomer(@ModelAttribute Customer customer, Long id){
//        Long customerSatisfaction = 0L;
//        if (toppingIndexService.getListOfServedToppingsById(id).contains(customer.getFavoriteTopping1())){
//            customerSatisfaction =+1L;
//        }
//        if (toppingIndexService.getListOfServedToppingsById(id).contains(customer.getFavoriteTopping2())){
//            customerSatisfaction =+1L;
//        }
//        if (toppingIndexService.getListOfServedToppingsById(id).contains(customer.getFavoriteTopping3())){
//            customerSatisfaction =+1L;
//        }
//        cashService.addCash((customer.getCashOnHand() + customerSatisfaction));
//        customerService.deleteCustomerById(customer.getCustomerId());
//
//        return "redirect:/pizzagame/restaurant";
//    }

    @GetMapping("/pizzagame/kitchen")
    public String getKitchenPage(Model model){
        if (!navService.testIfDatabaseIsEmpty()){

            // For header values
            model.addAttribute("cash", cashService.getAmountOfCash());
            model.addAttribute("debt", cashService.getAmountOfDebt());
            model.addAttribute("amountOfCustomers", customerService.getAmountOfCustomers());
            model.addAttribute("day", dayService.getAmountOfDaysPassed());

            // Page Specifics
            model.addAttribute("pizzas", pizzaService.getAllPizzas());
            model.addAttribute("toppings", customerService.getListOfToppings());
            return "kitchen-page";
        }
        else {
            return "redirect:/pizzagame";
        }
    }

    @GetMapping("/pizzagame/pantry")
    public String getPantryPage(Model model){
        if (!navService.testIfDatabaseIsEmpty()){

            // For header values
            model.addAttribute("cash", cashService.getAmountOfCash());
            model.addAttribute("debt", cashService.getAmountOfDebt());
            model.addAttribute("amountOfCustomers", customerService.getAmountOfCustomers());
            model.addAttribute("day", dayService.getAmountOfDaysPassed());

            // Page specifics

            return "pantry-page";
        }
        else {
            return "redirect:/pizzagame";
        }
    }

    @GetMapping("/pizzagame/office")
    public String getOfficePage(Model model){
        if (!navService.testIfDatabaseIsEmpty()){

            // For header values
            model.addAttribute("cash", cashService.getAmountOfCash());
            model.addAttribute("debt", cashService.getAmountOfDebt());
            model.addAttribute("amountOfCustomers", customerService.getAmountOfCustomers());
            model.addAttribute("day", dayService.getAmountOfDaysPassed());

            // Page specifics

            return "office-page";
        }
        else {
            return "redirect:/pizzagame";
        }
    }

    @GetMapping("/pizzagame/bank")
    public String getBankPage(Model model){
        if (!navService.testIfDatabaseIsEmpty()){

            // For header values
            model.addAttribute("cash", cashService.getAmountOfCash());
            model.addAttribute("debt", cashService.getAmountOfDebt());
            model.addAttribute("amountOfCustomers", customerService.getAmountOfCustomers());
            model.addAttribute("day", dayService.getAmountOfDaysPassed());

            // Page specifics

            return "bank-page";
        }
        else {
            return "redirect:/pizzagame";
        }
    }

    @GetMapping("/pizzagame/nextday")
    public String nextDay(Model model){
        if (!navService.testIfDatabaseIsEmpty()) {
            customerService.generateCustomers(10);
            model.addAttribute("cash", cashService.getAmountOfCash());
            model.addAttribute("debt", cashService.getAmountOfDebt());
            model.addAttribute("customers", customerService.getAllCustomers());
            model.addAttribute("day", dayService.getAmountOfDaysPassed());
            model.addAttribute("pizzas", pizzaService.getAllPizzas());
            return "redirect:/pizzagame/restaurant";
        }
        else {
            return "redirect:/pizzagame";
        }

    }




}
