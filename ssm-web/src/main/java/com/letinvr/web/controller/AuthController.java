package com.letinvr.web.controller;

import com.google.common.collect.ImmutableMap;
import com.letinvr.common.bean.Result;
import com.letinvr.dao.model.dto.UserInfoDto;
import com.letinvr.web.vo.UserLoginVo;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/token")
    public Result token(@ModelAttribute UserLoginVo vo){
        return Result.ok(ImmutableMap.of(
                "access_token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MjA2MDM2NDMsInVzZXJfbmFtZSI6ImFkbWluIiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9BRE1JTiJdLCJqdGkiOiJkODBjNGVjMC0yZWE0LTRhYTktYTMwNS1hMWQzZTk0NzBhZjUiLCJjbGllbnRfaWQiOiJjb20uZ2l0aHViLmxpdXdlaWp3Iiwic2NvcGUiOlsic2VydmVyIl19.z8dc3gXmJsKI1zUriRDLUnjIbW1j8UX9R1m_S-YsRlw",
                "refresh_token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX25hbWUiOiJhZG1pbiIsInNjb3BlIjpbInNlcnZlciJdLCJhdGkiOiJkODBjNGVjMC0yZWE0LTRhYTktYTMwNS1hMWQzZTk0NzBhZjUiLCJleHAiOjE1MjMxNTI0NDMsImF1dGhvcml0aWVzIjpbIlJPTEVfQURNSU4iXSwianRpIjoiZWEzZTRkOWYtNzg1Yy00ZDQ0LWExM2QtYjY1MjBjNmFhMTY1IiwiY2xpZW50X2lkIjoiY29tLmdpdGh1Yi5saXV3ZWlqdyJ9.s3X7yKk575bJwxLf7w603TD9EBLF8GB8HVqh44ED1Oc"));
    }

    @GetMapping("/info")
    public Result info(HttpServletRequest request){
        System.out.println("用户token：" + request.getHeader("Authorization"));
        HashMap<String, Object> map = new HashMap<>();
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setUserId(1L).setUsername("lij").setDeleteStatus(true).setPicUrl("https://avatars0.githubusercontent.com/u/21272196?s=40&v=4").setDeleteStatus(true);
        map.put("user", userInfoDto);
        map.put("permissions", Arrays.asList("user_view", "user_del", "user_upd", "user_add"));
        map.put("roles", Arrays.asList("ROLE_ADMIN"));
        return Result.ok(map);
    }

    @PostMapping("/removeToken")
    public Result removeToken(@RequestParam String accesstoken){
        return Result.ok(true);
    }

    @GetMapping("/userTree")
    public Result userTree(){
        return Result.ok(Arrays.asList(2, 8, 7, 10, 9, 14, 1, 5, 3, 11, 4, 13, 6, 12));
    }
}
