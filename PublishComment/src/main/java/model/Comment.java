package model;

public class Comment {
    private String author;
    private String text;

    public Comment(String text, String author) {
        this.author = author;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }
}
