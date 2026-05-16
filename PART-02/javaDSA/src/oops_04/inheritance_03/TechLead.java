package oops_04.inheritance_03;

//inter face for multiple inheritance
interface ProjectManager {
	void manageProject();
}

interface TeamLead {
	void leadTeam();
}


public class TechLead extends Empolyee implements ProjectManager, TeamLead {

	private String projectManaged;
	private int teamSize;

	public TechLead(String name, int empId, String project, int teamSize) {
		super(name, empId);
		this.projectManaged = project;
		this.teamSize = teamSize;
	}

	public void displayInfo() {
		display();
		manageProject();
		leadTeam();
	}

	@Override
	public void manageProject() {
		System.out.println("Project magnage mangaging Project" + projectManaged);
	}

	public void leadTeam() {
		System.out.println("Team lead leading a team of " + teamSize + " members.");
	}

}
