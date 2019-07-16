package com.pauloos.cardview;

public class Posts {

    private String title, post;
    private int image;

    public Posts(String title, String post, int image) {
        this.title = title;
        this.post = post;
        this.image = image;
    }

    public Posts(){ }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPost() {
        return post;
    }
    public void setPost(String post) {
        this.post = post;
    }
    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }
}
