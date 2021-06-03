package org.stepDefinition;

import org.resources.Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Utility {

	@Before
	public void beforeScenario() {
	launchChrome();
	}
	@After
	public void afterScenario() {
		kill();
	}
}
