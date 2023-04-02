package com.ananth.designpatterns.solid.interface_segregation_principle.without_isp;

import java.util.HashMap;
import java.util.List;

public class UserRepository implements IRepository<User> {

    private static final HashMap<Long, User> users = new HashMap<>();

    @Override
    public void save(User entity) {
        synchronized (users) {
            users.put(entity.getId(), entity);
        }
    }

    @Override
    public void delete(User entity) {
        synchronized (users) {
            users.remove(entity.getId());
        }
    }

    @Override
    public User findById(Long id) {
        synchronized (users) {
            return users.get(id);
        }
    }

    @Override
    public List<User> findByName(String name) {
        synchronized (users) {
            return null;
        }
    }
}
