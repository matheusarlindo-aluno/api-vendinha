package com.api_vendinha.api.controller

import com.api_vendinha.api.domain.dtos.request.UserRequestDto
import com.api_vendinha.api.domain.dtos.response.UserResponseDto
import com.api_vendinha.api.domain.service.UserServiceInterface
import com.api_vendinha.api.infrastructure.repository.UserRepository
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController (
        val userService: UserServiceInterface
) {
    @PostMapping("/save")
    fun user(@RequestBody userRequestDto:UserRequestDto) : UserResponseDto{
       return  userService.save(userRequestDto)
    }
}