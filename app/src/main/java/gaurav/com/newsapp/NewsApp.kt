package gaurav.com.newsapp

import com.bumptech.glide.annotation.GlideModule
import com.facebook.stetho.Stetho
import com.facebook.stetho.okhttp3.StethoInterceptor
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import gaurav.com.newsapp.di.DaggerAppComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

class NewsApp : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this)
            OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor())
                .addNetworkInterceptor(StethoInterceptor())
                .build()
        }
    }
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder()
            .application(this)
            .build()
    }
}