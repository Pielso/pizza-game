package db_game.services;

import db_game.entities.Cash;
import db_game.repositories.CashRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CashService {

    @Autowired
    private CashRepo cashRepo;

    public CashService(){

    }

    public Long getAmountOfCash(){
        List <Cash> cash = cashRepo.findAll();
        Cash tempCash = cash.getFirst();
        return tempCash.getAmountOfCash();
    }

    public Long getAmountOfDebt(){
        List <Cash> cash = cashRepo.findAll();
        Cash tempCash = cash.getFirst();
        return tempCash.getAmountOfDebt();
    }

    public void earnCash(Long amountEarned){
        List <Cash> cash = cashRepo.findAll();
        Cash tempCash = cash.getFirst();
        tempCash.setAmountOfCash(tempCash.getAmountOfCash()+amountEarned);
        cashRepo.save(tempCash);
    }

    public void saveCash(Cash cash){
        cashRepo.save(cash);
    }

    public void takeLoan(){
        cashRepo.deleteAll();
        Cash balance = new Cash(20000L, 50000L);
        saveCash(balance);
    }
}
