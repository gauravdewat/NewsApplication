package gaurav.com.newsapp.network

import gaurav.com.newsapp.models.NewsUpdatesResponseModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {
    @GET()
    fun getNewsUpdates(@Query("sources") source : String, @Query("apiKey") key : String) : Single<NewsUpdatesResponseModel>
}