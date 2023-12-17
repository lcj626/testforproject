package com.ohgiraffers.project.user.model;

import com.ohgiraffers.project.user.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    List<UserDTO> selectAllUsers();

    int registUser(UserDTO userDTO);


    UserDTO searchUser(int code);

    void updatePassword(@Param("code") int code, @Param("currentPassword") String currentPassword, @Param("newPassword") String newPassword);

    int updateNickname(UserDTO userDTO);

    int updatePhone(UserDTO userDTO);

    int updateProfileImage(UserDTO userDTO);
}
