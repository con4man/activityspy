package activityspy.connorha.washington.edu.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    companion object {
        private val TAG: String = "Main Activity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate event fired")
        if (savedInstanceState != null) {
            Log.i(TAG, "We have state!")
        } else {
            Log.i(TAG, "We have no state")
        }
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop fired")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart fired")
    }

    override fun onDestroy() {
        super.onResume()
        Log.i(TAG, "onDestroy fired")
        Log.e(TAG, "We're going down, Captain!")
    }

}
