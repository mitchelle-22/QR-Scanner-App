package com.technical.qrscannercode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.Surface
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.MaterialTheme
import java.lang.reflect.Modifier

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        QRScanner3Theme {
            Surface(modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Layout.Alignment.Cen
                            terHorizontally
                ) {
                    PreviewViewComposable()
                    Text(
                        text = "Scan QR Code",
                        modifier = Modifier.padding(top = 48.dp)
                    )

                }
            }
        }
    }
}