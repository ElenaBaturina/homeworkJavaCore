package homework.obstacleCourse;

import homework.team.TeamMember;

public class Shooting extends Obstacle {
    public Shooting(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.shot(super.getDifficulty());
    }
}
