package com.rjh.controller;

import com.rjh.dto.User;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Restful的API示例
 * @author RJH
 * <br/>Created in 2019-05-07
 */
@RestController
@RequestMapping("users")
public class UserController {
    /**
     * 模拟存储的用户数据
     */
    private Map<Long,User> users=new ConcurrentHashMap<>();
    /**
     * 模拟自增ID
     */
    private AtomicLong currentId=new AtomicLong(1);

    @GetMapping
    public Collection<User> listAll(){
        return users.values();
    }

    @GetMapping("{id}")
    public User getUserById(@PathVariable("id") Long id){
        return users.get(id);
    }

    @PostMapping
    public User addUser(@RequestBody User user){
        user.setId(currentId.getAndIncrement());
        users.put(user.getId(),user);
        return user;
    }

    @PutMapping("{id}")
    public User updateUser(@PathVariable("id") Long id,@RequestBody User user){
        if(users.containsKey(id)){
            user.setId(id);
            users.put(id,user);
            return user;
        }else{
            return null;
        }
    }

    @DeleteMapping("{id}")
    public User deleteUserById(@PathVariable("id") Long id){
        if(users.containsKey(id)){
            return users.remove(id);
        }else{
            return null;
        }
    }
    
}
