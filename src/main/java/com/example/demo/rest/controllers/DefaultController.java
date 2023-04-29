package com.example.demo.rest.controllers;

import com.example.demo.rest.dao.UserDAO;
import com.example.demo.rest.services.DefaultService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.websocket.server.PathParam;

@Controller
public class DefaultController {

    private final DefaultService defaultService;

    public DefaultController(DefaultService defaultService) {
        this.defaultService = defaultService;
    }

    @Operation(summary = "метод получения пользователя по id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Данные ...",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = UserDAO.class))}),
            @ApiResponse(responseCode = "404", description = "Пользователь нету")})
    @GetMapping(value = "/user")
    public ResponseEntity<?> getUser(@PathParam("id") Long id) {
        return defaultService.getUser(id);
    }

    @Operation(summary = "метод получения всех пользователей")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Данные ...",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = UserDAO.class))})})
    @GetMapping(value = "/users")
    public ResponseEntity<?> getUsers() {
        return defaultService.getUsers();
    }
}
