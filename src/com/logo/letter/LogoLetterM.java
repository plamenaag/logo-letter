package com.logo.letter;

import java.util.ArrayList;
import java.util.List;

public class LogoLetterM extends LogoLetter {

    public LogoLetterM(Integer letterSize, Character fillerChar, Character emptySpaceChar) {
        super(letterSize, fillerChar, emptySpaceChar);
    }

    public LogoLetterM(Integer letterSize) {
        super(letterSize);
    }

    @Override
    protected List<String> createLogoLetter() {
        List<String> lines = new ArrayList<>();
        lines.addAll(this.upperPart(this.getLetterSize()));
        lines.addAll(this.lowerPart(this.getLetterSize()));
        return lines;

    }

    private List<String> upperPart(Integer letterSize) {
        Integer col1 = letterSize;
        Integer col2 = letterSize;
        Integer col3 = letterSize;
        Integer col4 = letterSize;
        Integer col5 = letterSize;

        List<String> lines = new ArrayList<>();
        do {
            lines.add(addCharacters(col1, '-') + addCharacters(col2, '*')
                    + addCharacters(col3, '-') + addCharacters(col4, '*')
                    + addCharacters(col5, '-'));
            col1 -= 1;
            col2 += 2;
            col3 -= 2;
            col4 += 2;
            col5 -= 1;

        } while (col2 < (letterSize * 2));
        return lines;
    }

    private List<String> lowerPart(Integer letterSize) {
        Integer col1 = letterSize / 2;
        Integer col2 = letterSize;
        Integer col3 = 1;
        Integer col4 = (letterSize * 2) - 1;
        Integer col5 = 1;
        Integer col6 = letterSize;
        Integer col7 = letterSize / 2;

        List<String> lines = new ArrayList<>();
        do {
            lines.add(addCharacters(col1, '-') + addCharacters(col2, '*')
                    + addCharacters(col3, '-') + addCharacters(col4, '*')
                    + addCharacters(col5, '-') + addCharacters(col6, '*')
                    + addCharacters(col7, '-'));
            col1 -= 1;
            col3 += 2;
            col4 -= 2;
            col5 += 2;
            col7 -= 1;

        } while (col4 >= letterSize);
        return lines;
    }
}
