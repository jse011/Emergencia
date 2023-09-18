package pe.com.sedapal.core.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pe.com.sedapal.core.data.OfflineFirstUserDataRepository
import pe.com.sedapal.core.data.repository.UserDataRepository

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {
    @Binds
    fun bindsUserDataRepository(
        userDataRepository: OfflineFirstUserDataRepository,
    ): UserDataRepository

}