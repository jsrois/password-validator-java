package org.tdd;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class PasswordTest {

	@Test
	public void is_valid_if_follows_all_requirements() {
		assertThat((new Password("Abc12_")).valid()).isTrue();
	}

	@Test
	public void must_have_at_least_8_characters() throws Exception {
		assertThat((new Password("Ab12_")).valid()).isFalse();
	}
}
