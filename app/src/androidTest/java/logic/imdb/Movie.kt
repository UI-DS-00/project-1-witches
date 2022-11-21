package logic.imdb

import java.time.Year

internal class Movie (var tConst: String, var titleType: String, var primaryTitle: String, var originalTitle: String,
var isAdult: Boolean, var startYear: Year, var endYear: Year,var country: String, var runtimeMinutes: Int,
var genres: ArrayList<String>){

}