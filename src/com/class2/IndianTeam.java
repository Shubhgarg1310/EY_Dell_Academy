package com.class2;

public class IndianTeam implements ISport {

	@Override
	public void setVenue(String place) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVisitingTeam(String place) {
		// TODO Auto-generated method stub
		System.out.println(place);
		
	}

	@Override
	public void setHomeTeam(String place) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		IndianTeam obj = new IndianTeam();
		obj.setVisitingTeam("AUS");
	}

}
