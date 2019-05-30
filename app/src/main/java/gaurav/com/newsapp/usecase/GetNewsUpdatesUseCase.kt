package gaurav.com.newsapp.usecase

import android.util.Log
import gaurav.com.newsapp.NEWS_API_KEY
import gaurav.com.newsapp.mapper.NewsUpdateToUiMapper
import gaurav.com.newsapp.models.NewsUpdatesUIModel
import gaurav.com.newsapp.repo.NewsUpdatesRepo
import io.reactivex.Single
import javax.inject.Inject

class GetNewsUpdatesUseCase @Inject constructor(val newsUpdatesRepo: NewsUpdatesRepo, val newsUpdateToUiMapper: NewsUpdateToUiMapper): SingleUseCaseWithParams<NewsUpdatesUIModel>(){
    override fun execute(): Single<NewsUpdatesUIModel> {
        Log.d("TAG4","message")
        return newsUpdatesRepo.getNewsUpdates(NEWS_API_KEY,"google-news")
            .map { newsUpdateToUiMapper.map(it) }
    }
}