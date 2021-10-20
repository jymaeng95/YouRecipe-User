package com.yourecipe.user.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel(description = "유저 가입 정보를 담은 도메인 객체")
@ToString
@Getter
@Builder
public class User {
    @ApiModelProperty(value = "회원 ID")
    private int userId;

    @ApiModelProperty(value = "회원 Email")
    private String email;

    @ApiModelProperty(value = "회원 닉네임")
    private String nickname;

    @ApiModelProperty(value = "프로필 이미지 경로")
    /* 타입 URL로 ? */
    private String profile;


}
