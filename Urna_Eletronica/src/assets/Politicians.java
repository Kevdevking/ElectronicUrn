package assets;

import javax.swing.ImageIcon;

import assetsEnum.RunningFor;

public class Politicians {

	private String name;
	private int age;
	private RunningFor runningFor;
	private int number;
	private int votes;
	private ImageIcon image;
	
	public Politicians() {
		
	}

	public Politicians(String name, int age, RunningFor runningFor, int number) {
		super();
		this.name = name;
		this.age = age;
		this.runningFor = runningFor;
		this.number = number;
		this.votes = 0;
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

	public RunningFor getRunningFor() {
		return runningFor;
	}

	public void setRunningFor(RunningFor runningFor) {
		this.runningFor = runningFor;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getVotes() {
		return votes;
	}

	public void addVote() {
		this.votes++;
	}

	public ImageIcon getImage() {
		return image;
	}

	public void setImage(ImageIcon image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\nRunning For=" + runningFor + "\nNumber of Votes=" + votes;
	}
	
	
}
	
	
