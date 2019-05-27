package gaurav.com.newsapp.models

import com.squareup.moshi.Json

data class NewsArticlesModel (
    @Json(name = "author") var author:String,
    @Json(name = "title") var title:String,
    @Json(name = "urlToImage") var urlToImage:String,
    @Json(name = "publishedAt") var publishedAt:String,
    @Json(name = "content") var content:String
)