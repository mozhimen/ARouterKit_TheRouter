package com.mozhimen.basick.therouter.test

import android.os.Bundle
import com.mozhimen.basick.elemk.androidx.appcompat.bases.databinding.BaseActivityVB
import com.mozhimen.basick.therouter.test.databinding.ActivityMainBinding
import com.therouter.TheRouter
import com.therouter.router.Route

@Route(path = "/main")
class MainActivity : BaseActivityVB<ActivityMainBinding>() {
    override fun initView(savedInstanceState: Bundle?) {
        vb.mainBtn.setOnClickListener {
            TheRouter.build("/second").withString("EXTRA", "这是第一个页面的数据").navigation()
        }
    }
}