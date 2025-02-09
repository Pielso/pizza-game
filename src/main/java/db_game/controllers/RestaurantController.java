package db_game.controllers;

import db_game.services.CashService;
import db_game.services.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pizzagame/restaurant")
public class RestaurantController {

    @Autowired
    private CashService cashService;

    @Autowired
    private DayService dayService;


}
