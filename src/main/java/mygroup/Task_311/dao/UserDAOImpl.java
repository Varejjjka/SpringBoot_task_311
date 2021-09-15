package mygroup.Task_311.dao;

import mygroup.Task_311.model.User;
import org.springframework.stereotype.Component;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Component
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> allUsers() {
        return entityManager
                .createQuery("from User")
                .getResultList();
    }

    public void add(User user) {
        entityManager.persist(user);
    }

    public void delete(User user) {
        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
    }

    public void edit(User user) {
        entityManager.merge(user);
    }

    public User getById(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public User findByUsername(String username) {
        return (User) entityManager
                .createQuery("from User where username = :username")
                .setParameter("username", username)
                .getSingleResult();
//        return entityManager.find(User.class, username);
    }
}