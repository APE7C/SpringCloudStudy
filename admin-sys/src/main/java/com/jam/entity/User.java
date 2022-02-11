package com.jam.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jam
 * @since 2022-01-26
 */
@Data
@Builder
@EqualsAndHashCode(callSuper = false)
@TableName("sys_user")
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty(value = "作为用户的唯一id存入表中")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty(value = "用户名，唯一")
      private String username;

      @ApiModelProperty(value = "密码，加密后的")
      private String password;

      @ApiModelProperty(value = "用户昵称")
      private String nickname;

      @ApiModelProperty(value = "是否被锁定，锁定为1")
      private Boolean locked;

      @ApiModelProperty(value = "创建时间")
      private Date createTime;

      @ApiModelProperty(value = "最后一次登录时间")
      private Date updateTime;

      @ApiModelProperty(value = "登录ip地址")
      private String ipAddress;


}
