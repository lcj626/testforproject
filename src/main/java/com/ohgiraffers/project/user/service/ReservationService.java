package com.ohgiraffers.project.user.service;

import com.ohgiraffers.project.user.dto.ReservationDTO;
import com.ohgiraffers.project.user.dto.UserDTO;
import com.ohgiraffers.project.user.model.ReservationMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ReservationService {

    private ReservationMapper reservationMapper;

    public ReservationService(ReservationMapper reservationMapper) {
        this.reservationMapper = reservationMapper;
    }

    public ReservationDTO searchReservation(int code){
        ReservationDTO reservation = reservationMapper.searchReservation(code);

        if(Objects.isNull(reservation)){
            throw new NullPointerException();
        }else {
            return reservation;
        }
    }
}
