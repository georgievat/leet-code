package com.leetcode;

public class GoalParserInterpretation {
    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if(command.charAt(i) == 'G') {
                sb.append("G");
            } else if(command.charAt(i) == '(') {
                if(command.charAt(i + 1) == ')') {
                    sb.append("o");
                } else {
                    sb.append("al");
                }
            }
        }
        System.out.println(sb);
        return sb.toString();

    }
    public static void main(String[] args) {
        String command = "G()(al)";
        String command1 = "G()()()()(al)";
        String command2 = "(al)G(al)()()G";
        String command3 = "(al)G(al)()()G";

        interpret(command);
        interpret(command1);
        interpret(command2);
        interpret(command3);

    }
}
