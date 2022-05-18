package homework;

import homework.obstacleCourse.Course;
import homework.obstacleCourse.Cross;
import homework.obstacleCourse.Swimming;
import homework.obstacleCourse.Shooting;
import homework.obstacleCourse.Cycling;
import homework.team.Team;
import homework.team.TeamMember;

public class Main {

    public static void main(String[] args) {
        Team dreamTeam = new Team("Astronauts",
                new TeamMember("Alex", 57),
                new TeamMember("Sofia", 48),
                new TeamMember("Katrin", 62),
                new TeamMember("Maksim" ,75));

        Course course = new Course(new Cross(45), new Swimming(55), new Shooting(65), new Cycling(75));
        course.doIt(dreamTeam);




    }
}
