import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

//learn about mockito and how it works

@RunWith(MockitoJUnitRunner.class)
public class MockCalculatorTest {

    @Spy
    private Calculator calculator;
    @Test
    public void mockCalculateTest () {
        when(calculator.add(5,3)).thenReturn(123);
        int result = calculator.add(5,3);
        assert result == 123;
    }
}
