package gaurav.com.newsapp.repo

import gaurav.com.newsapp.models.NewsUpdatesResponseModel
import io.reactivex.Single

interface NewsUpdatesRepo {
    fun getNewsUpdates(apikey: String, source : String): Single<NewsUpdatesResponseModel>
}