package tomasz.morgas.backend.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tomasz.morgas.backend.entity.Goal;

import java.util.List;
import java.util.Optional;

@Repository
public class GoalServiceImpl implements GoalService {
    GoalRepository goalRepository;

    @Autowired
    public GoalServiceImpl(GoalRepository goalRepository){
        this.goalRepository = goalRepository;
    }


    @Override
    public List<Goal> getAllGoals() {
        return goalRepository.findAll();
    }

    @Override
    public Goal getGoal(int goalID) {
        Optional<Goal> result = goalRepository.findById(goalID);
        Goal goal = null;

        if (result.isPresent()) {
            goal = result.get();
        }
        else {
            return null;
        }

        return goal;

    }
    @Transactional
    @Override
    public Goal addGoal(Goal goal) {
        return goalRepository.save(goal);
    }
    @Transactional
    @Override
    public void deleteGoal(int goalID) {
        goalRepository.deleteById(goalID);
    }

}
