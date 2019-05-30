package gaurav.com.newsapp.models

import com.squareup.moshi.Json

data class NewsUpdatesResponseModel (
    @Json(name = "status") val status : String?,
    @Json(name = "totalResults") val totalResults : String? ,
    @field:Json(name = "articles") val articlesItem: List<NewsArticlesModel>?
)