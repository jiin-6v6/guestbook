package com.jadecross.guestbook;

import static org.juniot.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PostTest {
	@Test
	void testSetName() {
		Post post = new Post("TESTER", "2022-04-12 01:01:48", "Happy Wedding");
		post.setName("DEVOPS");
		assertEquals("DEVOPS", post.getName());
	}
}
