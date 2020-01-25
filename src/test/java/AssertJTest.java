import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class AssertJTest {

//learn about Test with AssertJ
    @Test
    public void testAssertJ() {
        String text = "abc";

        assertThat(text).isEqualTo("abc").contains("a");

        String[] stringArray = {"abc", "cde", "efg"};

        assertThat(stringArray)
                .hasSize(3)
                .contains("cde")
                .doesNotContain("xyz");
    }

    @Test
    public void testAssertJ2() {
        String text = "abcdef";

        assertThat(text).isEqualTo("abcdef").contains("d");

        String[] stringArray = {"abcde", "cdefg", "vbner","wedsfr","234566"};

        assertThat(stringArray)
                .hasSize(5)
                .contains("234566")
                .doesNotContain("wedsf3");
    }
}
