package com.oracle.ohTravel.hotel.service;

import java.util.List;

import com.oracle.ohTravel.hotel.model.HotelDTO;
import com.oracle.ohTravel.hotel.model.RoomDTO;

public interface HotelService {

	List<HotelDTO> hotelList(HotelDTO hoteldto);

	HotelDTO getHotelDetail(HotelDTO hotelDTO);

	List<RoomDTO> getRoomList(RoomDTO roomDTO);

	List<RoomDTO> getRoomDetail(RoomDTO roomDTO);

}
