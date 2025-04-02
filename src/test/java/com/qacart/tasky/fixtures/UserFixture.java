package com.qacart.tasky.fixtures;

import com.qacart.tasky.model.User;

public class UserFixture {

    public static User getSubscribedUser() {
        return User.
                builder()
                .setEmail("test_1234_automation@email.com")
                .setPassword("test12")
                .build();
    }
}