package com.driver;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class WhatsappRepository {

    HashMap<String,User> userHashMap = new HashMap<>();
    HashMap<String,Group> groupHashMap = new HashMap<>();
    HashMap<User,User> userUserHashMap = new HashMap<>();

}
