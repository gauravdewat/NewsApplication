package gaurav.com.newsapp.repo

import android.util.Log
import gaurav.com.newsapp.models.NewsUpdatesResponseModel
import gaurav.com.newsapp.network.NewsApiService
import io.reactivex.Single
import javax.inject.Inject

class NewsUpdatesRepoImpl @Inject constructor(val newsApiService : NewsApiService): NewsUpdatesRepo {
    override fun getNewsUpdates(apikey: String, source: String): Single<NewsUpdatesResponseModel> {
        Log.d("Tag6","")
        return newsApiService.getNewsUpdates(apikey,source)
    }
}