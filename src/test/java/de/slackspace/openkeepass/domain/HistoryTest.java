package de.slackspace.openkeepass.domain;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class HistoryTest {

	@Test
	public void equalsContract() {
		EqualsVerifier.forClass(History.class).verify();
	}
}
