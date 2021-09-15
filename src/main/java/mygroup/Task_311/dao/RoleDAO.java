package mygroup.Task_311.dao;

import mygroup.Task_311.model.Role;

import java.util.List;

public interface RoleDAO {

    List<Role> listRoles();

    void add(Role role);

    void delete(Role role);

    void edit(Role role);

    Role getById(long id);

    Role findRoleByName(String role);

}