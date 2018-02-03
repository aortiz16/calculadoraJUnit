package calculadoraJUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ calculadoraTest.class, CalculadoraTestParametrizada.class })
public class PRUEBASTests {

}
