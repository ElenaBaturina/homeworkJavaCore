package homework.obstacleCourse;


import homework.team.TeamMember;

public class Cycling extends Obstacle {

    public Cycling(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.drive(super.getDifficulty());
    }

}
