package pe.com.sedapal.core.data

import androidx.annotation.VisibleForTesting
import kotlinx.coroutines.flow.Flow
import pe.com.sedapal.core.model.DarkThemeConfig
import pe.com.sedapal.core.model.ThemeBrand
import pe.com.sedapal.core.model.UserData
import javax.inject.Inject

class OfflineFirstUserDataRepository @Inject aqconstructor(
    private val niaPreferencesDataSource: NiaPreferencesDataSource
) : UserDataRepository {

    override val userData: Flow<UserData> =
        niaPreferencesDataSource.userData

}
