package com.ohgiraffers.project.user.controller;


import com.ohgiraffers.project.user.dto.UserDTO;
import com.ohgiraffers.project.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ModelAndView selectAllUsers(ModelAndView mv){

        List<UserDTO> users = userService.selectAllUsers();

        if(Objects.isNull(users)){
            System.out.println("exception 이다 ");
        }
        mv.addObject("users", users);
        mv.setViewName("user/allUsers");

        return mv;

    }


    @GetMapping("/regist_user")
    public String registUser(){
        return "user/userRegist";
    }

    @PostMapping("/regist")
    public String registUserPage(UserDTO userDTO){
        userService.registUser(userDTO);

        return "redirect:/users";
    }

    @GetMapping("/search")
    public ModelAndView searchUser(ModelAndView mv, @RequestParam int code){

        if(code == 0){
            System.out.println("회원 번호는 0일 수 없습니다.");
            mv.addObject("message", "회원 번호는 0이 될 수 없습니다.");
            mv.setViewName("error/errorPage");
            return mv;
        }

        UserDTO user = userService.searchUser(code);

        if(Objects.isNull(user)){
            throw new NullPointerException();
        }else{
            mv.addObject("user", user);
            mv.setViewName("user/userSearch");
            return mv;

        }
    }


//    @GetMapping("/update_user")
//    public String updateUserView(){
//        return "user/userUpdate";
//    }
//
//    @PostMapping("/update")
//    public String updateUser(UserDTO userDTO){
//        userService.updateUser(userDTO);
//
//        return "redirect:/users";
//    }

    @GetMapping("/update_user")
    public String passwordChangeView() {
        return "user/userUpdate";
    }

    @PostMapping("/update")
    public String changePassword(@RequestParam int code,
                                 @RequestParam String currentPassword,
                                 @RequestParam String newPassword,
                                 @RequestParam String confirmPassword,
                                 Model model) {
        boolean success = userService.changePassword(code, currentPassword, newPassword, confirmPassword);

        if (success) {
            return "redirect:/users";
        } else {
            model.addAttribute("error", "비밀번호 변경 실패.");
            return "user/userUpdate";
        }
    }

    @GetMapping("/update_nickname")
    public String updateNicknameView(){
        return "user/userUpdateNickname";
    }

    @PostMapping("/updateNickname")
    public String updateNickname(UserDTO userDTO){
        userService.updateNickname(userDTO);

        return "redirect:/users";
    }

    @GetMapping("/update_phone")
    public String updatePhoneView(){
        return "user/userUpdatePhone";
    }

    @PostMapping("/updatePhone")
    public String updatePhone(UserDTO userDTO){
        userService.updatePhone(userDTO);

        return "redirect:/users";
    }

    @GetMapping("/update_profileImage")
    public String updateProfileView(){
        return "user/userUpdateProfile";
    }

    @PostMapping("/updateProfile")
    public String updateProfileImage(UserDTO userDTO){
        userService.updateProfileImage(userDTO);

        return "redirect:/users";
    }


}
