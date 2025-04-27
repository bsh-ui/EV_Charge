package com.boot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EreaDTO {
	private int erea_no;
	private String erea_province;
	private String erea_city;
}