package com.ted.web.item;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class Item {
	private String itemid, itemName, takenDate, 
				category, takenPostion;
}
