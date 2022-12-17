package com.teamproject.user;

public interface IUserService
{
    public int insertUser(UserVO vo);
    public int updateUser(UserVO vo);
    public int deleteUser(int id);
    public UserVO getUser(UserVO vo);
}
