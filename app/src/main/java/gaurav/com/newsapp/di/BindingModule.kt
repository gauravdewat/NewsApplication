package gaurav.com.newsapp.di

import dagger.Binds
import dagger.Module
import gaurav.com.newsapp.repo.NewsUpdatesRepo
import gaurav.com.newsapp.repo.NewsUpdatesRepoImpl

@Module
abstract class BindingModule {
    @Binds
    abstract fun bindNewsUpdatesRepo(newsUpdatesRepoImpl: NewsUpdatesRepoImpl): NewsUpdatesRepo
}