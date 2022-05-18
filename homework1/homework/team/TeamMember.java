package homework.team;


import homework.Status;

public class TeamMember {
    private Status status = Status.NoPassedDistance;
    private final String name;
    private final int power;

    public TeamMember(String name, int power) {
        this.name = name;
        this.power = power;

    }

    public Status getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }


    public void shot(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," Попал в цель ");
        }
        else{
            changeStatus(Status.NoPassedDistance," Промахнулся ");
        }
    }

    public void run(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," Пробежал кросс");
        }
        else{
            changeStatus(Status.NoPassedDistance," Не смог пробежал кросс");
        }
    }

    public void swim(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," Проплыл дистанцию");
        }
        else{
            changeStatus(Status.NoPassedDistance," Не сумел проплыть дистанцию");
        }
    }

    public void drive (int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," Доехал до финиша ");
        }
        else{
            changeStatus(Status.NoPassedDistance," Не смог приехать к финишу");
        }
    }


    private boolean checkPower(int courseDifficulty) {
        return power > courseDifficulty || power == courseDifficulty;
    }

    private void changeStatus(Status newStatus, String message) {
        status = newStatus;
        System.out.println(name + message);
    }

}
