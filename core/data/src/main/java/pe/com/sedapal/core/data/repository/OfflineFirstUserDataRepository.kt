/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pe.com.sedapal.core.data.repository

import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import pe.com.sedapal.core.data.repository.UserDataRepository
import pe.com.sedapal.core.model.DarkThemeConfig
import pe.com.sedapal.core.model.ThemeBrand
import pe.com.sedapal.core.model.UserData
import javax.inject.Inject

class OfflineFirstUserDataRepository @Inject constructor() : UserDataRepository {

    override val userData: Flow<UserData> = callbackFlow {
        trySend(
            UserData(
                bookmarkedNewsResources = "",
                darkThemeConfig = DarkThemeConfig.DARK,
                themeBrand = ThemeBrand.ANDROID,
                useDynamicColor = true
            )
        ).isSuccess
        awaitClose{

        }
    }
}
