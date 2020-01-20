package com.example.demo.controller

import com.example.demo.UserRepository
import com.example.demo.model.UserAccountsEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController {

    @Autowired
    private var mUserRepository: UserRepository? = null

    @PostMapping(value = arrayOf("/all"))
    public fun findAll(): List<UserAccountsEntity> {
        return mUserRepository!!.findAll()
    }

  /*  @GetMapping(value = arrayOf("/all/{User_ID}"))
    public fun findByUserID(@PathVariable User_ID:Long): List<UserAccountsEntity> {
        return mUserRepository!!.findAllById()
    }*/
  @GetMapping("/name/{User_ID}")
  fun getAccountById(@PathVariable(value = "User_ID") User_Id: Long): ResponseEntity<UserAccountsEntity> {
      return mUserRepository!!.findById(User_Id).map { article ->
          ResponseEntity.ok(article)
      }.orElse(ResponseEntity.notFound().build())
  }
}