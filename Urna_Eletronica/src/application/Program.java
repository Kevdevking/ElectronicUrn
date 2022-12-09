/**
 * authors: Kevin Toledo, Luis Otávio
 * class: Object Oriented Programming, final assignment
 * 
 */
package application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import assets.Politicians;
import assets.Voter;
import assetsEnum.RunningFor;
import assetsEnum.VotingCapability;

public class Program {
	
	static void Vote(List<Voter> voters,
			List<Politicians> president,
			List<Politicians> governor,
			List<Politicians> senator, 
			List<Politicians> congressman, 
			List<Politicians> stateRepresentative) {

		JOptionPane.showMessageDialog(null, "Hello Citizen!");
		String voterName = JOptionPane.showInputDialog("Enter your name to proceed");
		int voterAge = Integer.parseInt(JOptionPane.showInputDialog("Now, " + voterName + " enter your age"));
		Voter voter = new Voter(voterName, voterAge);
		voter.setVotingCapability(voterAge);

		voters.add(voter);

		voter.getVotingCapability();

		if (voter.getVotingCapability().equals(VotingCapability.valueOf("Cant_vote"))) {
			JOptionPane.showMessageDialog(null, "Cant vote mf, bye bye " + voter.getName() + "!");

		} else if (voter.getVotingCapability().equals(VotingCapability.valueOf("Mandatory_vote"))) {

			StateRepresentativeVote(stateRepresentative);
			CongressmanVote(congressman);
			SenatorVote(senator);
			GovernorVote(governor);
			PresidentVote(president);
		} else {
			int input = JOptionPane.showConfirmDialog(null,
					"Your vote is optional, do you want to proceed?");
			switch (input) {
			case 0:
				StateRepresentativeVote(stateRepresentative);
				CongressmanVote(congressman);
				SenatorVote(senator);
				GovernorVote(governor);
				PresidentVote(president);
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "Why did you even bother...");
				break;
			}
		}
		int input = JOptionPane.showConfirmDialog(null, "Do you want to register another voter?");
		switch (input) {
		case 0:
			Vote(voters, president, governor, senator, congressman, stateRepresentative);
			break;
		case 1:
			break;
		}
	}

	static void StateRepresentativeVote(List<Politicians> stateRepresentative) {

		int optionNullify = Integer.parseInt(JOptionPane.showInputDialog(
				"Do you want to nullify your vote for State Representative?" + "\n1 - NO" + "\n2- YES"));
		switch (optionNullify) {
		case 1:
			int stateRepresentativeNumber = Integer
					.parseInt(JOptionPane.showInputDialog("Cast your vote for State Representative (5 digits)"));
			for (Politicians candidate : stateRepresentative) {
				if (candidate.getNumber() == stateRepresentativeNumber) {
					candidate.addVote();

					int input = JOptionPane.showConfirmDialog(null,
							"Do you want to confirm your vote in " + candidate.getName() + "?");
					switch (input) {
					case 0:
						JOptionPane.showMessageDialog(null, "Vote for " + candidate.getName() + " confirmed!");
						break;
					case 1:
						StateRepresentativeVote(stateRepresentative);
						break;
					}
				}
			}
			break;
		case 2:
			for (Politicians candidate : stateRepresentative) {
				if (candidate.getName().equals("blank")) {
					candidate.addVote();
				}
			}
		}
	}

	static void CongressmanVote(List<Politicians> congressman) {

		int optionNullify = Integer.parseInt(JOptionPane
				.showInputDialog("Do you want to nullify your vote for Congressman?" + "\n1 - NO" + "\n2- YES"));
		switch (optionNullify) {
		case 1:
			int congressmanNumber = Integer
					.parseInt(JOptionPane.showInputDialog("Cast your vote for Congressman (4 digits)"));
			for (Politicians candidate : congressman) {
				if (candidate.getNumber() == congressmanNumber) {
					candidate.addVote();

					int input = JOptionPane.showConfirmDialog(null,
							"Do you want to confirm your vote in " + candidate.getName() + "?");
					switch (input) {
					case 0:
						JOptionPane.showMessageDialog(null, "Vote for " + candidate.getName() + " confirmed!");
						break;
					case 1:
						CongressmanVote(congressman);
						break;
					}
				}
			}
			break;
		case 2:
			for (Politicians candidate : congressman) {
				if (candidate.getName().equals("blank")) {
					candidate.addVote();
				}
			}
		}
	}

	static void SenatorVote(List<Politicians> senator) {

		int optionNullify = Integer.parseInt(
				JOptionPane.showInputDialog("Do you want to nullify your vote for Senator?" + "\n1 - NO" + "\n2- YES"));
		switch (optionNullify) {
		case 1:
			int senatorNumber = Integer.parseInt(JOptionPane.showInputDialog("Cast your vote for Senator (3 digits)"));
			for (Politicians candidate : senator) {
				if (candidate.getNumber() == senatorNumber) {
					candidate.addVote();

					int input = JOptionPane.showConfirmDialog(null,
							"Do you want to confirm your vote in " + candidate.getName() + "?");
					switch (input) {
					case 0:
						JOptionPane.showMessageDialog(null, "Vote for " + candidate.getName() + " confirmed!");
						break;
					case 1:
						SenatorVote(senator);
						break;
					}
				}
			}
			break;
		case 2:
			for (Politicians candidate : senator) {
				if (candidate.getName().equals("blank")) {
					candidate.addVote();
				}
			}
		}
	}
	
	static void GovernorVote(List<Politicians> governor) {

		int optionNullify = Integer.parseInt(
				JOptionPane.showInputDialog("Do you want to nullify your vote for Governor?" + "\n1 - NO" + "\n2- YES"));
		switch (optionNullify) {
		case 1:
			int governorNumber = Integer.parseInt(JOptionPane.showInputDialog("Cast your vote for Governor (2 digits)"));
			for (Politicians candidate : governor) {
				if (candidate.getNumber() == governorNumber) {
					candidate.addVote();

					int input = JOptionPane.showConfirmDialog(null,
							"Do you want to confirm your vote in " + candidate.getName() + "?");
					switch (input) {
					case 0:
						JOptionPane.showMessageDialog(null, "Vote for " + candidate.getName() + " confirmed!");
						break;
					case 1:
						GovernorVote(governor);
						break;
					}
				}
			}
			break;
		case 2:
			for (Politicians candidate : governor) {
				if (candidate.getName().equals("blank")) {
					candidate.addVote();
				}
			}
		}
	}
	
	static void PresidentVote(List<Politicians> president) {

		int optionNullify = Integer.parseInt(
				JOptionPane.showInputDialog("Do you want to nullify your vote for President?" + "\n1 - NO" + "\n2- YES"));
		switch (optionNullify) {
		case 1:
			int presidentNumber = Integer.parseInt(JOptionPane.showInputDialog("Cast your vote for President (2 digits)"));
			for (Politicians candidate : president) {
				if (candidate.getNumber() == presidentNumber) {
					candidate.addVote();
					
					JOptionPane.showMessageDialog(null, candidate.getImage());
					int input = JOptionPane.showConfirmDialog(null,
							"Do you want to confirm your vote in " + candidate.getName() + "?");
					switch (input) {
					case 0:
						JOptionPane.showMessageDialog(null, "Vote for " + candidate.getName() + " confirmed!");
						break;
					case 1:
						PresidentVote(president);
						break;
					}
				}
			}
			break;
		case 2:
			for (Politicians candidate : president) {
				if (candidate.getName().equals("blank")) {
					candidate.addVote();
				}
			}
		}
	}
	
	static Politicians voteCounterPresident(List<Politicians> president) {
		
		Politicians presidentElected = president.get(0);
		
		for (Politicians candidate : president) {
			if (candidate.getVotes() > presidentElected.getVotes()) {
				presidentElected = candidate;
			}
		}		
		return presidentElected;
	}

	public static void main(String[] args) {

		List<Voter> voters = new ArrayList<>();
		List<Politicians> president = new ArrayList<>();
		List<Politicians> governor = new ArrayList<>();
		List<Politicians> senator = new ArrayList<>();
		List<Politicians> congressman = new ArrayList<>();
		List<Politicians> stateRepresentative = new ArrayList<>();

		String name = "Johnny Sins";
		int age = 55;
		String runningFor = "President";
		int number = 69;

		Politicians runner = new Politicians(name, age, RunningFor.valueOf(runningFor), number);
		ImageIcon icon = new ImageIcon("src/JS.png");
		runner.setImage(icon);
		president.add(runner);
		

		name = "Kid Bengala";
		age = 69;
		runningFor = "President";
		number = 55;

		runner = new Politicians(name, age, RunningFor.valueOf(runningFor), number);
		president.add(runner);
		
		name = "blank";
		age = 0;
		runningFor = "President";
		number = 0;

		runner = new Politicians(name, age, RunningFor.valueOf(runningFor), number);
		president.add(runner);

		name = "Bob";
		age = 33;
		runningFor = "Governor";
		number = 55;

		runner = new Politicians(name, age, RunningFor.valueOf(runningFor), number);
		governor.add(runner);

		name = "Homer";
		age = 66;
		runningFor = "Governor";
		number = 69;

		runner = new Politicians(name, age, RunningFor.valueOf(runningFor), number);
		governor.add(runner);
		
		name = "blank";
		age = 0;
		runningFor = "Governor";
		number = 0;

		runner = new Politicians(name, age, RunningFor.valueOf(runningFor), number);
		governor.add(runner);

		name = "Batman";
		age = 44;
		runningFor = "Senator";
		number = 555;

		runner = new Politicians(name, age, RunningFor.valueOf(runningFor), number);
		senator.add(runner);

		name = "Superman";
		age = 44;
		runningFor = "Senator";
		number = 696;

		runner = new Politicians(name, age, RunningFor.valueOf(runningFor), number);
		senator.add(runner);
		
		name = "blank";
		age = 0;
		runningFor = "Senator";
		number = 0;

		runner = new Politicians(name, age, RunningFor.valueOf(runningFor), number);
		senator.add(runner);

		name = "Hannibal Lecter";
		age = 77;
		runningFor = "Congressman";
		number = 6660;

		runner = new Politicians(name, age, RunningFor.valueOf(runningFor), number);
		congressman.add(runner);

		name = "voorhees.json";
		age = 55;
		runningFor = "Congressman";
		number = 0666;

		runner = new Politicians(name, age, RunningFor.valueOf(runningFor), number);
		congressman.add(runner);
		
		name = "blank";
		age = 0;
		runningFor = "Congressman";
		number = 0;

		runner = new Politicians(name, age, RunningFor.valueOf(runningFor), number);
		congressman.add(runner);

		name = "George Lucas";
		age = 66;
		runningFor = "State_Representative";
		number = 01010;

		runner = new Politicians(name, age, RunningFor.valueOf(runningFor), number);
		stateRepresentative.add(runner);

		name = "Stanley Kubrik";
		age = 88;
		runningFor = "State_Representative";
		number = 12345;

		runner = new Politicians(name, age, RunningFor.valueOf(runningFor), number);
		stateRepresentative.add(runner);
		
		name = "blank";
		age = 0;
		runningFor = "State_Representative";
		number = 0;

		runner = new Politicians(name, age, RunningFor.valueOf(runningFor), number);
		stateRepresentative.add(runner);

		Vote(voters, president, governor, senator, congressman, stateRepresentative);
		Politicians presidentElected = voteCounterPresident(president);
		JOptionPane.showMessageDialog(null,"President Elected:\n" + presidentElected.toString());
	}
}