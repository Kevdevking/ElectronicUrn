package application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import assets.Politicians;
import assets.Voter;
import assetsEnum.RunningFor;
import assetsEnum.VotingCapability;

public class Program {

	static void urn(List<Voter> voters, List<Politicians> president, List<Politicians> governor,
			List<Politicians> senator, List<Politicians> congressman, List<Politicians> stateRepresentative) {

		JOptionPane.showMessageDialog(null, "Hello Citizen!");
		Politicians blank = new Politicians("blank", 0, RunningFor.valueOf("blank"), 0);
		String voterName = JOptionPane.showInputDialog("Enter your name to proceed");
		int voterAge = Integer.parseInt(JOptionPane.showInputDialog("Now, " + voterName + " enter your age"));
		Voter voter = new Voter(voterName, voterAge);
		voter.setVotingCapability(voterAge);

		voters.add(voter);

//		JOptionPane.showMessageDialog(null, voter.toString());

		voter.getVotingCapability();

		if (voter.getVotingCapability().equals(VotingCapability.valueOf("Cant_vote"))) {
			JOptionPane.showMessageDialog(null, "Cant vote mf, bye bye " + voter.getName() + "!");

		} else if (voter.getVotingCapability().equals(VotingCapability.valueOf("Mandatory_vote"))) {

			int optionNullify = Integer.parseInt(JOptionPane.showInputDialog(
					"Do you want to nullify your vote for State Representative?" + "\n1 - NO" + "\n2- YES"));
			switch (optionNullify) {
			case 1:
				int stateRepresentativeNumber = Integer
						.parseInt(JOptionPane.showInputDialog("Cast your vote for State Representative (5 digits)"));
				for (Politicians candidate : stateRepresentative) {
					if (candidate.getNumber() == stateRepresentativeNumber) {
						candidate.addVote();
					}
					JOptionPane.showMessageDialog(null, candidate.getName().toString());
				}
			case 2:
				blank.addVote();
			}
			
			optionNullify = Integer.parseInt(JOptionPane.showInputDialog(
					"Do you want to nullify your vote for Congressman?" + "\n1 - NO" + "\n2- YES"));
			switch (optionNullify) {
			case 1:
				int congressmanNumber = Integer
						.parseInt(JOptionPane.showInputDialog("Cast your vote for Congressman (4 digits)"));
				for (Politicians candidate : congressman) {
					if (candidate.getNumber() == congressmanNumber) {
						candidate.addVote();
					}
					JOptionPane.showMessageDialog(null, candidate.getName().toString());
				}
			case 2:
				blank.addVote();
			}
			
			optionNullify = Integer.parseInt(JOptionPane.showInputDialog(
					"Do you want to nullify your vote for Senator?" + "\n1 - NO" + "\n2- YES"));
			switch (optionNullify) {
			case 1:
				int senatorNumber = Integer
						.parseInt(JOptionPane.showInputDialog("Cast your vote for Senator (3 digits)"));
				for (Politicians candidate : senator) {
					if (candidate.getNumber() == senatorNumber) {
						candidate.addVote();
					}
					JOptionPane.showMessageDialog(null, candidate.getName().toString());
				}
			case 2:
				blank.addVote();
			}

			optionNullify = Integer.parseInt(JOptionPane.showInputDialog(
					"Do you want to nullify your vote for Governor?" + "\n1 - NO" + "\n2- YES"));
			switch (optionNullify) {
			case 1:
				int governorNumber = Integer
						.parseInt(JOptionPane.showInputDialog("Cast your vote for Governor (2 digits)"));
				for (Politicians candidate : governor) {
					if (candidate.getNumber() == governorNumber) {
						candidate.addVote();
					}
					JOptionPane.showMessageDialog(null, candidate.getName().toString());
				}
			case 2:
				blank.addVote();
			}
			
			optionNullify = Integer.parseInt(JOptionPane.showInputDialog(
					"Do you want to nullify your vote for Governor?" + "\n1 - NO" + "\n2- YES"));
			switch (optionNullify) {
			case 1:
				int presidentNumber = Integer
						.parseInt(JOptionPane.showInputDialog("Cast your vote for President (2 digits)"));
				for (Politicians candidate : president) {
					if (candidate.getNumber() == presidentNumber) {
						candidate.addVote();
					}
					JOptionPane.showMessageDialog(null, candidate.getName().toString());
				}
			case 2:
				blank.addVote();
			}
		}
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
		president.add(runner);

		name = "Kid bengala";
		age = 69;
		runningFor = "President";
		number = 55;

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

	}
}