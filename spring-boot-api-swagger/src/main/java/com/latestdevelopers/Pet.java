package com.latestdevelopers;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "burası bir pet modeldir",description = "pet entity description")
public class Pet {

    @ApiModelProperty(value = "pet id")
    private int id;
    @ApiModelProperty(value = "pet adı")
    private String name;
    @ApiModelProperty(value = "pet doğum tarihi")
    private Date date;
}
