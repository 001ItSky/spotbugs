package edu.umd.cs.findbugs.flybush;

import java.util.HashMap;
import java.util.Map;

public class GCountryCodes {
    private static Map<String,String> map = new HashMap<String, String>();

    static {
        // from http://code.google.com/apis/adwords/docs/appendix/countrycodes.html
        add("Afghanistan", "AF");
        add("Albania", "AL");
        add("Algeria", "DZ");
        add("American Samoa", "AS");
        add("Andorra", "AD");
        add("Angola", "AO");
        add("Anguilla", "AI");
        add("Antarctica", "AQ");
        add("Antigua and Barbuda", "AG");
        add("Argentina", "AR");
        add("Armenia", "AM");
        add("Aruba", "AW");
        add("Australia", "AU");
        add("Austria", "AT");
        add("Azerbaijan", "AZ");
        add("Bahamas", "BS");
        add("Bahrain", "BH");
        add("Bangladesh", "BD");
        add("Barbados", "BB");
        add("Belarus", "BY");
        add("Belgium", "BE");
        add("Belize", "BZ");
        add("Benin", "BJ");
        add("Bermuda", "BM");
        add("Bhutan", "BT");
        add("Bolivia", "BO");
        add("Bosnia and Herzegovina", "BA");
        add("Botswana", "BW");
        add("Bouvet Island", "BV");
        add("Brazil", "BR");
        add("British Indian Ocean Territory", "IO");
        add("Brunei Darussalam", "BN");
        add("Bulgaria", "BG");
        add("Burkina Faso", "BF");
        add("Burundi", "BI");
        add("Cambodia", "KH");
        add("Cameroon", "CM");
        add("Canada", "CA");
        add("Cape Verde", "CV");
        add("Cayman Islands", "KY");
        add("Central African Republic", "CF");
        add("Chad", "TD");
        add("Chile", "CL");
        add("China", "CN");
        add("Christmas Island", "CX");
        add("Cocos (Keeling) Islands", "CC");
        add("Colombia", "CO");
        add("Comoros", "KM");
        add("Congo", "CG");
        add("Congo, Democratic Republic", "CD");
        add("Cook Islands", "CK");
        add("Costa Rica", "CR");
        add("Cote d'Ivoire", "CI");
        add("Croatia", "HR");
        add("Cyprus", "CY");
        add("Czech Republic", "CZ");
        add("Denmark", "DK");
        add("Djibouti", "DJ");
        add("Dominica", "DM");
        add("Dominican Republic", "DO");
        add("East Timor", "TL");
        add("Ecuador", "EC");
        add("Egypt", "EG");
        add("El Salvador", "SV");
        add("Equatorial Guinea", "GQ");
        add("Eritrea", "ER");
        add("Estonia", "EE");
        add("Ethiopia", "ET");
        add("Falkland Islands (Malvinas)", "FK");
        add("Faroe Islands", "FO");
        add("Fiji", "FJ");
        add("Finland", "FI");
        add("France", "FR");
        add("France, Metropolitan", "FX");
        add("French Guiana", "GF");
        add("French Polynesia", "PF");
        add("French Southern Territories", "TF");
        add("Gabon", "GA");
        add("Gambia", "GM");
        add("Georgia", "GE");
        add("Germany", "DE");
        add("Ghana", "GH");
        add("Gibraltar", "GI");
        add("Greece", "GR");
        add("Greenland", "GL");
        add("Grenada", "GD");
        add("Guadeloupe", "GP");
        add("Guam", "GU");
        add("Guatemala", "GT");
        add("Guinea", "GN");
        add("Guinea-Bissau", "GW");
        add("Guyana", "GY");
        add("Haiti", "HT");
        add("Heard and McDonald Islands", "HM");
        add("Honduras", "HN");
        add("Hong Kong", "HK");
        add("Hungary", "HU");
        add("Iceland", "IS");
        add("India", "IN");
        add("Indonesia", "ID");
        add("Iraq", "IQ");
        add("Ireland", "IE");
        add("Israel", "IL");
        add("Italy", "IT");
        add("Jamaica", "JM");
        add("Japan", "JP");
        add("Jordan", "JO");
        add("Kazakhstan", "KZ");
        add("Kenya", "KE");
        add("Kiribati", "KI");
        add("Kuwait", "KW");
        add("Kyrgyzstan", "KG");
        add("Lao People's Democratic Republic", "LA");
        add("Latvia", "LV");
        add("Lebanon", "LB");
        add("Lesotho", "LS");
        add("Liberia", "LR");
        add("Libya", "LY");
        add("Liechtenstein", "LI");
        add("Lithuania", "LT");
        add("Luxembourg", "LU");
        add("Macau", "MO");
        add("Macedonia", "MK");
        add("Madagascar", "MG");
        add("Malawi", "MW");
        add("Malaysia", "MY");
        add("Maldives", "MV");
        add("Mali", "ML");
        add("Malta", "MT");
        add("Marshall Islands", "MH");
        add("Martinique", "MQ");
        add("Mauritania", "MR");
        add("Mauritius", "MU");
        add("Mayotte", "YT");
        add("Mexico", "MX");
        add("Micronesia", "FM");
        add("Moldova", "MD");
        add("Monaco", "MC");
        add("Mongolia", "MN");
        add("Montserrat", "MS");
        add("Morocco", "MA");
        add("Mozambique", "MZ");
        add("Namibia", "NA");
        add("Nauru", "NR");
        add("Nepal", "NP");
        add("Netherlands", "NL");
        add("Netherlands Antilles", "AN");
        add("New Caledonia", "NC");
        add("New Zealand", "NZ");
        add("Nicaragua", "NI");
        add("Niger", "NE");
        add("Nigeria", "NG");
        add("Niue", "NU");
        add("Norfolk Island", "NF");
        add("Northern Mariana Islands", "MP");
        add("Norway", "NO");
        add("Oman", "OM");
        add("Pakistan", "PK");
        add("Palau", "PW");
        add("Palestinian Territory", "PS");
        add("Panama", "PA");
        add("Papua New Guinea", "PG");
        add("Paraguay", "PY");
        add("Peru", "PE");
        add("Philippines", "PH");
        add("Pitcairn", "PN");
        add("Poland", "PL");
        add("Portugal", "PT");
        add("Puerto Rico", "PR");
        add("Qatar", "QA");
        add("Reunion", "RE");
        add("Romania", "RO");
        add("Russian Federation", "RU");
        add("Rwanda", "RW");
        add("Saint Kitts and Nevis", "KN");
        add("Saint Lucia", "LC");
        add("Saint Vincent and the Grenadines", "VC");
        add("Samoa", "WS");
        add("San Marino", "SM");
        add("Sao Tome and Principe", "ST");
        add("Saudi Arabia", "SA");
        add("Senegal", "SN");
        add("Serbia and Montenegro", "CS");
        add("Seychelles", "SC");
        add("Sierra Leone", "SL");
        add("Singapore", "SG");
        add("Slovakia", "SK");
        add("Slovenia", "SI");
        add("Solomon Islands", "SB");
        add("Somalia", "SO");
        add("South Africa", "ZA");
        add("South Georgia and The South Sandwich Islands", "GS");
        add("South Korea", "KR");
        add("Spain", "ES");
        add("Sri Lanka", "LK");
        add("St. Helena", "SH");
        add("St. Pierre and Miquelon", "PM");
        add("Suriname", "SR");
        add("Svalbard and Jan Mayen Islands", "SJ");
        add("Swaziland", "SZ");
        add("Sweden", "SE");
        add("Switzerland", "CH");
        add("Taiwan", "TW");
        add("Tajikistan", "TJ");
        add("Tanzania", "TZ");
        add("Thailand", "TH");
        add("Togo", "TG");
        add("Tokelau", "TK");
        add("Tonga", "TO");
        add("Trinidad and Tobago", "TT");
        add("Tunisia", "TN");
        add("Turkey", "TR");
        add("Turkmenistan", "TM");
        add("Turks and Caicos Islands", "TC");
        add("Tuvalu", "TV");
        add("Uganda", "UG");
        add("Ukraine", "UA");
        add("United Arab Emirates", "AE");
        add("United Kingdom", "GB");
        add("United States", "US");
        add("United States Minor Outlying Islands", "UM");
        add("Uruguay", "UY");
        add("Uzbekistan", "UZ");
        add("Vanuatu", "VU");
        add("Vatican", "VA");
        add("Venezuela", "VE");
        add("Viet Nam", "VN");
        add("Virgin Islands (British)", "VG");
        add("Virgin Islands (U.S.)", "VI");
        add("Wallis and Futuna Islands", "WF");
        add("Western Sahara", "EH");
        add("Yemen", "YE");
        add("Zambia", "ZM");
        add("Zimbabwe", "ZW");
    }

    private static void add(String countryName, String code) {
        map.put(code, countryName);
    }

    public static String get(String code) {
        String name = map.get(code);
        if (name == null)
            return code;
        return name;
    }
}