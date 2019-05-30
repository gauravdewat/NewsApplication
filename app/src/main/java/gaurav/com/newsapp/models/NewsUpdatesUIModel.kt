package gaurav.com.newsapp.models

data class NewsUpdatesUIModel(
    val newsItems: List<NewsItems>?
)
data class NewsItems(val title: String?, val content: String?, val urlToImage: String?)