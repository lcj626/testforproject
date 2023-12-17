package com.ohgiraffers.project.user.service;

import com.ohgiraffers.project.user.dto.UserDTO;
import com.ohgiraffers.project.user.model.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class UserService {

    private UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<UserDTO> selectAllUsers(){

        List<UserDTO> users = userMapper.selectAllUsers();

        if(Objects.isNull(users)){
            System.out.println("user가 없슴다");
        }
        return users;

    }



    public int registUser(UserDTO userDTO){

        int result = userMapper.registUser(userDTO);

        if(result <= 0){
            System.out.println("실패하였습니다.");
        }else{
            System.out.println("등록을 마쳤습니다.");
        }
        return result;
    }

    public UserDTO searchUser(int code){
        UserDTO user = userMapper.searchUser(code);

        if(Objects.isNull(user)){
            throw new NullPointerException();
        }else {
            return user;
        }
    }


//    public boolean updateUser(Long userNo, String currentPassword, String newPassword){
//
//        Map<String, Object> parameters = new HashMap<>();
//        parameters.put("userNo", userNo);
//        parameters.put("currentPassword", currentPassword);
//        parameters.put("newPassword", newPassword);
//
//        int result = userMapper.updateUser(parameters);
//
//        return result > 0;
//    }


    @Transactional
    public boolean changePassword(int code, String currentPassword, String newPassword, String confirmPassword) {
        // 사용자 정보 가져오기
        UserDTO user = userMapper.searchUser(code);

        if (user == null) {
            return false; // 사용자가 존재하지 않으면 변경 실패
        }

        if (!newPassword.equals(confirmPassword)) {
            return false; // 새 비밀번호와 확인 비밀번호가 일치하지 않으면 변경 실패
        }


        // 새로운 비밀번호를 사용자 정보에 업데이트
        userMapper.updatePassword(code, currentPassword, newPassword);

        return true; // 비밀번호 변경 성공
    }


    public int updateNickname(UserDTO userDTO){
        int result = userMapper.updateNickname(userDTO);

        if(result <= 0){
            System.out.println("수정에 실패하였습니다.");
        }else{
            System.out.println("수정이 완료되었습니다.");
        }
        return result;
    }

    public int updatePhone(UserDTO userDTO){
        int result = userMapper.updatePhone(userDTO);

        if(result <= 0){
            System.out.println("수정에 실패하였습니다.");
        }else{
            System.out.println("수정이 완료되었습니다.");
        }
        return result;
    }


    public int updateProfileImage(UserDTO userDTO){
        int result = userMapper.updateProfileImage(userDTO);

        if(result <= 0){
            System.out.println("수정에 실패하였습니다.");
        }else{
            System.out.println("수정이 완료되었습니다.");
        }
        return result;
    }



}
