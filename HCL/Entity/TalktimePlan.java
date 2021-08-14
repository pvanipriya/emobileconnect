package com.emobileconnect.entity;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TalktimePlan {
	

	private Integer talktimePlanId;
	private String  planDescription;
	private String  planType;
	private Integer validity;
	private String talktimeRange;
	private Double price;
	

}