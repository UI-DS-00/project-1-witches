package imdb.existence

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface AccountDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addAccount(account: Account)

    @Query(value = "SELECT * FROM account_table ORDER BY numberAccount ASC")
    fun readAllData(): LiveData<List<Account>>
}