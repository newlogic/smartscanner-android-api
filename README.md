# SmartScanner Android

Convenience API for [SmartScanner Core](https://github.com/idpass/smartscanner-core/) to simplify the Intent call out process.

This library provides methods that can be called to initiate scanning of MRZ, barcode, and [ID PASS Lite](https://github.com/idpass/idpass-lite) cards, instead of manually creating and calling intents.

## Installation

Declare Maven Central repository in the dependency configuration, then add this library in the dependencies. An example using `build.gradle`:

```groovy
repositories {
  mavenCentral()
}

dependencies {
  implementation "org.idpass:smartscanner-android:0.0.1-SNAPSHOT"
}
```

If you want to build this library from source, instructions to do so can be found in the [Building from source](https://github.com/idpass/smartscanner-android/wiki/Building-from-source) wiki page.

## Usage

The API methods are all provided in the `ScannerIntent` class. Import it in order to start using the library:

```kotlin
import org.idpass.smartscanner.api.ScannerIntent
import org.idpass.smartscanner.api.ScannerConstants
```

Then call the desired method from the `ScannerIntent` class, for example to initiate an MRZ scan:

```kotlin
class MainActivity : AppCompatActivity() {

  private const val OP_SCANNER = 1001 // Activity request code

  override fun onStart() {
    super.onStart()

    try {
      val intent = ScannerIntent.intentMrz(isManualCapture = true, mrzFormat = ScannerConstants.MRZ_FORMAT_MRTD_TD1)
      startActivityForResult(intent, OP_SCANNER)
    } catch (ex: ActivityNotFoundException) {
      ex.printStackTrace()
    }
  }

  public override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent?) {
    super.onActivityResult(requestCode, resultCode, intent)

    if (requestCode == OP_SCANNER) {
      if (resultCode == Activity.RESULT_OK) {
        val bundle = intent?.getBundleExtra(ScannerConstants.RESULT)
      }
    }
  }

}
```

### API

#### `ScannerIntent`

- `intentBarcode()` : Create an Android Intent for scanning barcodes.
  - **Parameters:**
    - `useODK` : `Boolean`, default: `false`. Whether to create intents for ODK or not.
  - **Return:** [`Intent`][android:Intent]

- `intentIDPassLite()` : Create an Android Intent for scanning [ID PASS Lite](https://github.com/idpass/idpass-lite) cards.
  - **Parameters:**
    - `useODK` : `Boolean`, default: `false`. Whether to create intents for ODK or not.
  - **Return:** [`Intent`][android:Intent]

- `intentMrz()` : Create and Android Intent for scanning MRZ.
  - **Parameters:**
    - `useODK` : `Boolean`, default: `false`. Whether to create intents for ODK or not.
    - `isManualCapture` : `Boolean`, default: `false`. Whether the MRZ is captured manually by the user or automatically once MRZ data is detected. This is added as extended data to the created Intent.
    - `mrzFormat` : `String`, default: `null`. The MRZ format to be scanned. One of the [supported MRZ formats](https://github.com/idpass/smartscanner-core/wiki/API-Reference#orgidpasssmartscannerlibconfigmrzformat). This is added as extended data to the created Intent.
  - **Return:** [`Intent`][android:Intent]

#### `ScannerConstants`

Provides [constant variables](app/src/main/java/org/idpass/smartscanner/api/ScannerConstants.kt) that can be used instead of hardcoded strings. We recommend using these constants when working with this library and [smartscanner-core](https://github.com/idpass/smartscanner-core/).

## License

[Apache-2.0 License](LICENSE)

<!-- Links -->

[android:Intent]: https://developer.android.com/reference/android/content/Intent
