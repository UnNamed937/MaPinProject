package myapplication.example.mapinproject.data.entities;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {
    private String username;
    private String comment;
    private String userUID;

    public User() {
    }
    public User(String _username, String _comment,String _userUID) {
        this.username = _username;
        this.comment = _comment;
        this.userUID = _userUID;
    }
    @Override
    public String toString() {
        return "user{" +
                "username='" + username + '\'' +
                ", comment='" + comment + '\'' +
                ", userUID='" + userUID + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public String getComment() {
        return comment;
    }
    public String getUserUID() {
        return userUID;
    }
}

