package com.logo.letter;

import java.util.List;

public abstract class LogoLetter {

    private List<String> lines;
    private Character emptySpaceChar;
    private Character fillerChar;
    private Integer letterSize;

    protected LogoLetter(Integer letterSize, Character fillerChar, Character emptySpaceChar) {
        this.letterSize = letterSize;
        this.fillerChar = fillerChar;
        this.emptySpaceChar = emptySpaceChar;
        this.lines = this.createLogoLetter();
    }

    protected LogoLetter(Integer letterSize) {
        this(letterSize, '*', '-');
    }

    protected abstract List<String> createLogoLetter();

    public List<String> getLines() {
        return this.lines;
    }

    public Character getEmptySpaceChar() {
        return emptySpaceChar;
    }

    public Character getFillerChar() {
        return fillerChar;
    }

    public Integer getLetterSize() {
        return letterSize;
    }

    public static String addCharacters(Integer charCount, Character sign) {
        StringBuilder sb = new StringBuilder(charCount);
        for (int i = 0; i < charCount; i++) {
            sb.append(sign);
        }
        return sb.toString();
    }
}
