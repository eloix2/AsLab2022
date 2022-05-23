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
public class TestProgressive {
  /** Fixture for pay station testing. */
	RateStrategy strat;
  @Before
  public void setUp() {
	strat = new ProgressiveRateStrategy();
  }

  @Test
  public void shouldDisplay125MinFor375Cents(){
    assertEquals( "Should display 125 min for 375 cents", 
                125, strat.calculaTime(375) ); 
  }
 
  @Test
  public void shouldDisplay63MinFor160Cents() {
    assertEquals( "Should display 63 min for 160 cents", 
                63, strat.calculaTime(160) ); 
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




}
