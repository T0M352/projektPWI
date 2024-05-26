package tomasz.morgas.backend.service;

import tomasz.morgas.backend.entity.Goal;

import java.util.List;

public interface GoalService {

    public List<Goal> getAllGoals();

    public Goal getGoal(int goalID);

    public Goal addGoal(Goal goal);

    public void deleteGoal(int goalID);

}
