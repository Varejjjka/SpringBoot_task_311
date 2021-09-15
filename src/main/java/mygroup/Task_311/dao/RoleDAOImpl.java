package mygroup.Task_311.dao;

import mygroup.Task_311.model.Role;
import org.springframework.stereotype.Component;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class RoleDAOImpl implements RoleDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Role> listRoles() {
        return entityManager
                .createQuery("from Role")
                .getResultList();
    }

    public void add(Role role) {
        entityManager.persist(role);
    }

    public void delete(Role role) {
        entityManager.remove(entityManager.contains(role) ? role : entityManager.merge(role));
    }

    public void edit(Role role) {
        entityManager.merge(role);
    }

    public Role getById(long id) {
        return entityManager.find(Role.class, id);
    }

    public Role findRoleByName(String role) {
        return (Role) entityManager
                .createQuery("select r from Role r where lower(r.role) like :role")
                .setParameter("role", "%" + role.toLowerCase() + "%")
                .getSingleResult();
    }
}