package gaurav.com.newsapp.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import gaurav.com.newsapp.GlideApp
import gaurav.com.newsapp.models.NewsItems
import kotlinx.android.synthetic.main.news_article_item.view.*

class NewsItemsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    fun bindView(newsItems: NewsItems){
        itemView.tv_title_feeds.text = newsItems.title
        itemView.tv_content_feeds.text = newsItems.content
        GlideApp.with(itemView)
            .load(newsItems.urlToImage)
            .into(itemView.iv_image_feeds)

    }
}