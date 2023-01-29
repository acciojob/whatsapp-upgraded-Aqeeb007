package com.driver;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class WhatsappRepository {

    HashMap<String,User> userHashMap = new HashMap<>();
    HashMap<Group, List<User>> groupHashMap = new HashMap<>();
    HashMap<Integer,Message> messageHashMap = new HashMap<>();

    HashMap<Group,Integer> groupIntegerHashMap = new HashMap<>();



}
