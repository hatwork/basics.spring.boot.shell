package com.hatim.basics.springboot.comp;

import org.jline.utils.AttributedString;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;

@Component
public class MyPromptProvider implements PromptProvider {

	@Override
	public AttributedString getPrompt() {
		// TODO Auto-generated method stub
		return new AttributedString("calc>");
	}	
	
}
