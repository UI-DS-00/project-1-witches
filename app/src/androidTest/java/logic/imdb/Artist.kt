package logic.imdb

import java.time.Year

internal class Artist
    (var tCost: String, var primaryName: String, var birthYear: Year, var deathYear: Year,
     var primaryProfession: ArrayList<String>, var knownForTitles: ArrayList<String>){
}