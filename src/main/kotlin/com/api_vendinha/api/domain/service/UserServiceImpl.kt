package com.api_vendinha.api.domain.service

import com.api_vendinha.api.domain.dtos.request.UserRequestDto
import com.api_vendinha.api.domain.dtos.response.UserResponseDto
import com.api_vendinha.api.domain.entities.User
import com.api_vendinha.api.infrastructure.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserServiceImpl (
    private val userRepository: UserRepository
):UserServiceInterface{
    override fun save(userRequestDto: UserRequestDto): UserResponseDto {
       val user = userRepository.save(
           User(
               name = userRequestDto.name
           )
       )
        return UserResponseDto(
            id = user.id,
            name = user.name
        )
    }
}