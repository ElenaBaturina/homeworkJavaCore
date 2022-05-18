package homework.team;


public class Team {
    private TeamMember[] members;
    private final String name;

    public Team(String name, TeamMember... members) {
        this.members = members;
        this.name = name;
    }

     public TeamMember[] getMembers() {
        return members;
    }


}
