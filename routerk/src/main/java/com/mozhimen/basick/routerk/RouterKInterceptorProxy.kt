package com.mozhimen.basick.routerk

import com.mozhimen.basick.bases.BaseWakeBefDestroyLifecycleObserver
import com.mozhimen.kotlin.lintk.optins.OApiCall_BindLifecycle
import com.mozhimen.kotlin.lintk.optins.OApiCall_BindViewLifecycle
import com.mozhimen.kotlin.lintk.optins.OApiInit_ByLazy
import com.therouter.router.RouteItem
import com.therouter.router.interceptor.RouterInterceptor

/**
 * @ClassName RouterK
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2024/1/15
 * @Version 1.0
 */
@OApiCall_BindViewLifecycle
@OApiInit_ByLazy
@OApiCall_BindLifecycle
class RouterKInterceptorProxy : BaseWakeBefDestroyLifecycleObserver() {
    fun setRouterInterceptor(interceptor: RouterInterceptor) {
        com.therouter.router.setRouterInterceptor(interceptor)
    }

    override fun onDestroy(owner: androidx.lifecycle.LifecycleOwner) {
        com.therouter.router.setRouterInterceptor { route: RouteItem, callback: (RouteItem) -> Unit ->
            callback.invoke(route)
        }
        super.onDestroy(owner)
    }
}