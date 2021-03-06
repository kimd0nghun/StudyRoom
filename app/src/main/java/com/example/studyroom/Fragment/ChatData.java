package com.example.studyroom.Fragment;

import java.text.SimpleDateFormat;

class ChatData {

    private String nickname;
    private String content;
    private String time;
    private String chat_time;
    private String read_status;
    public ChatData(String nickname, String content, String time, String chat_time, String read_status) {
        this.nickname = nickname;
        this.content = content;
        this.time = time;
        this.chat_time = chat_time;
        this.read_status = read_status;
    }

    public ChatData(String nickname, String content, String chat_time, String  read_status){
        this.nickname = nickname;
        this.content = content;
        this.chat_time = chat_time;
        this.read_status = read_status;
    }
    public String getChat_time() {
        return chat_time;
    }

    public void setChat_time(String chat_time) {
        this.chat_time = chat_time;
    }

    public ChatData() {

    }

    public String getRead_status() {
        return read_status;
    }

    public void setRead_status(String  read_status) {
        this.read_status = read_status;
    }

    public String getNickname() {
        return nickname;
    }

    public String getContent() {
        return content;
    }

    public String getTime() {
        return time;
    }


    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

