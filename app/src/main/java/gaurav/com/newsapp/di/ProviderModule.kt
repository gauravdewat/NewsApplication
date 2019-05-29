package gaurav.com.newsapp.di

import android.content.Context
import dagger.Module
import dagger.Provides
import gaurav.com.newsapp.NewsApp
import javax.inject.Singleton

@Module
class ProviderModule{

    @Provides
    @Singleton
    fun provideContext(application: NewsApp): Context = application

}