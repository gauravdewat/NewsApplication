package gaurav.com.newsapp.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import gaurav.com.newsapp.R
import gaurav.com.newsapp.models.NewsArticlesModel
import gaurav.com.newsapp.models.NewsItems

class NewsItemsAdapter(var newsItemsList: List<NewsItems> = ArrayList()): RecyclerView.Adapter<NewsItemsViewHolder>(){

    fun setNewsItem(newsItemsList: List<NewsItems>){
        this.newsItemsList = newsItemsList
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): NewsItemsViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.news_article_item,p0,false)
        return NewsItemsViewHolder(view)
    }

    override fun getItemCount(): Int = newsItemsList.size

    override fun onBindViewHolder(p0: NewsItemsViewHolder, p1: Int) {
        p0.bindView(newsItemsList[p1])
    }
}