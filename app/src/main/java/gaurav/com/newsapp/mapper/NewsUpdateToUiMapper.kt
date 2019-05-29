package gaurav.com.newsapp.mapper

import gaurav.com.newsapp.models.NewsItems
import gaurav.com.newsapp.models.NewsUpdatesResponseModel
import gaurav.com.newsapp.models.NewsUpdatesUIModel
import javax.inject.Inject

class NewsUpdateToUiMapper @Inject constructor(){
    fun map(newsUpdatesResponseModel: NewsUpdatesResponseModel): NewsUpdatesUIModel{
        val articles : List<NewsItems> = newsUpdatesResponseModel.newsArticlesModel.map { NewsItems(it.title,it.content) }
        return NewsUpdatesUIModel(articles)
    }
}