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


	@Override
	public void leadTeam() {
		System.out.println("Team lead leading a team of " + teamSize + " members.");
	}

}
/*
remember: Interface method → implicitly public & abstract.
          Class method with no modifier → package-private.
          Therefore, you must explicitly write public when implementing the interface method.

Multiple inheritance: When one child class inherits from more than one parent.

In Java, it is achieved using multiple interfaces.

class Child implements Father, Mother { }

Child gets behavior/contracts from both Father and Mother.

 */