import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculatorTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private Calculator calculator;

    @BeforeClass
    public static void sendMessage () {
        System.out.println("Salut");
    }

    @Before
    public  void init () {
        calculator = new Calculator();
    }

    @Parameterized.Parameters
    public static Collection<Integer[]> parameters() {
        return Arrays.asList(new Integer[][] {
                {1, 1, 2},
                {2, 4, 6},
                {1, 6, 7},
                {4, 1, 5}
        });
    }

    @Parameterized.Parameter(0)
    public int x;
    @Parameterized.Parameter(1)
    public int y;
    @Parameterized.Parameter(2)
    public int expectedResult;

    @Test
    public void addTest () {
        //given
        //when
        int sum = calculator.add(x,y);
        System.out.println("sum = " + sum);
        //then
        assert sum == expectedResult;
    }
    @Test
    public void diffTest () {
        int diff = calculator.diff(10,5);
        System.out.println("diff = " + diff);
        assert  diff ==5;
    }

    @Test
    public void clockTestMorning () {
        //given
        //when
        String clock = calculator.clock(11);
        System.out.println(clock);
        //then
        assert clock.equals(" Good Morning ");
    }
    @Test
    public void clockTestEvening () {
        String clock = calculator.clock(18);
        System.out.println(clock);
        assert  clock.equals(" Good Evening ");
    }
    @Test(expected = ArithmeticException.class)
    public void testDivideBy0 () {
        int result = calculator.divide(10,0);
        System.out.println(result);
    }
    @Test
    public void testDivide () {
        int result = calculator.divide(10,2);
        System.out.println(result);
        assert result == 5;
    }
    @Test
    public void testMultiply () {
        int result = calculator.multiply(10,5);
        assert result == 50;
    }
    @Test
    public void testDivideBy0WithMessage (){
        //given
        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("/ by zero");
        //when
        calculator.divide(4,0);
    }
}
