package com.cobo.dt.model.lfet;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict = false)
public abstract class AbstractOccurence {
	@Attribute(required = true, name = "uId")
	private String uid;

	@Element(required = true, name = "Symbol")
	private Symbol symbol;

	@Element(required = true, name = "Title")
	private Title title;
	
	@Element(name = "SourceCode", required = false)
	private SourceCode sourceCode;
	
	public AbstractOccurence() {
		this(null, null, null, null);
	}
	
	public AbstractOccurence(String uid, Symbol symbol, Title title, SourceCode sourceCode) {
		this.uid = uid;
		this.symbol = symbol;
		this.title = title;
		this.sourceCode = sourceCode;
	}
	
	public String getUId() {
		return uid;
	}
	
	public AbstractValueBasedOnLanguage getSymbol() {
		return symbol;
	}
	
	public AbstractValueBasedOnLanguage getTitle() {
		return title;
	}

	public SourceCode getSourceCode() {
		return sourceCode;
	}
}