/*
 * Copyright (C) 2020 Newlogic Pte. Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 *
 */
package org.idpass.smartscanner.api

import android.content.Intent
import org.idpass.smartscanner.api.ScannerConstants.GZIPPED_ENABLED
import org.idpass.smartscanner.api.ScannerConstants.IDPASS_SMARTSCANNER_BARCODE_INTENT
import org.idpass.smartscanner.api.ScannerConstants.IDPASS_SMARTSCANNER_IDPASS_LITE_INTENT
import org.idpass.smartscanner.api.ScannerConstants.IDPASS_SMARTSCANNER_MRZ_INTENT
import org.idpass.smartscanner.api.ScannerConstants.IDPASS_SMARTSCANNER_ODK_BARCODE_INTENT
import org.idpass.smartscanner.api.ScannerConstants.IDPASS_SMARTSCANNER_ODK_IDPASS_LITE_INTENT
import org.idpass.smartscanner.api.ScannerConstants.IDPASS_SMARTSCANNER_ODK_MRZ_INTENT
import org.idpass.smartscanner.api.ScannerConstants.IDPASS_SMARTSCANNER_QRCODE_INTENT

class ScannerIntent {

    companion object {
        @JvmStatic
        fun intentBarcode(useODK : Boolean = false): Intent {
            val action = if (useODK) IDPASS_SMARTSCANNER_ODK_BARCODE_INTENT else IDPASS_SMARTSCANNER_BARCODE_INTENT
            return Intent(action)
        }

        @JvmStatic
        fun intentIDPassLite(useODK : Boolean = false): Intent {
            val action = if (useODK) IDPASS_SMARTSCANNER_ODK_IDPASS_LITE_INTENT else IDPASS_SMARTSCANNER_IDPASS_LITE_INTENT
            return Intent(action)
        }

        @JvmStatic
        fun intentMRZ(useODK : Boolean = false,
                      isManualCapture : Boolean = false,
                      mrzFormat : String? = null): Intent {
            val action = if (useODK) IDPASS_SMARTSCANNER_ODK_MRZ_INTENT else IDPASS_SMARTSCANNER_MRZ_INTENT
            val intent = Intent(action)
            intent.putExtra(ScannerConstants.MRZ_MANUAL_CAPTURE_EXTRA, isManualCapture)
            intent.putExtra(ScannerConstants.MRZ_FORMAT_EXTRA, mrzFormat)
            return intent
        }

        @JvmStatic
        fun intentQRCode(isGzipped : Boolean, isJson : Boolean, jsonPath : String? = null): Intent {
            val intent = Intent(IDPASS_SMARTSCANNER_QRCODE_INTENT)
            intent.putExtra(ScannerConstants.JSON_ENABLED, isJson)
            intent.putExtra(GZIPPED_ENABLED, isGzipped)
            if (!jsonPath.isNullOrEmpty()) {
                intent.putExtra(ScannerConstants.JSON_PATH, jsonPath)
            }
            return intent
        }
    }
}