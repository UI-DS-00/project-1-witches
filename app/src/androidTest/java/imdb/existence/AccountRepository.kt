package imdb.existence

import androidx.lifecycle.LiveData

class AccountRepository (private val accountDao: AccountDao) {

    val readAllDatabase: LiveData<List<Account>> = accountDao.readAllData()

    suspend  fun addAccount(account: Account){
        accountDao.addAccount(account)
    }
}