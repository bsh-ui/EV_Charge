package com.boot.dao;

import java.util.ArrayList;

import com.boot.dto.EreaDTO;

public interface EreaDAO {
	public ArrayList<EreaDTO> select_erea_province();

	public ArrayList<EreaDTO> select_erea_city(String param);

}