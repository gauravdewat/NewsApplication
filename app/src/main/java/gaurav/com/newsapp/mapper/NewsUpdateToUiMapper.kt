package gaurav.com.newsapp.mapper

import android.util.Log
import gaurav.com.newsapp.models.NewsItems
import gaurav.com.newsapp.models.NewsUpdatesResponseModel
import gaurav.com.newsapp.models.NewsUpdatesUIModel
import javax.inject.Inject

class NewsUpdateToUiMapper @Inject constructor(){
    fun map(newsUpdatesResponseModel: NewsUpdatesResponseModel): NewsUpdatesUIModel{
        val articles : List<NewsItems>? = newsUpdatesResponseModel.articlesItem?.let { article->  article.map { NewsItems(it.title,it.content,it.urlToImage) }}
        Log.d("Tag5", articles?.get(1)?.content.toString())
        return NewsUpdatesUIModel(articles)
    }
}