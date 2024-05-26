package tomasz.morgas.backend.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tomasz.morgas.backend.entity.*;
import tomasz.morgas.backend.service.GoalService;

import java.util.List;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/goals")
public class RestController {

    private GoalService goalService;

    @Autowired
    public RestController(GoalService goalService) {
        this.goalService = goalService;

    }

    @CrossOrigin(origins = "null")
    @PostMapping
    public Goal addProduct(@RequestBody Goal goal){
        return goalService.addGoal(goal);

    }
    @CrossOrigin(origins = "null")
    @GetMapping
    public List<Goal> getGoals(){
        return goalService.getAllGoals();
    }

    @CrossOrigin(origins = "null")
    @DeleteMapping("/{id}")
    public void deleteGoal(@PathVariable int id) {
        goalService.deleteGoal(id);
    }

    @CrossOrigin(origins = "null")
    @GetMapping("/{id}")
    public Goal getGoal(@PathVariable int id){
        return goalService.getGoal(id);
    }


    @CrossOrigin(origins = "null")
    @GetMapping("/stats/{months}")
    public Stats getStats(@PathVariable int months){
        List<Goal> goals = goalService.getAllGoals();
        int amountOfGoals = 0;
        double sumPrices = 0;
        double savedCash = 0;
        double neededCash = 0;
        double monthCash = 0;

        for (Goal g : goals){
            amountOfGoals++;
            sumPrices += g.getPrice();
            savedCash += g.getSavedAmount();
            neededCash += g.getPrice() - g.getSavedAmount();
        }
        monthCash = neededCash/months;


        return new Stats(amountOfGoals, sumPrices, savedCash, neededCash, monthCash);
    }



}
