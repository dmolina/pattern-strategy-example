package org.uca.dss.pattern.strategyexample;

import java.util.List;

public class Report {
	private String title;
	private List<String> text;
	ReportFormat format;
	
	public Report() {
		this.format = new ReportFormatText();
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getText() {
		return text;
	}
	public void setText(List<String> text) {
		this.text = text;
	}
	
	public void setFormat(ReportFormat format) {
		this.format = format;
	}
	
	public String output() {
		return format.output(title, text);
	}
}
