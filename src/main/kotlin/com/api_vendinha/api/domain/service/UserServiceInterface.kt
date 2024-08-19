package com.api_vendinha.api.domain.service

import com.api_vendinha.api.domain.dtos.request.UserRequestDto
import com.api_vendinha.api.domain.dtos.response.UserResponseDto

interface UserServiceInterface {
    fun save(userRequestDto: UserRequestDto):UserResponseDto
}