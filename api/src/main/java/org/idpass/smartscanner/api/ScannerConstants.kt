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


object ScannerConstants {

    // Scanner
    const val MODE = "mode"
    const val RESULT = "result"

    // Types
    const val BARCODE = "barcode"
    const val IDPASS_LITE = "idpass-lite"
    const val MRZ = "mrz"

    // BARCODE
    const val BARCODE_IMAGE = "image"
    const val BARCODE_CORNERS = "corners"
    const val BARCODE_VALUE = "value"

    //ID PASS LITE
    const val IDPASS_LITE_IMAGE = "image"
    const val IDPASS_LITE_FULL_NAME = "full_name"
    const val IDPASS_LITE_GIVEN_NAMES = "given_names"
    const val IDPASS_LITE_SURNAME = "surname"
    const val IDPASS_LITE_DATE_OF_BIRTH = "date_of_birth"
    const val IDPASS_LITE_PLACE_OF_BIRTH = "place_of_birth"
    const val IDPASS_LITE_GENDER = "gender"
    const val IDPASS_LITE_UIN = "uin"
    const val IDPASS_LITE_ADDRESS_POSTAL_CODE = "address_postal_code"
    const val IDPASS_LITE_ADDRESS_ADMINISTRATIVE_AREA = "address_administrative_area"
    const val IDPASS_LITE_ADDRESS_ADDRESS_LINES = "address_address_lines"
    const val IDPASS_LITE_ADDRESS_LANGUAGE_CODE = "address_language_code"
    const val IDPASS_LITE_ADDRESS_SORTING_CODE = "address_sorting_code"
    const val IDPASS_LITE_ADDRESS_LOCALITY = "address_locality"
    const val IDPASS_LITE_ADDRESS_SUBLOCALITY = "address_sublocality"
    const val IDPASS_LITE_ADDRESS_ORGANIZATION = "address_organization"
    const val IDPASS_LITE_RAW = "raw_card"

    // MRZ
    const val MRZ_IMAGE = "image"
    const val MRZ_CODE = "code"
    const val MRZ_CODE_1 = "code_1"
    const val MRZ_CODE_2 = "code_2"
    const val MRZ_DATE_OF_BIRTH = "date_of_birth"
    const val MRZ_DOCUMENT_NUMBER = "document_number"
    const val MRZ_EXPIRY_DATE = "expiry_date"
    const val MRZ_FORMAT = "format"
    const val MRZ_GIVEN_NAMES = "given_names"
    const val MRZ_SURNAME = "surname"
    const val MRZ_ISSUING_COUNTRY = "issuing_country"
    const val MRZ_NATIONALITY = "nationality"
    const val MRZ_SEX = "sex"
    const val MRZ_RAW = "raw_mrz"
    // MRZ Format
    const val MRZ_FORMAT_EXTRA = "format_extra"
    const val MRZ_FORMAT_MRTD_TD1= "mrtd_td1"
    const val MRZ_FORMAT_MRP = "mrp"
    // MRZ Manual Capture
    const val MRZ_MANUAL_CAPTURE_EXTRA = "manual_capture_extra"

    // NFC
    const val NFC_ACTION = "nfc_action"
    const val NFC_MRZ_STRING = "nfc_mrz_string"
    const val NFC_GIVEN_NAMES = "given_names"
    const val NFC_SURNAME = "surname"
    const val NFC_GENDER = "gender"
    const val NFC_NAME_OF_HOLDER = "name_of_holder"
    const val NFC_DOCUMENT_NUMBER = "document_number"
    const val NFC_EXPIRY_DATE = "expiry_date"
    const val NFC_ISSUING_STATE = "issuing_state"
    const val NFC_NATIONALITY = "nationality"
    const val NFC_OTHER_NAMES = "other_names"
    const val NFC_DATE_OF_BIRTH = "date_of_birth"
    const val NFC_CUSTODY_INFO = "custody_info"
    const val NFC_PROFESSION = "profession"
    const val NFC_TELEPHONE = "telephone"
    const val NFC_TITLE = "title"
    const val NFC_DATE_TIME_PERSONALIZATION = "date_time_of_personalization"
    const val NFC_DATE_OF_ISSUE = "date_of_issue"
    const val NFC_ENDORSEMENTS_AND_OBSERVATIONS = "endorsements_and_observations"
    const val NFC_ISSUING_AUTHORITY = "issuing_authority"
    const val NFC_PERSONAL_SYSTEM_SERIAL_NUMBER = "personal_system_serialNumber"
    const val NFC_TAX_EXIT_REQUIREMENTS = "tax_or_exit_requirements"

    // QR CODE GZIP/JSON
    const val GZIPPED_ENABLED = "gzipped"
    const val JSON_ENABLED = "json"
    const val JSON_PATH = "json_path"
    const val QRCODE_JSON_VALUE = "qr_code_json_value"
    const val QRCODE_TEXT = "qr_code_text"
    // ODK
    const val IDPASS_ODK_INTENT_DATA = "odk_intent_data"
    const val IDPASS_ODK_PREFIX_EXTRA = "prefix"

    // Intents
    const val IDPASS_SMARTSCANNER_BARCODE_INTENT = "org.idpass.smartscanner.BARCODE_SCAN"
    const val IDPASS_SMARTSCANNER_IDPASS_LITE_INTENT = "org.idpass.smartscanner.IDPASS_LITE_CAN"
    const val IDPASS_SMARTSCANNER_MRZ_INTENT = "org.idpass.smartscanner.MRZ_SCAN"
    const val IDPASS_SMARTSCANNER_NFC_INTENT = "org.idpass.smartscanner.NFC_SCAN"
    const val IDPASS_SMARTSCANNER_QRCODE_INTENT = "org.idpass.smartscanner.QRCODE_SCAN"
    // Intents ODK
    const val IDPASS_SMARTSCANNER_ODK_BARCODE_INTENT = "org.idpass.smartscanner.odk.BARCODE_SCAN"
    const val IDPASS_SMARTSCANNER_ODK_IDPASS_LITE_INTENT = "org.idpass.smartscanner.odk.IDPASS_LITE_SCAN"
    const val IDPASS_SMARTSCANNER_ODK_MRZ_INTENT = "org.idpass.smartscanner.odk.MRZ_SCAN"
    const val IDPASS_SMARTSCANNER_ODK_NFC_INTENT = "org.idpass.smartscanner.odk.NFC_SCAN"
    const val IDPASS_SMARTSCANNER_ODK_QRCODE_INTENT = "org.idpass.smartscanner.odk.QRCODE_SCAN"
}