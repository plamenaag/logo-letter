package com.logo.letter;

import java.util.ArrayList;
import java.util.List;

public class LogoPrinter {

    public static void printLogo(List<LogoLetter> logoLetters) {
        List<StringBuilder> lines = new ArrayList<>();
        for (LogoLetter logoLetter : logoLetters) {
            for (int i = 0; i < logoLetter.getLines().size(); i++) {
                if (lines.size() < i + 1) {
                    lines.add(new StringBuilder());
                }
                lines.get(i).append(logoLetter.getLines().get(i));
            }
        }

        for (StringBuilder sb : lines) {
            System.out.println(sb.toString());
        }
    }
}
