package com.example.e4.rcp.todo.model;

import java.util.Date;

public class Todo {

	private final long id;
	private String summary = "";
	private String description = "";
	private boolean done = false;
	private Date dueDate;

	public Todo(long id) {
		this.id = id;
	}

	public Todo(long id, String summary, String description, boolean done, Date dueDate) {
		this.id = id;
		this.summary = summary;
		this.description = description;
		this.done = done;
		this.dueDate = dueDate;

	}

	public long getId() {
		return id;
	}

	public String getSummary() {
		return summary;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", summary=" + summary + ", description=" + description + ", done=" + done
				+ ", dueDate=" + dueDate + "]";
	}

	public Todo copy() {
		return new Todo(this.id, this.summary, this.description, this.done, this.dueDate);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + (done ? 1231 : 1237);
		result = prime * result + ((dueDate == null) ? 0 : dueDate.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((summary == null) ? 0 : summary.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (done != other.done)
			return false;
		if (dueDate == null) {
			if (other.dueDate != null)
				return false;
		} else if (!dueDate.equals(other.dueDate))
			return false;
		if (id != other.id)
			return false;
		if (summary == null) {
			if (other.summary != null)
				return false;
		} else if (!summary.equals(other.summary))
			return false;
		return true;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public Date getDueDate() {
		return new Date(dueDate.getTime());
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = new Date(dueDate.getTime());
	}

}