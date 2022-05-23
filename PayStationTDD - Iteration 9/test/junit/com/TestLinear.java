package junit.com;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLinear {
	/** Fixture for pay station testing. */
	RateStrategy strat;
  @Before
  public void setUp() {
	strat = new LinearRateStrategy();
  }
	  /**
	   * Entering 5 cents should make the display report 2 minutes 
	   * parking time.
	  */
	  @Test
	  public void shouldDisplay2MinFor5Cents() {
	    assertEquals( "Should display 2 min for 5 cents", 
	                  5 / 5 * 2, strat.calculaTime(5) ); 
	  }
	  @Test
	  public void shouldDisplay150MinFor375Cents(){
		  assertEquals( "Should display 150 min for 375 cents", 
                  375 / 5 * 2, strat.calculaTime(375) ); 
	  }
	 
	  @Test
	  public void shouldDisplay63MinFor160Cents() {
	    assertEquals( "Should display 64 min for 160 cents", 
	                160/5 * 2, strat.calculaTime(160) ); 
	  }

}
