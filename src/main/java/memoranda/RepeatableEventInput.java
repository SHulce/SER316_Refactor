package main.java.memoranda;

import main.java.memoranda.date.CalendarDate;

/**
 * Parameter object for EventsManager.createRepeatableEvent
 * 
 * @author Shawn Hulce
 * @file RepeatableEventInput.java
 * @version April 2018
 *
 */

public class RepeatableEventInput {
	
	int type;
	CalendarDate startDate;
	CalendarDate endDate;
	int period;
	int hourVal;
	int minuteVal;
	String noteText;
	boolean workDays;
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public CalendarDate getStartDate() {
		return startDate;
	}
	public void setStartDate(CalendarDate startDate) {
		this.startDate = startDate;
	}
	public CalendarDate getEndDate() {
		return endDate;
	}
	public void setEndDate(CalendarDate endDate) {
		this.endDate = endDate;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public int getHourVal() {
		return hourVal;
	}
	public void setHourVal(int hourVal) {
		this.hourVal = hourVal;
	}
	public int getMinuteVal() {
		return minuteVal;
	}
	public void setMinuteVal(int minuteVal) {
		this.minuteVal = minuteVal;
	}
	public String getNoteText() {
		return noteText;
	}
	public void setNoteText(String noteText) {
		this.noteText = noteText;
	}
	public boolean isWorkDays() {
		return workDays;
	}
	public void setWorkDays(boolean workDays) {
		this.workDays = workDays;
	}

}
	
	