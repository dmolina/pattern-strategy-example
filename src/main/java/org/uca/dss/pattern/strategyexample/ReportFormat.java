package org.uca.dss.pattern.strategyexample;

import java.util.List;

public interface ReportFormat {
	public String output(String title, List<String> lines);
}
