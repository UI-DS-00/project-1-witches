package com.example.imdb

import androidx.lifecycle.ViewModel
import com.example.imdb.model.Account
import com.example.imdb.model.Movie
import com.google.gson.annotations.SerializedName
import java.io.File

class SignInSignUpViewModel: ViewModel() {

//    var nameFile = "/AndroidStudioProjects/project-1-witches/File/accounts.txt"
//
//    var accounts = File(nameFile)
//
//    val isNewFileCreated :Boolean = accounts.createNewFile()
//
//    val accountsList = ArrayList<Account>()
//
//    // sign up
//    fun signUp(userName: String, email: String, password: String): Int{
//        var account = Account(Account.number, userName, email, password)
//        accountsList.add(account)
//        return account.id
//    }
//
//    // sign in
//    fun signIn(email: String, password: String): Int{
//
//        var checkEmail = false
//        var checkPassword = false
//
//        for (i in accountsList.indices){
//            if (accountsList[i].email == email)
//                checkEmail = true
//        }
//
//        for (i in accountsList.indices){
//            if (accountsList[i].password == password)
//                checkPassword = true
//        }
//
//        var selectID = 0
//
//        if (checkEmail && checkPassword){
//
//          for (i in accountsList.indices)
//                if (accountsList[i].email == email) {
//                    selectID = accountsList[i].id
//                    break
//                }
//        }
//
//        return selectID
//    }
//
//    // search Movie with id
//    fun searchMovie(idMovie: String): Int{
//        return 1
//    }
//
//    // add Movie to watchlist
//    fun addMovieWatchList(idAccount: Int, idMovie: String){
//
//    }
}