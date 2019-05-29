package gaurav.com.newsapp.network

import gaurav.com.newsapp.models.NewsUpdatesResponseModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {

    @GET("v2/top-headlines")
    fun getNewsUpdates(@Query("apiKey") key : String, @Query("sources") source : String) : Single<NewsUpdatesResponseModel>
}