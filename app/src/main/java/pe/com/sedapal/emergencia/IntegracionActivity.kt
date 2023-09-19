package pe.com.sedapal.emergencia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.arcgismaps.ApiKey
import com.arcgismaps.ArcGISEnvironment
import com.arcgismaps.mapping.ArcGISMap
import com.arcgismaps.mapping.BasemapStyle
import com.arcgismaps.mapping.Viewpoint
import com.arcgismaps.mapping.view.MapView
import pe.com.sedapal.emergencia.databinding.ActivityMainBinding

class IntegracionActivity : AppCompatActivity() {

    private val activityMainBinding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val mapView: MapView by lazy {
        activityMainBinding.mapView
    }

    private fun setupMap() {

        val map = ArcGISMap(BasemapStyle.ArcGISTopographic)
        // set the map to be displayed in the layout's MapView
        mapView.map = map

        mapView.setViewpoint(Viewpoint(34.0270, -118.8050, 72000.0))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycle.addObserver(mapView)
        setApiKey()
        setupMap()
        setContentView(activityMainBinding.root)
        //val splashScreen = installSplashScreen()


        /*
                setContent {
                    EmergenciaTheme {
                        // A surface container using the 'background' color from the theme
                        Surface(
                            modifier = Modifier.fillMaxSize(),
                            color = MaterialTheme.colorScheme.background
                        ) {
                            Greeting("Android")
                        }
                    }
                }*/
    }

    private fun setApiKey() {
        // It is not best practice to store API keys in source code. We have you insert one here
        // to streamline this tutorial.

        ArcGISEnvironment.apiKey = ApiKey.create("AAPK708c46eac1704559ac3ccfcaf22562a7DeCNT06NQxM_XmPJYx8ddsMcAQYm7y-KV1YTY8NrNnLWbMXGU5v4VnvFTMOecjvy")

    }


}

