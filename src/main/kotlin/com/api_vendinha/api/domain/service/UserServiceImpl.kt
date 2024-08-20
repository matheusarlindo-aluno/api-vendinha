package com.api_vendinha.api.domain.service

import com.api_vendinha.api.domain.dtos.request.UserRequestDto
import com.api_vendinha.api.domain.dtos.response.UserResponseDto
import com.api_vendinha.api.domain.entities.User
import com.api_vendinha.api.infrastructure.repository.UserRepository
import org.springframework.stereotype.Service

// Marca a classe como um componente de serviço do Spring, o que permite que o Spring a gerencie e a injete em outros componentes.
@Service
class UserServiceImpl (
    // Injeção de dependência do repositório de usuários. O repositório é usado para acessar e manipular dados no banco de dados.
    private val userRepository: UserRepository
): UserServiceInterface {

    // Implementa o método definido na interface UserServiceInterface.
    // Recebe um UserRequestDto e retorna um UserResponseDto.
    override fun save(userRequestDto: UserRequestDto): UserResponseDto {
        // Cria uma nova instância da entidade User usando os dados do DTO.
        val user = userRepository.save(
            User(
                // Define o nome do usuário a partir dos dados fornecidos no DTO.
                name = userRequestDto.name
            )
        )

        // Cria e retorna um UserResponseDto com o ID e nome do usuário salvo.
        return UserResponseDto(
            id = user.id,
            name = user.name
        )
    }
}
