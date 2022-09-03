package com.instamint.projecta.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Asset extends BaseModel {

     // Auction
    private Boolean auction = false;
    private Float bestBid;
    private Float bestAsk;
    private String xref;


}
