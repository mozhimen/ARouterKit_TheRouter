package com.mozhimen.basick.therouter.test2

import android.os.Bundle
import com.mozhimen.uik.databinding.bases.activity.databinding.BaseActivityVDB
import com.mozhimen.basick.therouter.test2.databinding.ActivityThirdBinding
import com.therouter.router.Route
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
@Route(path = "/third?type=mod", isDeconstructPath = false)
class ThirdActivity : BaseActivityVDB<ActivityThirdBinding>() {
    override fun initView(savedInstanceState: Bundle?) {
        android.util.UtilKLogWrapper.d(TAG, "initView: EXTRA2 ${intent.getStringExtra("EXTRA2")}")
    }
}