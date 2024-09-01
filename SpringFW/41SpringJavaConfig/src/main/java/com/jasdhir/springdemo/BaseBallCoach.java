package com.jasdhir.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class BaseBallCoach implements Coach{
	
	
	//@Autowired
	//@Qualifier("jackPotFortuneService")
	FortuneService lfs;
	
	
	
	 // @Autowired 
	  public BaseBallCoach(FortuneService lfs) { this.lfs = lfs; }
	 
	
	

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice Pitching PFP .... ";
	}

	/*
	 * @Autowired public void setLfs(FortuneService lfs) { this.lfs = lfs; }
	 */

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return lfs.getFortune();
	}

}
