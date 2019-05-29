package gaurav.com.newsapp.usecase

abstract class UseCaseWithParams<T> {
    abstract fun execute() : T
}