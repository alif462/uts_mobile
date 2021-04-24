package id.rdev.TokoQU.activity.login

import id.rdev.TokoQU.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}