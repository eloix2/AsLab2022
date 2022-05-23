package junit.com;

import org.junit.*;
import static org.junit.Assert.*;

/** Test cases for the Pay Station system.
 
   This source code is from the book 
     "Flexible, Reliable Software:
       Using Patterns and Agile Development"
     published 2010 by CRC Press.
   Author: 
     Henrik B Christensen 
     Department of Computer Science
     Aarhus University
   
   Please visit http://www.baerbak.com/ for further information.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
 
       http://www.apache.org/licenses/LICENSE-2.0
 
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

*/
public class TestIntegration {
  PayStation ps;
  RateStrategy strat;
  /** Fixture for pay station testing. */
 
  /**
   * Entering 5 cents should make the display report 2 minutes 
   * parking time.
  */
  @Test
  public void shouldDisplay5MinFor5CentsL() throws IllegalCoinException {
	strat = new LinearRateStrategy();
	ps = new PayStationImpl(strat);
    ps.addPayment( 5 );
    assertEquals( "Should display 2 min for 5 cents", 
                  5/5 * 2, ps.readDisplay() ); 
  }

  @Test
  public void shouldDisplay5MinFor5CentsP() throws IllegalCoinException {
	strat = new ProgressiveRateStrategy();
	ps = new PayStationImpl(strat);
    ps.addPayment( 5 );
    assertEquals( "Should display 2 min for 5 cents", 
                  5/5 * 2, ps.readDisplay() ); 
  }


  /**
   * Entering 25 cents should make the display report 10 minutes
   * parking time.
  */
  @Test
  public void shouldDisplay25MinFor25CentsL() throws IllegalCoinException {
	strat = new LinearRateStrategy();
	ps = new PayStationImpl(strat);
	ps.addPayment( 25 );
    assertEquals( "Should display 10 min for 25 cents", 
                  25/5 * 2, ps.readDisplay() );
    // 25 cent in 5 cent coins each giving 2 minutes parking
  }

  @Test
  public void shouldDisplay25MinFor25CentsP() throws IllegalCoinException {
	strat = new ProgressiveRateStrategy();
	ps = new PayStationImpl(strat);
	ps.addPayment( 25 );
    assertEquals( "Should display 10 min for 25 cents", 
                  25/5 * 2, ps.readDisplay() );
    // 25 cent in 5 cent coins each giving 2 minutes parking
  }
}