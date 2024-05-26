package tomasz.morgas.backend.entity;

public class Stats {
    private int amountOfGoals;
    private double sumPrices;

    private double sumSavedCash;

    private double neededCash;

    private double cashPerMonth;

    public Stats(int amountOfGoals, double sumPrices, double sumSavedCash, double neededCash, double cashPerMonth) {
        this.amountOfGoals = amountOfGoals;
        this.sumPrices = sumPrices;
        this.sumSavedCash = sumSavedCash;
        this.neededCash = neededCash;
        this.cashPerMonth = cashPerMonth;
    }

    public Stats() {
    }

    public int getAmountOfGoals() {
        return amountOfGoals;
    }

    public void setAmountOfGoals(int amountOfGoals) {
        this.amountOfGoals = amountOfGoals;
    }

    public double getSumPrices() {
        return sumPrices;
    }

    public void setSumPrices(double sumPrices) {
        this.sumPrices = sumPrices;
    }

    public double getSumSavedCash() {
        return sumSavedCash;
    }

    public void setSumSavedCash(double sumSavedCash) {
        this.sumSavedCash = sumSavedCash;
    }

    public double getNeededCash() {
        return neededCash;
    }

    public void setNeededCash(double neededCash) {
        this.neededCash = neededCash;
    }

    public double getCashPerMonth() {
        return cashPerMonth;
    }

    public void setCashPerMonth(double cashPerMonth) {
        this.cashPerMonth = cashPerMonth;
    }
}
