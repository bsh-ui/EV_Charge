package com.boot.service;

import java.util.ArrayList;

import com.boot.dto.EreaDTO;

public interface EreaService {
	public ArrayList<EreaDTO> select_erea_province();

	public ArrayList<EreaDTO> select_erea_city();
}