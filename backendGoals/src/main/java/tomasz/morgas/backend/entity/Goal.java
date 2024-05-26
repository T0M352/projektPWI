package tomasz.morgas.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name ="goal")
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="goal_name")
    private String goalName;
    @Column(name="goal_desc")
    private String goalDesc;
    @Column(name="price")
    private double price;
    @Column(name="saved_amount")
    private double savedAmount;

    public Goal(String goalName, String goalDesc, double price, double savedAmount) {
        this.goalName = goalName;
        this.goalDesc = goalDesc;
        this.price = price;
        this.savedAmount = savedAmount;
    }

    public Goal() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoalName() {
        return goalName;
    }

    public void setGoalName(String goalName) {
        this.goalName = goalName;
    }

    public String getGoalDesc() {
        return goalDesc;
    }

    public void setGoalDesc(String goalDesc) {
        this.goalDesc = goalDesc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSavedAmount() {
        return savedAmount;
    }

    public void setSavedAmount(double savedAmount) {
        this.savedAmount = savedAmount;
    }
}
