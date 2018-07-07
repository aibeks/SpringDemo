package io.demo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneSevice;
	
	public BaseballCoach(FortuneService theFortuneService){
		this.fortuneSevice=theFortuneService;
	}
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneSevice.getFortune();
	}
	
	public void test(){
		System.out.println("hi");
	}
	//Made changes on demoA
}








