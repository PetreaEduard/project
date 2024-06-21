package com.example.project.Service;


import com.example.project.DAO.UserDao;
import com.example.project.Entity.Users;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;
@Transactional
@ApplicationScoped
public class UserService {

    @PersistenceContext
    private EntityManager em;

    public UserService() {}

    public void save(Users user) {
        em.persist(user);
    }

    public Users find(Long id) {
        return em.find(Users.class, id);
    }

    public List<Users> findAll() {
        return em.createQuery("SELECT u FROM users u", Users.class).getResultList();
    }
}