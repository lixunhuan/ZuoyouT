package zuoyou.jenkins.test.task;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import zuoyou.jenkins.test.Jenkins;

@SuppressWarnings({ "deprecation", "unused" })
public class JenkinsTest {

	@Test
	public void test() {
	new Jenkins().speak();
	Assert.assertTrue(Math.random()>0.3);
	}

}
