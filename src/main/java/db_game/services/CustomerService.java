package db_game.services;

import db_game.entities.Customer;
import db_game.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    List <String> listOfToppings = new ArrayList<>();
    List <String> listOfCustomerNames = new ArrayList<>();

    public void generateCustomers(int numberOfCustomers){
        customerRepo.deleteAll();

        Random customerCreation = new Random();
        for (int i = 0; i < numberOfCustomers; i++){
            int customerName;
            int fav1;
            int fav2;
            int fav3;
            do {
                customerName = customerCreation.nextInt(0, getListOfCustomerNames().size()-1);
                fav1 = customerCreation.nextInt(0, getListOfToppings().size()-1);
                fav2 = customerCreation.nextInt(0, getListOfToppings().size()-1);
                fav3 = customerCreation.nextInt(0, getListOfToppings().size()-1);
            }
            while (fav1 == fav2 || fav1 == fav3 || fav2 == fav3);
            Customer customer = new Customer(getListOfCustomerNames().get(customerName), getListOfToppings().get(fav1), getListOfToppings().get(fav2), getListOfToppings().get(fav3), 10);
            customerRepo.save(customer);
        }
    }

    public int getAmountOfCustomers(){
        return customerRepo.findAll().size();
    }

    public List <Customer> getAllCustomers(){
        return customerRepo.findAll();
    }

    public List <String> getListOfToppings(){
        listOfToppings.addAll(Arrays.asList
                ("Ham", "Mushroom", "Kebab", "Tuna", "Beef", "Pork", "Olives", "Paprika",
                        "Onion", "Pineapple", "Shrimps", "Bacon", "Jalapeños", "Sauce"));
        return listOfToppings;
    }

    public List <String> getListOfCustomerNames(){
        listOfCustomerNames.addAll(Arrays.asList
                ("Diana", "Patrick", "Claudia", "John", "Kara", "Walter", "Olivia", "Peter", "Laura", "Lee", "Wendy", "Kyle", "Angelica",
                        "Thomas", "Parisa", "Daniel", "Nina", "Miles", "Mary", "Michael", "Patricia", "Robert", "Jennifer", "David", "Elizabeth",
                        "William", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Karen", "Christopher", "Sarah", "Charles", "Lisa",
                        "Nancy", "Matthew", "Sandra", "Anthony", "Betty", "Mark", "Ashley", "Donald", "Emily", "Steven", "Kimberly", "Andrew", "Margaret",
                        "Paul", "Donna", "Joshua", "Michelle", "Kenneth", "Carol", "Kevin", "Amanda", "Brian", "Melissa", "Timothy", "Deborah", "Ronald",
                        "Stephanie", "George", "Rebecca", "Jason", "Sharon", "Edward", "Jeffrey", "Cynthia", "Ryan", "Dorothy", "Jacob", "Amy", "Nicholas",
                        "Kathleen", "Gary", "Angela", "Eric", "Shirley", "Jonathan", "Emma", "Stephen", "Brenda", "Larry", "Pamela", "Justin", "Nicole",
                        "Scott", "Anna", "Brandon", "Samantha", "Benjamin", "Katherine", "Samuel", "Christine", "Gregory", "Debra", "Alexander", "Rachel",
                        "Carolyn", "Frank", "Janet", "Raymond", "Maria", "Jack", "Dennis", "Heather", "Jerry", "Helen", "Tyler", "Catherine", "Aaron", "Diane",
                        "Jose", "Julie", "Adam", "Victoria", "Nathan", "Joyce", "Henry", "Lauren", "Zachary", "Kelly", "Douglas", "Christina", "Ruth", "Joan",
                        "Noah", "Virginia", "Ethan", "Judith", "Jeremy", "Evelyn", "Christian", "Hannah", "Andrea", "Keith", "Megan", "Austin", "Cheryl",
                        "Roger", "Jacqueline", "Terry", "Madison", "Sean", "Teresa", "Gerald", "Abigail", "Carl", "Sophia", "Dylan", "Martha", "Harold",
                        "Sara", "Jordan", "Gloria", "Jesse", "Janice", "Bryan", "Kathryn", "Lawrence", "Ann", "Arthur", "Isabella", "Gabriel", "Judy",
                        "Bruce", "Charlotte", "Logan", "Julia", "Billy", "Grace", "Joe", "Amber", "Alan", "Alice", "Juan", "Jean", "Elijah", "Denise",
                        "Willie", "Frances", "Albert", "Danielle", "Wayne", "Marilyn", "Randy", "Natalie", "Mason", "Beverly", "Vincent", "Liam",
                        "Brittany", "Roy", "Theresa", "Bobby", "Kayla", "Caleb", "Alexis", "Bradley", "Doris", "Russell", "Lori", "Lucas", "Tiffany"));

        return listOfCustomerNames;
    }

    public void deleteCustomerById(Long id){
        customerRepo.deleteById(id);
    }
}
