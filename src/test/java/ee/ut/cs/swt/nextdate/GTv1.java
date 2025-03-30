package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv1 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(2028, 2028, 2028);
	    String string0 = nextDate0.run(8, 31, 1811);
	    assertEquals("9/1/1811", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1842, 1842, 1842);
	    String string0 = nextDate0.run(2, 1842, 1842);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(2055, 2055, 2055);
	    String string0 = nextDate0.run(4, 31, 1801);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1842, 1842, 1842);
	    String string0 = nextDate0.run(5, 30, 1842);
	    assertEquals("5/31/1842", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(5950, 5950, 5950);
	    String string0 = nextDate0.run(2, 28, 1876);
	    assertEquals("3/1/1876", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(1801, 1801, 1801);
	    String string0 = nextDate0.run(6, 30, 1801);
	    assertEquals("7/1/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(5950, 5950, 5950);
	    String string0 = nextDate0.run(12, 12, 12);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(5950, 5950, 5950);
	    String string0 = nextDate0.run(12, (-5024), 1956);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(5950, 5950, 5950);
	    String string0 = nextDate0.run(0, 12, 1822);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(5950, 5950, 5950);
	    String string0 = nextDate0.run(12, 28, 1822);
	    assertEquals("12/29/1822", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(5994, 5994, 5994);
	    String string0 = nextDate0.run(11, 11, 1820);
	    assertEquals("11/12/1820", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(5950, 5950, 5950);
	    String string0 = nextDate0.run(31, 28, 1822);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 9, 9);
	    String string0 = nextDate0.run(9, 9, 1858);
	    assertEquals("9/10/1858", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(5994, 5994, 5994);
	    String string0 = nextDate0.run(10, 10, 5994);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(1842, 1842, 1842);
	    String string0 = nextDate0.run(2, 2, 1842);
	    assertEquals("2/3/1842", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(1842, 1842, 1842);
	    String string0 = nextDate0.run(7, 7, 1842);
	    assertEquals("7/7/1842", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(1805, 1805, 1805);
	    String string0 = nextDate0.run(2, 29, 1805);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(1801, 1801, 1801);
	    String string0 = nextDate0.run(2, 30, 1801);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(2021, 2021, 1);
	    String string0 = nextDate0.run(1, 1, 2021);
	    assertEquals("1/2/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(5994, 5994, 5994);
	    String string0 = nextDate0.run(10, 10, 1805);
	    assertEquals("10/11/1805", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(5984, 5984, 5984);
	    String string0 = nextDate0.run(3, 3, 1801);
	    assertEquals("3/4/1801", string0);
	}

}