package com.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Position)实体类
 *
 * @author makejava
 * @since 2020-05-15 16:53:56
 */

@Data
public class Position implements Serializable {

    private static final long serialVersionUID = 671314384813094235L;
    
    private Integer id;
    
    private String posiname;
    
    private String posidetail;
}