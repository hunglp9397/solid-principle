package com.hunglp.single_responsibility.bad;

import lombok.Data;


// 1 Class có quá nhiều nhiệm vụ/chức năng
@Data
public class TextManipulator_Bad {

    private String text;

    public void appendText(String newText) {
        text = text.concat(newText);
    }

    public String findWordAndReplace(String word, String replacementWord) {
        if (text.contains(word)) {
            text = text.replace(word, replacementWord);
        }
        return text;
    }

    public String findWordAndDelete(String word) {
        if (text.contains(word)) {
            text = text.replace(word, "");
        }
        return text;
    }

    public void printText() {
        System.out.println(getText());
    }
}
