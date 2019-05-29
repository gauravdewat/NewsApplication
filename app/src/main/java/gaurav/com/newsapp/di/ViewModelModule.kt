package gaurav.com.newsapp.di

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import gaurav.com.newsapp.ui.NewsDisplayViewModel
import kotlin.reflect.KClass

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: DaggerViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(NewsDisplayViewModel::class)
    abstract fun provideViewModel(newsDisplayViewModel: NewsDisplayViewModel):ViewModel

}

@Retention(AnnotationRetention.RUNTIME)
@MapKey
internal annotation class ViewModelKey(val value: KClass<out ViewModel>)