package com.chrisuribe.memento;

public class Document {

    private String content;
    private String fontName;
    private int fontSize;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }

    public EditorState createState() {
        return new EditorState(content, fontName, fontSize);
    }

    public void restore(EditorState state) {
        this.content = state.getContent();
        this.fontSize = state.getFontSize();
        this.fontName = state.getFontName();
    }
}
