package com.api_vendinha.api.domain.entities

import jakarta.persistence.*

@Table(name = "users")
@Entity
data class User (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    val id:Long? = null,

    @Column(name = "name")
    val name:String
)