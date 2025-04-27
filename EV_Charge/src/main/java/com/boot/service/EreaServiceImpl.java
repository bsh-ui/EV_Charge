package com.boot.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.EreaDAO;
import com.boot.dto.EreaDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("EreaService")
public class EreaServiceImpl implements EreaService {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public ArrayList<EreaDTO> select_erea_province() {
		EreaDAO dao = sqlSession.getMapper(EreaDAO.class);
		ArrayList<EreaDTO> erea_province_list = dao.select_erea_province();
		return erea_province_list;
	}

	@Override
	public ArrayList<EreaDTO> select_erea_city() {
		// TODO Auto-generated method stub
		return null;
	}
}