package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int id;
    private final String name;
    private final char sex;
    private final LocalDate date;
    private final int posts;

    public ForumUser(final int id, final String name, final char sex, final LocalDate date, final int posts){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.posts = posts;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public char getSex(){
        return sex;
    }
    public LocalDate getDate(){
        return date;
    }
    public int getPosts(){
        return posts;
    }
    @Override
    public String toString(){
        return "ForumUser{" +
                "ID='" + id + '\'' +
                ", Name='" + name + '\'' +
                ", Sex=" + sex + '\'' +
                ", Birthday date='" + date + '\'' +
                ", Posts='" + posts + '\'' +
                '}';
    }
}
