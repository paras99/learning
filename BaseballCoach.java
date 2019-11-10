package com.start.spring;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	
	
public BaseballCoach(FortuneService thefortuneService) {
	
		fortuneService = thefortuneService;
	}

@Override	
	public String getDaily()
	{
		return "workout daily ";
		
	}

@Override
public String getDailyFortune() {
	// TODO Auto-generated method stub
	return fortuneService.getFortune();
}
}
