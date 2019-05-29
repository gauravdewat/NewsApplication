package gaurav.com.newsapp.repo

import gaurav.com.newsapp.models.NewsUpdatesResponseModel
import gaurav.com.newsapp.network.NewsApiService
import io.reactivex.Single
import javax.inject.Inject

class NewsUpdatesRepoImpl @Inject constructor(val newsApiService : NewsApiService): NewsUpdatesRepo {
    override fun getNewsUpdates(apikey: String, source: String): Single<NewsUpdatesResponseModel> {
        return newsApiService.getNewsUpdates(apikey,source)
    }
}