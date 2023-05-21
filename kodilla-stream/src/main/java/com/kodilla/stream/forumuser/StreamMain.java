package com.kodilla.stream.forumuser;


import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> forumUserMap = forum.getForumUser().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getDate(), LocalDate.now()).getYears() >= 20)
                .filter(forumUser -> forumUser.getPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println("Elements: " + forumUserMap.size());
        forumUserMap.entrySet().stream()
                .map(entry -> entry.getKey() +" "+ entry.getValue())
                .forEach(System.out::println);
    }
}
