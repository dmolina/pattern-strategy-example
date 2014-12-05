package org.uca.dss.pattern.strategyexample;

import java.util.List;

public class ReportFormatHtml implements ReportFormat {

	public String output(String title, List<String> lines) {
		StringBuffer out = new StringBuffer();
		
		out.append("<html><head><title>");
		out.append(title);
		out.append("</title></head><body>");
		out.append("<h1>" +title +"</h1>");
		
		for (String line : lines) {
			out.append("<p>");
			out.append(line);
			out.append("</p>");
		}
		return out.toString();
	}

}
