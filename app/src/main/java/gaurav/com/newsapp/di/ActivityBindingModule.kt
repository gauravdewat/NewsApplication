package gaurav.com.newsapp.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import gaurav.com.newsapp.ui.NewsDisplayActivity

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    abstract fun bindActivity(): NewsDisplayActivity
}