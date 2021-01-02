package com.example.whatsapp_task;

public class ChatItem {
    private  String nanme;
    private String message;
    private  int image;
    public String getNanme() {
        return nanme;
    }

    public void setNanme(String nanme) {
        this.nanme = nanme;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public ChatItem(String nanme, String message, int image) {
        this.nanme = nanme;
        this.message = message;
        this.image = image;
    }


}
