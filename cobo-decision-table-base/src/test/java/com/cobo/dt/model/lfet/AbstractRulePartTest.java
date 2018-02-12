package com.cobo.dt.model.lfet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.io.StringWriter;
import java.util.ArrayList;

import org.junit.Test;
import org.simpleframework.xml.core.Persister;

public class AbstractRulePartTest {
	private static String NEW_LINE = "\n";
	
	private AbstractRulePart<AbstractOccurence> createUnderTest(String uid, Title title, Text text, ArrayList<SourceCode> sourceCodes, ArrayList<AbstractOccurence> occurences) {
		return new AbstractRulePart<AbstractOccurence>(uid, title, text, sourceCodes, occurences) {};
	}
	
	private String createExpectedXml_withoutOccurences() {
		return "< uId='12345'>" + NEW_LINE
		     + "   <Title value='title' language='English'/>" + NEW_LINE
		     + "   <Text value='docuText' language='English'/>" + NEW_LINE
		     + "   <SourceCode value='$foundItem' codeLanguage='Perl' sourceCodeType='LogArg'/>" + NEW_LINE
		     + "   <SourceCode value='$foundItem = ();' codeLanguage='Perl' sourceCodeType='Prolog'/>" + NEW_LINE
		     + "</>";
	}
	
	private String persist(AbstractRulePart<AbstractOccurence> rulePart) throws Exception {
		Persister xmlPersister = new Persister();
		StringWriter out = new StringWriter();
		xmlPersister.write(rulePart, out);
		return out.toString();		
	}

	
	@Test
	public void testAbstractRulePart() throws Exception {
		String uid = "12345";
		Title title = new Title("English", "title");
		Text text = new Text("English", "docuText");
		
		SourceCode sourceCode = new SourceCode("Perl", "LogArg", "$foundItem");
		ArrayList<SourceCode> sourceCodes = new ArrayList<SourceCode>();
		sourceCodes.add(sourceCode);
		
		ArrayList<AbstractOccurence> occurences = new ArrayList<AbstractOccurence>();
		
		AbstractRulePart<AbstractOccurence> rulePart = new AbstractRulePart<AbstractOccurence>(uid, title, text, sourceCodes, occurences) {};
		
		assertSame(uid, rulePart.getUId());
		assertSame(title, rulePart.getTitle());
		assertSame(text, rulePart.getText());
		assertSame(sourceCodes, rulePart.getSourceCodes());
		assertSame(occurences, rulePart.getOccurences());
	}

	@Test
	public void testPersistModel_withoutOccurences() throws Exception {
		SourceCode sourceCode1 = new SourceCode("Perl", "LogArg", "$foundItem");
		SourceCode sourceCode2 = new SourceCode("Perl", "Prolog", "$foundItem = ();");
		ArrayList<SourceCode> sourceCodes = new ArrayList<SourceCode>();
		sourceCodes.add(sourceCode1);
		sourceCodes.add(sourceCode2);
		
		AbstractRulePart<AbstractOccurence> action = createUnderTest("12345", new Title("English", "title"),
			new Text("English", "docuText"), sourceCodes, null);
		
		String xml = persist(action);
		assertEquals(createExpectedXml_withoutOccurences().replaceAll("'", "\""), xml);
	}	
}