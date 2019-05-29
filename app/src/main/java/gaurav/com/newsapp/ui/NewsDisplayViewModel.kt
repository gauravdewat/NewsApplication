package gaurav.com.newsapp.ui

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import gaurav.com.newsapp.models.NewsArticlesModel
import gaurav.com.newsapp.models.NewsItems
import gaurav.com.newsapp.usecase.GetNewsUpdatesUseCase
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class NewsDisplayViewModel @Inject constructor(val getNewsUpdatesUseCase: GetNewsUpdatesUseCase): ViewModel() {

    val requestPermissionLiveData = MutableLiveData<Boolean>()
    val uiStateLiveData = MutableLiveData<NewsDisplayActivity.UI_STATE>()
    val newsArticlesList = MutableLiveData<List<NewsItems>>()

    fun init(){
        requestPermissionLiveData.postValue(true)
        uiStateLiveData.postValue(NewsDisplayActivity.UI_STATE.LOADING)
    }
    fun getNewsUpdates(){
        Log.d("TAG1", "message")
        getNewsUpdatesUseCase.execute()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("TAG2", "message")
                uiStateLiveData.postValue(NewsDisplayActivity.UI_STATE.SUCCESS)
                newsArticlesList.postValue(it.newsItems)

            },{
                Log.d("TAG3", it.message)
                it.printStackTrace()
            })
    }


}