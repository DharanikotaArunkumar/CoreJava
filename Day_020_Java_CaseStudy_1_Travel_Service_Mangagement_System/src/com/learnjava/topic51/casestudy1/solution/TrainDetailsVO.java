package com.learnjava.topic51.casestudy1.solution;

import java.util.Date;

/* Train Detail Value Object */
public class TrainDetailsVO {
	private String trainNumber;
	private String route;
	private int source;
	private int destination;
	private char special;
	private Date dateOfTravel;
	
	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(final String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(final String route) {
		this.route = route;
	}

	public int getSource() {
		return source;
	}

	public void setSource(final int source) {
		this.source = source;
	}

	public int getDestination() {
		return destination;
	}

	public void setDestination(final int destination) {
		this.destination = destination;
	}

	public char getSpecial() {
		return special;
	}

	public void setSpecial(final char status) {
		this.special = status;
	}

	public void setDateOfTravel(final Date dateOfTravel){
		this.dateOfTravel= dateOfTravel;
	}
	public Date getDateOfTravel(){
		return dateOfTravel;
	}
	    
	
	

	@Override
	public String toString() {
		return "trainNumber=" + trainNumber + ", route=" + route + ", source=" + source
				+ ", destination=" + destination + ", special=" + special + ", dateOfTravel=" + dateOfTravel ;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		TrainDetailsVO other = (TrainDetailsVO) obj;
		
		if (trainNumber == null) {
			if (other.trainNumber != null) {
				return false;
			}
		} else if (!trainNumber.equals(other.trainNumber)) {
			return false;
		}
		if (route == null) {
			if (other.route != null) {
				return false;
			}
		} else if (!route.equals(other.route)) {
			return false;
		}
		if (special == ' ') {
			if (other.special != ' ') {
				return false;
			}
		} else if (special != other.special) {
			return false;
		}
		if (destination != other.destination) {
			return false;
		}
		if (source != other.source) {
			return false;
		}
	
		return true;
	}

}