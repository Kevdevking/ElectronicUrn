//package assets;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import assetsEnum.RunningFor;
//
//public class electronicUrnRegistry {
//	
//	private List<Voter> voter = new ArrayList<>();
//	private List<Politicians> president = new ArrayList<>();
//	private List<Politicians> governor = new ArrayList<>();
//	private List<Politicians> senator = new ArrayList<>();
//	private List<Politicians> congressman = new ArrayList<>();
//	private List<Politicians> stateRepresentative = new ArrayList<>();
//	
//	public void generateElectronicUrnRegistry() {
//		
//		List<Politicians> president = new ArrayList<>();
//		List<Politicians> governor = new ArrayList<>();
//		List<Politicians> senator = new ArrayList<>();
//		List<Politicians> congressman = new ArrayList<>();
//		List<Politicians> stateRepresentative = new ArrayList<>();
//		
//		String name = "Johnny Sins";
//		int age = 55;
//		String runningFor = "President";
//		int number = 69;
//		
//		Politicians runner = new Politicians(name, age, RunningFor.valueOf(runningFor) , number);
//		president.add(runner);
//		
//		name = "Kid bengala";
//		age = 69;
//		runningFor = "President";
//		number = 55;
//		
//		runner = new Politicians(name, age, RunningFor.valueOf(runningFor) , number);
//		president.add(runner);
//		
//		name = "Bob";
//		age = 33;
//		runningFor = "Governor";
//		number = 55;
//		
//		runner = new Politicians(name, age, RunningFor.valueOf(runningFor) , number);
//		governor.add(runner);
//		
//		name = "Homer";
//		age = 66;
//		runningFor = "Governor";
//		number = 69;
//		
//		runner = new Politicians(name, age, RunningFor.valueOf(runningFor) , number);
//		governor.add(runner);
//		
//		name = "Batman";
//		age = 44;
//		runningFor = "Senator";
//		number = 555;
//		
//		runner = new Politicians(name, age, RunningFor.valueOf(runningFor) , number);
//		senator.add(runner);
//		
//		name = "Superman";
//		age = 44;
//		runningFor = "Senator";
//		number = 696;
//		
//		runner = new Politicians(name, age, RunningFor.valueOf(runningFor) , number);
//		senator.add(runner);
//		
//		name = "Hannibal Lecter";
//		age = 77;
//		runningFor = "Congressman";
//		number = 6660;
//		
//		runner = new Politicians(name, age, RunningFor.valueOf(runningFor) , number);
//		congressman.add(runner);
//		
//		name = "voorhees.json";
//		age = 55;
//		runningFor = "Congressman";
//		number = 0666;
//		
//		runner = new Politicians(name, age, RunningFor.valueOf(runningFor) , number);
//		congressman.add(runner);
//		
//		name = "George Lucas";
//		age = 66;
//		runningFor = "State_Representative";
//		number = 01010;
//		
//		runner = new Politicians(name, age, RunningFor.valueOf(runningFor) , number);
//		stateRepresentative.add(runner);
//		
//		name = "Stanley Kubrik";
//		age = 88;
//		runningFor = "State_Representative";
//		number = 12345;
//		
//		runner = new Politicians(name, age, RunningFor.valueOf(runningFor) , number);
//		stateRepresentative.add(runner);
//	}
//	
//	
//	public void addVoter(Voter voter) {
//		this.voter.add(voter);
//	}
//	
//	public void addpresident(Politicians president) {
//		this.president.add(president);
//	}
//
//	public void addGovernor(Politicians governor) {
//		this.governor.add(governor);
//	}
//
//	public void setSenator(Politicians senator) {
//		this.senator.add(senator);
//	}
//
//	public void setCongressman(Politicians congressman) {
//		this.congressman.add(congressman);
//	}
//
//	public void setStateRepresentative(  stateRepresentative) {
//		this.stateRepresentative.add(stateRepresentative);
//	}	
//}
