package com.mozhimen.basick.therouter.test

import android.os.Bundle
import com.mozhimen.bindk.bases.activity.databinding.BaseActivityVDB
import com.mozhimen.basick.therouter.test.databinding.ActivityMainBinding
import com.therouter.TheRouter
import com.therouter.router.Route

@Route(path = "/main")
class MainActivity : BaseActivityVDB<ActivityMainBinding>() {
    override fun initView(savedInstanceState: Bundle?) {
        vdb.mainBtn.setOnClickListener {
            TheRouter.build("/second").withString("EXTRA", "这是第一个页面的数据").navigation()
        }
    }
}