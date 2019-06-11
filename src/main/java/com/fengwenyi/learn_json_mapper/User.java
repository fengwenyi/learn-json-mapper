package com.fengwenyi.learn_json_mapper;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author Erwin Feng
 * @since 2019-06-11 22:41
 */
@Data
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = -6238519594766210045L;

    private String name;

    private Integer age;
}
