package com.mozhimen.basick.routerk

import com.mozhimen.basick.elemk.androidx.lifecycle.bases.BaseWakeBefDestroyLifecycleObserver
import com.mozhimen.basick.lintk.optin.OptInApiCall_BindLifecycle
import com.mozhimen.basick.lintk.optin.OptInApiInit_ByLazy
import com.therouter.router.RouteItem
import com.therouter.router.interceptor.RouterInterceptor

/**
 * @ClassName RouterK
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2024/1/15
 * @Version 1.0
 */
@OptInApiInit_ByLazy
@OptInApiCall_BindLifecycle
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