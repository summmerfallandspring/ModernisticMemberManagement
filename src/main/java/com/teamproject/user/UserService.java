package com.teamproject.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService
{
    @Autowired
    UserDAO userDAO;

    @Override
    public int insertUser(UserVO vo) { return userDAO.insertUser(vo); }

    @Override
    public int updateUser(UserVO vo) { return userDAO.updateUser(vo); }

    @Override
    public int deleteUser(int id) { return userDAO.deleteUser(id); }

    @Override
    public UserVO getUser(UserVO vo)
    {
        return userDAO.getUser(vo);
    }
}