package io.demo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	public CricketCoach() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside the cricket!");
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside the setEmailAddress!");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("Inside the setTeam!");
		this.team = team;
	}


	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Inside the setFortune!");
	}


	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast blowling for 15 mins";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
