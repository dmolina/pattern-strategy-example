package org.uca.dss.pattern.strategyexample;

import java.util.List;

public class ReportFormatText implements ReportFormat {

	public String output(String title, List<String> lines) {
		StringBuffer out = new StringBuffer();
		
		out.append(String.format("** %s **", title));
		
		for (String line : lines) {
			out.append(line +"\n");
		}
		
		return out.toString();
	}

}
