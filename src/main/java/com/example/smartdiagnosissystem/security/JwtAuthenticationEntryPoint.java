package com.example.smartdiagnosissystem.security;


import com.example.smartdiagnosissystem.exceptions.InvalidLoginException;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;


import java.io.IOException;

    @Component
    public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {

        @Override
        public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                             AuthenticationException e) throws IOException, ServletException {

            InvalidLoginException loginResponse = new InvalidLoginException();
            String jsonLoginResponse = new Gson().toJson(loginResponse);


            httpServletResponse.setContentType("application/json");
            httpServletResponse.setStatus(401);
            httpServletResponse.getWriter().print(jsonLoginResponse);


        }
}
