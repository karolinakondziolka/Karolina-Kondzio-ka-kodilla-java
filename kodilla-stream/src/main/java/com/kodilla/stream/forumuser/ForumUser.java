package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int id;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numbersOfPosts;

    public ForumUser(final int id, final String userName, final char sex, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, final int numbersOfPosts) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numbersOfPosts = numbersOfPosts;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumbersOfPosts() {
        return numbersOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numbersOfPosts=" + numbersOfPosts +
                '}';
    }
}
