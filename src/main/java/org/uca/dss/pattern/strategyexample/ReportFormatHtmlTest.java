package org.uca.dss.pattern.strategyexample;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class ReportFormatHtmlTest extends ReportFormatHtml {

	@Test
	public void testSimple() {
		ReportFormat reportFormat = new ReportFormatHtml();
		List<String> msg = new LinkedList<String>();
		msg.add("vemos");
		String out = reportFormat.output("hola", msg);
		String expected = "<html><head><title>hola</title></head><body><h1>hola</h1><p>vemos</p>";
		assertEquals(expected, out);
	}

}
