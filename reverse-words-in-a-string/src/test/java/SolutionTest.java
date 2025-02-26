import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.techideas.leetcode.reversewords.Solution;

public class SolutionTest {

    @Test
    void example_1() {
        //given
        var s = "the sky is blue";
        var solution = new Solution();

        //when
        var result = solution.reverseWords(s);

        //then
        Assertions.assertEquals("blue is sky the", result);
    }

    @Test
    void example_2() {
        //given
        var s = "  hello world  ";
        var solution = new Solution();

        //when
        var result = solution.reverseWords(s);

        //then
        Assertions.assertEquals("world hello", result);
    }

    @Test
    void example_3() {
        //given
        var s = "a good   example";
        var solution = new Solution();

        //when
        var result = solution.reverseWords(s);

        //then
        Assertions.assertEquals("example good a", result);
    }
}