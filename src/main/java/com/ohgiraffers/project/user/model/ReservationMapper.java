package com.ohgiraffers.project.user.model;

import com.ohgiraffers.project.user.dto.ReservationDTO;
import com.ohgiraffers.project.user.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ReservationMapper {

    ReservationDTO searchReservation(int code);
}
