package com.ohgiraffers.project.user.controller;

import com.ohgiraffers.project.user.dto.ReservationDTO;
import com.ohgiraffers.project.user.dto.UserDTO;
import com.ohgiraffers.project.user.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;


    @GetMapping("/searchRe")
    public ModelAndView searchReservation(ModelAndView mv, @RequestParam int code){

        if(code == 0){
            System.out.println("회원 번호는 0일 수 없습니다.");
            mv.addObject("message", "회원 번호는 0이 될 수 없습니다.");
            mv.setViewName("error/errorPage");
            return mv;
        }

        ReservationDTO reservation = reservationService.searchReservation(code);

        if(Objects.isNull(reservation)){
            throw new NullPointerException();
        }else{
            mv.addObject("reservation", reservation);
            mv.setViewName("reservation/reservSearch");
            return mv;

        }
    }
}
