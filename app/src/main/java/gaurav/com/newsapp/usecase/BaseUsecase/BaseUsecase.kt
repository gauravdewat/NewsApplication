package gaurav.com.newsapp.usecase.BaseUsecase

abstract class BaseUsecase<T> {
    abstract fun execute():T
}