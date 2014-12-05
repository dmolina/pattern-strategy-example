package org.uca.dss.pattern.strategyexample;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class ReportTest extends Report {

	@Test
	public void testHtml() {
		
		List<String> msg = new LinkedList<String>();
		String title = "hola";
		msg.add("vemos");
		
		Report report  = new Report();
		report.setTitle(title);
		report.setText(msg);
		
		report.setFormat(new ReportFormatHtml());
		
		String out = report.output();
		String expected = "<html><head><title>hola</title></head><body><h1>hola</h1><p>vemos</p>";
		assertEquals(expected, out);
		
		report.setFormat(new ReportFormatText());
		out = report.output();
		expected = "** hola **vemos\n";
		assertEquals(expected, out);
	}

}
