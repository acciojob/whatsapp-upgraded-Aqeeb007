package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WhatsappService {

    @Autowired
    WhatsappRepository whatsappRepository;

    public String createUser(String name, String mobile){
        if(whatsappRepository.userHashMap.containsValue(mobile)){
            throw new RuntimeException("User already exists");
        }
        User user = new User(name,mobile);
        whatsappRepository.userHashMap.put(name,user);
        return "SUCCESS";
    }


    public Group createGroup(List<User> users) {
        Group group;
        if (users.size() == 2){

            User admin = users.get(0);
            group = new Group(admin.getName(), 2);
            whatsappRepository.groupHashMap.put(admin.getName(),group);

        }else{

            User admin = users.get(0);
            int size = whatsappRepository.groupHashMap.size();

            String groupName = "Group" + size+1;
            group = new Group(groupName, users.size()+1);
            whatsappRepository.groupHashMap.put(groupName,group);
            group = new Group(admin.getName(), users.size()+1);
        }
        return group;
    }


    public int createMessage(String content) {
        return 0;
    }

    public int sendMessage(Message message, User sender, Group group) {
        return 0;
    }

    public String changeAdmin(User approver, User user, Group group) {
        return "empty";
    }

    public int removeUser(User user) {
        return 0;
    }

    public String findMessage(Date start, Date end, int k) {
        return "empty";
    }
}
