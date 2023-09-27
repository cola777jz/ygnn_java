package ygnn.cola.study.day19;

import java.util.Arrays;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Cola0817
 * @name RegexDomain
 * @date 2023/9/25 23:25
 * @since 1.0.0
 */
public class RegexDomain {
    public static void main(String[] args) {
        String regex = "\\d+";
        String text = "asb123dfa456";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(text);

        List<Integer> list = matcher.results().map(MatchResult::group).map(Integer::parseInt).toList();
        System.out.println("list = " + list);
        String[] split = text.split("[a-z]+");
        System.out.println("split = " + Arrays.toString(split));
    }
}
