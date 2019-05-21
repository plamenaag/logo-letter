package com.logo.letter;

import java.util.ArrayList;
import java.util.List;

public class LogoLetterP extends LogoLetter {

    public LogoLetterP(Integer letterSize, Character fillerChar, Character emptySpaceChar) {
        super(letterSize, fillerChar, emptySpaceChar);
    }

    public LogoLetterP(Integer letterSize) {
        super(letterSize);
    }

    @Override
    protected List<String> createLogoLetter() {
        List<String> lines = new ArrayList<>();
        
        Integer partOneLineCount = (this.getLetterSize()+1)/4; 
        Integer partTwoAndThreeLineCount = (this.getLetterSize() + 1)/2 - partOneLineCount; 
        
        lines.addAll(this.partOne(partOneLineCount,this.getLetterSize()));
        lines.addAll(this.partTwo(partTwoAndThreeLineCount,this.getLetterSize()));
        lines.addAll(this.partOne(partOneLineCount,this.getLetterSize()));
        lines.addAll(this.partThree(partTwoAndThreeLineCount,this.getLetterSize()));
        return lines;

    }

    private List<String> partOne(Integer lineCount,Integer letterSize) {
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < lineCount; i++) {
            lines.add(addCharacters(letterSize * 3, '*'));
        }
        return lines;
    }

    private List<String> partTwo(Integer lineCount,Integer letterSize) {
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < lineCount; i++) {
            lines.add(addCharacters(letterSize, '*')
                    + addCharacters(letterSize, '-')
                    + addCharacters(letterSize, '*'));
        }
        return lines;
    }

    private List<String> partThree(Integer lineCount,Integer letterSize) {
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < lineCount; i++) {
            lines.add(addCharacters(letterSize, '*')
                    + addCharacters(letterSize, '-')
                    + addCharacters(letterSize, '-'));
        }
        return lines;
    }
}
