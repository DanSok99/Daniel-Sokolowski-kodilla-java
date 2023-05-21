package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    public final List<ForumUser> forumUser = new ArrayList<>();
    public Forum(){
        forumUser.add(new ForumUser(1, "Daniel", 'M', LocalDate.of(2000,2,22),999));
        forumUser.add(new ForumUser(2, "Marek", 'M', LocalDate.of(1999,4,21),5));
        forumUser.add(new ForumUser(3, "Magda", 'F', LocalDate.of(2005,1,12),120));
        forumUser.add(new ForumUser(4, "Jagoda", 'F', LocalDate.of(2012,11,20),0));
        forumUser.add(new ForumUser(5, "Krystian", 'M', LocalDate.of(2001,12,5),2));
    }
    public List<ForumUser> getForumUser(){
        return new ArrayList<>(forumUser);
    }
}
