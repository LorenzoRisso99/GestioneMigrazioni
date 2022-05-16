package it.polito.tdp.borders.model;

public class Event implements Comparable<Event>{
	
	private Country nazione;
	private int time;
	private int persone;
	
	public Event(int time, Country nazione, int persone) {
		super();
		this.time = time;
		this.nazione = nazione;
		this.persone = persone;
	}

	public Country getNazione() {
		return nazione;
	}

	public void setNazione(Country nazione) {
		this.nazione = nazione;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPersone() {
		return persone;
	}

	public void setPersone(int persone) {
		this.persone = persone;
	}
	
	@Override
	public int compareTo(Event other) {
		return this.time-other.time;
	}

	@Override
	public String toString() {
		return "Event [nazione=" + nazione + ", time=" + time + ", persone=" + persone + "]";
	}
	
	

}
