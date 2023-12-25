package com.mozhimen.basick.therouter.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mozhimen.basick.elemk.androidx.appcompat.bases.databinding.BaseActivityVB
import com.mozhimen.basick.therouter.test.databinding.ActivitySecondBinding
import com.therouter.TheRouter
import com.therouter.router.Route

@Route(path = "/second")
class SecondActivity : BaseActivityVB<ActivitySecondBinding>() {
    override fun initView(savedInstanceState: Bundle?) {
//        TheRouter.inject(this)
        android.util.Log.d(TAG, "initView: EXTRA ${intent.getStringExtra("EXTRA")}")
        vb.secondBtn.setOnClickListener {
            TheRouter.build("/main").navigation()
        }
        vb.secondBtn1.setOnClickListener {
            TheRouter.build("/third").withString("EXTRA2", "这是第二个页面的数据").navigation()
        }
    }
}