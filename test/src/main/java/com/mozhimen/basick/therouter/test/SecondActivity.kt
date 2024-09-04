package com.mozhimen.basick.therouter.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mozhimen.mvvmk.bases.activity.databinding.BaseActivityVDB
import com.mozhimen.basick.therouter.test.databinding.ActivitySecondBinding
import com.therouter.TheRouter
import com.therouter.router.Route

@Route(path = "/second")
class SecondActivity : BaseActivityVDB<ActivitySecondBinding>() {
    override fun initView(savedInstanceState: Bundle?) {
//        TheRouter.inject(this)
        android.util.UtilKLogWrapper.d(TAG, "initView: EXTRA ${intent.getStringExtra("EXTRA")}")
        vdb.secondBtn.setOnClickListener {
            TheRouter.build("/main").navigation()
        }
        vdb.secondBtn1.setOnClickListener {
            TheRouter.build("/third?type=mod").withString("EXTRA2", "这是第二个页面的数据").setDisableDeconstructUrl().navigation()
        }
    }
}