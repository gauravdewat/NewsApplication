package gaurav.com.newsapp.usecase

import io.reactivex.Single

abstract class SingleUseCaseWithParams<T>: UseCaseWithParams<Single<T>> () {

}