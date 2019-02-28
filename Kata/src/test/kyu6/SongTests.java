package test.kyu6;

import static org.junit.Assert.*;
import main.kyu6.Dubstep;

import org.junit.Test;

public class SongTests {

	@Test
	public void Test1() {
		assertEquals("ABC", new Dubstep().SongDecoder("WUBWUBABCWUB"));
	}

	@Test
	public void Test2() {
		assertEquals("R L", new Dubstep().SongDecoder("RWUBWUBWUBLWUB"));
	}

}
