package com.mozhimen.basick.therouter.test

import com.mozhimen.stackk.bases.BaseApplication
import com.mozhimen.kotlin.lintk.optin.OptInApiMultiDex_InApplication
import com.therouter.TheRouter
import dagger.hilt.android.HiltAndroidApp

/**
 * @ClassName MainApplication
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/12/25 21:48
 * @Version 1.0
 */
@HiltAndroidApp
@OptIn(OptInApiMultiDex_InApplication::class)
class MainApplication : BaseApplication() {
    override fun onCreate() {
        super.onCreate()
        TheRouter.isDebug = true
    }
}