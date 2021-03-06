package com.cobo.dt.model.impl;

import org.simpleframework.xml.Attribute;

import com.cobo.dt.model.AbstractRulePartDefinition;
import com.cobo.dt.model.IConditionDefinition;

public class ConditionDefinition extends AbstractRulePartDefinition implements IConditionDefinition {
	public ConditionDefinition(@Attribute(name = "id")String id, @Attribute(name = "title")String initialText) {
		super(id, initialText);
	}
	
	@Override
	protected void initValueSet() {
		getValueSet().addValue(IConditionDefinition.DEFAULT_VALUE_CONDITION_YES);
		getValueSet().addValue(IConditionDefinition.DEFAULT_VALUE_CONDITION_NO);
	}
}
