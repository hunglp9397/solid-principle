package com.hunglp.single_responsibility.good;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

// 1 Class riêng để update Text
public class TextUpdater {
    private TextManipulator textManipulator;

    private String getText() {
        return textManipulator.getText();
    }

    public void appendText(String newText) {
        textManipulator.setText(getText().concat(newText));
    }

    public String findWordAndReplace(String word, String replacementWord) {
        if (getText().contains(word)) {
            textManipulator.setText(getText().replace(word, replacementWord));
        }
        return getText();
    }

    public String findWordAndDelete(String word) {
        if (getText().contains(word)) {
            textManipulator.setText(getText().replace(word, ""));
        }
        return getText();
    }

}
