package pe.com.sedapal.core.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pe.com.sedapal.core.data.repository.CompositeUserNewsResourceRepository
import pe.com.sedapal.core.data.repository.OfflineFirstUserDataRepository
import pe.com.sedapal.core.data.repository.UserDataRepository
import pe.com.sedapal.core.data.repository.UserNewsResourceRepository
import pe.com.sedapal.core.data.util.ConnectivityManagerNetworkMonitor
import pe.com.sedapal.core.data.util.NetworkMonitor

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {
    @Binds
    fun bindsUserDataRepository(
        userDataRepository: OfflineFirstUserDataRepository,
    ): UserDataRepository
    @Binds
    fun bindsNetworkMonitor(
        networkMonitor: ConnectivityManagerNetworkMonitor,
    ): NetworkMonitor

    @Binds
    fun bindsUserNewsResourceRepository(
        userDataRepository: CompositeUserNewsResourceRepository,
    ): UserNewsResourceRepository
}