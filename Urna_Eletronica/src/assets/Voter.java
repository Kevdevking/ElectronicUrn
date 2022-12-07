package assets;

import assetsEnum.VotingCapability;

public class Voter {
	
	private String name;
	private int age;
	private VotingCapability votingCapability;
	
	public Voter() {}

	public Voter(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public VotingCapability getVotingCapability() {
		return votingCapability;
	}

	public void setVotingCapability(int age) {
		String votingCapability = "Mandatory_vote";
		
		if ((age < 18 && age >= 16) || (age > 70)) {			
			votingCapability = "Optional_vote";
		} else if (age < 16) {
			votingCapability = "Cant_vote";
		}
		
		this.votingCapability = assetsEnum.VotingCapability.valueOf(votingCapability);
	}
	
	public String toString() {
		
		return "Name: " + this.getName() + "\nAge: " + this.getAge() + "\nVoting Capability: " + this.getVotingCapability();
	}
}
