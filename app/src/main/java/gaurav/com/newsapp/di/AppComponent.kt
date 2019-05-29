package gaurav.com.newsapp.di

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.DaggerActivity
import dagger.android.support.AndroidSupportInjectionModule
import gaurav.com.newsapp.NewsApp
import gaurav.com.newsapp.ui.NewsDisplayActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class,ActivityBindingModule::class, AndroidInjectionModule::class,
    AndroidSupportInjectionModule::class, BindingModule::class,
    ProviderModule::class, ViewModelModule::class])
interface AppComponent : AndroidInjector<NewsApp>{


    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application:NewsApp): Builder

        fun build(): AppComponent
    }
}