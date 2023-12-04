package com.kotenko.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

public class Ex13DataStructures {
    public static void main(String[] args) {
        System.out.println(numberOfOccurrences(new String[]{"1", "1", "1", "1", "3", "4", "5", "6", "7", "7", "7", "8", "8"}));
        System.out.println(mostNumberOfOccurrences(new String[]{"1", "1", "1", "1", "3", "4", "5", "6", "7", "7", "7", "8", "8"}));
    }

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static Map<String, Integer> mostNumberOfOccurrences(String[] input) {
        Map<String, Integer> occurrences = numberOfOccurrences(input);
        int max = occurrences.values().stream().max(Integer::compareTo).orElse(0);
        return occurrences.entrySet().stream()
                .filter(it -> it.getValue().equals(max))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private static Map<String, Integer> numberOfOccurrences(String[] input) {
        Map<String, Integer> result = new HashMap<>();
        for (String s : input) {
            result.merge(s, 1, Integer::sum);
        }
        return result;
    }
}
