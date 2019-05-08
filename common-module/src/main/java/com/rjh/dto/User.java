package com.rjh.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author RJH
 * <br/>Created in 2019-05-07
 */
@Data
public class User implements Serializable {

    private Long id;

    private String name;
}
