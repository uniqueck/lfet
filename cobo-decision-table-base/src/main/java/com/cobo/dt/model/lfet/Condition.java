package com.cobo.dt.model.lfet;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class Condition extends AbstractRulePart<ConditionOccurence> {

	public Condition() {
		this(null, null, null, null, null);
	}

	public Condition(@Attribute(name = "uId", required = true) String uid, @Element(name = "Title") Title title,
			@Element(name = "Text", required = false) Text text,
			@Path(value = "ConditionOccurrences") @ElementList(required = false, inline = true, entry = "ConditionOccurrence") List<ConditionOccurence> occurences,
			@ElementList(required = false, entry = "SourceCode", inline = true) List<SourceCode> sourceCodes) {
		super(uid, title, text, occurences, sourceCodes);
	}

	@Path(value = "ConditionOccurrences")
	@ElementList(entry = "ConditionOccurrence", required = false, inline = true)
	@Override
	public List<ConditionOccurence> getOccurences() {
		return super.getOccurences();
	}

}
