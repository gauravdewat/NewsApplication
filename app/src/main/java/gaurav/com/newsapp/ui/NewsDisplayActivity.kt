package gaurav.com.newsapp.ui

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.helper.ItemTouchUIUtil
import dagger.android.support.DaggerAppCompatActivity
import gaurav.com.newsapp.R
import gaurav.com.newsapp.adapter.NewsItemsAdapter
import gaurav.com.newsapp.models.NewsArticlesModel
import gaurav.com.newsapp.models.NewsItems
import kotlinx.android.synthetic.main.activity_news_display.*
import javax.inject.Inject

class NewsDisplayActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var daggerViewModelFactory: ViewModelProvider.Factory

    lateinit var viewModel: NewsDisplayViewModel

    enum class UI_STATE{
        LOADING, SUCCESS, FAILURE
    }

    override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_display)
        initViewModel()
    }

    private fun initViewModel(){
        viewModel = ViewModelProviders.of(this,daggerViewModelFactory)[NewsDisplayViewModel::class.java]
        observeViewModel()
        viewModel.init()
        viewModel.getNewsUpdates()

    }

    private fun observeViewModel(){
        viewModel.uiStateLiveData.observe(this, Observer { it?.let { updateState(it) } })
        viewModel.newsArticlesList.observe(this, Observer { it?.let { setNewsArticleList(it) } })
    }
    private fun updateState(state: UI_STATE){
        when(state){
//            UI_STATE.LOADING
        }
    }
    private fun setNewsArticleList(newsArticlesList: List<NewsItems>){
        val adapter = NewsItemsAdapter(newsArticlesList)
        rv_news_article.layoutManager = LinearLayoutManager(this)
        rv_news_article.adapter = adapter
    }
}
