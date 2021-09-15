package mygroup.Task_311.service;

import mygroup.Task_311.model.Role;

import java.util.List;

public interface RoleService {

    List<Role> listRoles();

    void add(Role role);

    void delete(Role role);

    void edit(Role role);

    Role getById(long id);

    Role findRoleByName(String role);
    //User findByUsername(String username);
}