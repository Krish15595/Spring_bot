package com.example.demo.model

import javax.persistence.*

@Entity
@Table(name = "user_accounts", schema = "accounts")
open class UserAccountsEntity (
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    @get:Column(name = "User_ID", nullable = false)
    var userID: Long? = 0,
    @get:Basic
    @get:Column(name = "Firstname", nullable = false)
    var firstname: String? = "",
    @get:Basic
    @get:Column(name = "Lastname", nullable = false)
    var lastname: String? = "",
    @get:Basic
    @get:Column(name = "Age", nullable = false)
    var age: Int? = 0
)

