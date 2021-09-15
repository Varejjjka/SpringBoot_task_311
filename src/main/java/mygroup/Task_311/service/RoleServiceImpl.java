package mygroup.Task_311.service;


import mygroup.Task_311.dao.RoleDAO;
import mygroup.Task_311.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleDAO roleDAO;

    @Autowired
    public void setUserDAO(RoleDAO roleDAO){
        this.roleDAO = roleDAO;
    }

    public List<Role> listRoles(){
        return roleDAO.listRoles();
    }

    @Transactional
    public void add(Role role){
        roleDAO.add(role);
    }

    @Transactional
    public void delete(Role role){
        roleDAO.delete(role);
    }

    @Transactional
    public void edit(Role role){
        roleDAO.edit(role);
    }

    @Transactional
    public Role getById(long id){
        return roleDAO.getById(id);
    }

    @Transactional
    public Role findRoleByName(String role){
        return roleDAO.findRoleByName(role);
    }
}