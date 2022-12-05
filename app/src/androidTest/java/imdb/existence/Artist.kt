package imdb.existence

import androidx.room.Entity
import java.time.Year
 
@Entity
data class Artist(
     var tCost: String,
     var primaryName: String,
     var birthYear: Year,
     var deathYear: Year,
     var primaryProfession: ArrayList<String>,
     var knownForTitles: ArrayList<String>){
}