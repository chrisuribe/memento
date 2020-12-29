package com.chrisuribe.memento;

import java.util.Stack;

public class EditorState {

    private final String content;
    private int fontSize;
    private String fontName;

    public EditorState(String content) {
        this.content = content;
    }

    public EditorState(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public int getFontSize() {
        return fontSize;
    }

    public String getFontName() {
        return fontName;
    }
}
