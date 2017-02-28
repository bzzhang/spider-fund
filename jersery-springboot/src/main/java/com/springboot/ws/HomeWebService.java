package com.springboot.ws;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.springboot.ws.dto.ResponseDto;
import com.springboot.ws.dto.UserDto;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by zbz on 2017/2/28.
 */
@Path("user")
@Produces(MediaType.APPLICATION_JSON)
public class HomeWebService {

    @GET
    @Path("login")
    public ResponseDto<UserDto> login(
            @NotNull(message = "{user.name.empty}") @QueryParam("user_identification") String userIdentification,
            @NotNull(message = "{user.pwd.empty}") @QueryParam("password") String password,
            @QueryParam("auto_login") Boolean autoLogin) {
        ResponseDto<UserDto> responseDto=new ResponseDto<UserDto>();
        UserDto userDto=new UserDto();
        userDto.setUserName("aa");
        userDto.setAuthorities(Sets.newHashSet("123","234"));
        responseDto.setObj(userDto);
        return responseDto;
    }

    @GET
    @Path("hello")
    public String message() {
        return "Hello";
    }

}
