package com.nazarko.rateitspring.models.enums;

public enum Country {
    AFGHANISTAN("Afghanistan"), ALBANIA("Albania"), ALGERIA("Algeria"), ANDORRA("Andorra"), ANGOLA("Angola"), ARMENIA("Armenia"),
    ANTIGUA_BARBUDA("Antigua and Barbuda"), ARGENTINA("Argentina"), AUSTRALIA("Australia"), AUSTRIA("Austria"), AZERBAIJAN("Azerbaijan"),
    BAHAMAS("Bahamas"), BAHRAIN("Bahrain"), BANGLADESH("Bangladesh"), BARBADOS("Barbados"), BELGIUM("Belgium"), BELIZE("Belize"), BENIN("Benin"),
    BHUTAN("Bhutan"), BOLIVIA("Bolivia"), BOSNIA_HERZEGOVINA("Bosnia Herzegovina"), BOTSWANA("Botswana"), BRAZIL("Brazil"), BRUNEI("Brunei"),
    BULGARIA("Bulgaria"), BURKINA_FASO("Burkina Faso"), BURMA("Burma"), BURUNDI("Burundi"), CAMBODIA("Cambodia"), CAMEROON("Cameroon"),
    CANADA("Canada"), CAPE_VERDE("Cape Verde"), COMOROS("Comoros"), CENTRAL_AFRICA("Central African Republic"), CHAD("Chad"), CHILE("Chile"),
    CHINA("China"), COLOMBIA("Colombia"), CUBA("Cuba"), DEMOCRATIC_REPUBLIC_OF_THE_CONGO("Democratic Republic of the Congo"),
    REPUBLIC_OF_THE_CONGO("Republic of the Congo"), COSTA_RICA("Costa Rica"), CROATIA("Croatia"), CYPRUS("Cyprus"), CZECHIA("Czechia"),
    DENMARK("Denmark"), DJIBOUTI("Djibouti"), DOMINICA("Dominica"), DOMINICAN_REPUBLIC("Dominican Republic"), EAST_TIMOR("East Timor"),
    ECUADOR("Ecuador"), EGYPT("Egypt"), EL_SALVADOR("El Salvador"), EQUATORIAL_GUINEA("Equatorial Guinea"), ERITREA("Eritrea"),
    ESTONIA("Estonia"), ETHIOPIA("Ethiopia"), FIJI("Fiji"), FINLAND("Finland"), FRANCE("France"), GABON("Gabon"), GAZA_STRIP("Gaza Strip"),
    GAMBIA("Gambia"), GEORGIA("Georgia"), GERMANY("Germany"), GHANA("Ghana"), GREECE("Greece"), GRENADA("Grenada"), GUATEMALA("Guatemala"),
    GUINEA("Guinea"), GUINEA_BISSAU("Guinea-Bissau"), GUYANA("Guyana"), HAITI("Haiti"), HONDURAS("Honduras"), HUNGARY("Hungary"), ICELAND("Iceland"),
    INDIA("India"), INDONESIA("Indonesia"), IRAN("Iran"), IRAQ("Iraq"), IRELAND("Ireland"), ISRAEL("Israel"), ITALY("Italy"), IVORY_COAST("Ivory Coast"),
    JAMAICA("Jamaica"), JAPAN("Japan"), JORDAN("Jordan"), KAZAKHSTAN("Kazakhstan"), KENYA("Kenya"), KIRIBATI("Kiribati"), NORTH_KOREA("North Korea"),
    SOUTH_KOREA("South Korea"), KOSOVO("Kosovo"), KUWAIT("Kuwait"), KYRGYZSTAN("Kyrgyzstan"), LAOS("Laos"), LATVIA("Latvia"), LEBANON("Lebanon"),
    LESOTHO("Lesotho"), LIBERIA("Liberia"), LIBYA("Libya"), LIECHTENSTEIN("Liechtenstein"), LITHUANIA("Lithuania"), LUXEMBOURG("Luxembourg"),
    NORTH_MACEDONIA("North Macedonia"), MADAGASCAR("Madagascar"), MALAWI("Malawi"), MALAYSIA("Malaysia"), MALDIVES("Maldives"), MALI("Mali"),
    MALTA("Malta"), MARSHALL_ISLANDS("Marshall Islands"), MAURITANIA("Mauritania"), MAURITIUS("Mauritius"), MEXICO("Mexico"),
    MICRONESIA("Micronesia"), MOLDOVA("Moldova"), MONACO("Monaco"), MONGOLIA("Mongolia"), MONTENEGRO("Montenegro"), MOROCCO("Morocco"),
    MOZAMBIQUE("Mozambique"), NAMIBIA("Namibia"), NAURU("Nauru"), NEPAL("Nepal"), NETHERLANDS("Netherlands"), NEW_ZEALAND("New Zealand"),
    NICARAGUA("Nicaragua"), NIGER("Niger"), NIGERIA("Nigeria"), NORWAY("Norway"), OMAN("Oman"), PAKISTAN("Pakistan"), PERU("Peru"),
    PALAU("Palau"), PANAMA("Panama"), PAPUA_NEW_GUINEA("Papua New Guinea"), PARAGUAY("Paraguay"), PHILIPPINES("Philippines"),
    POLAND("Poland"), PORTUGAL("Portugal"), QATAR("Qatar"), ROMANIA("Romania"), RWANDA("Rwanda"), GRENADINES("Saint Vincent and the Grenadines"),
    SAMOA("Samoa"), SAN_MARINO("San Marino"), SAO_TOME_PRINCIPE("Sao Tome & Principe"), SAUDI_ARABIA("Saudi Arabia"), SENEGAL("Senegal"),
    SERBIA("Serbia"), SEYCHELLES("Seychelles"), SIERRA_LEONE("Sierra Leone"), SINGAPORE("Singapore"), SLOVAKIA("Slovakia"), SLOVENIA("Slovenia"),
    SOLOMON_ISLANDS("Solomon Islands"), SOMALIA("Somalia"), SOUTH_AFRICA("South Africa"), SPAIN("Spain"), SRI_LANKA("Sri Lanka"),
    SUDAN("Sudan"), SURINAME("Suriname"), SWAZILAND("Swaziland"), SWEDEN("Sweden"), SWITZERLAND("Switzerland"), SYRIA("Syria"), TAIWAN("Taiwan"),
    TAJIKISTAN("Tajikistan"), TANZANIA("Tanzania"), THAILAND("Thailand"), TOGO("Togo"), TONGA("Tonga"), TRINIDAD_TOBAGO("Trinidad & Tobago"),
    TUNISIA("Tunisia"), TURKEY("Turkey"), TURKMENISTAN("Turkmenistan"), TUVALU("Tuvalu"), UGANDA("Uganda"), UKRAINE("Ukraine"),
    UAE("United Arab Emirates"), UNITED_KINGDOM("United Kingdom"), USA("United States of America"), URUGUAY("Uruguay"), UZBEKISTAN("Uzbekistan"),
    VANUATU("Vanuatu"), VATICAN_CITY("Vatican City"), VENEZUELA("Venezuela"), VIETNAM("Vietnam"), YEMEN("Yemen"), ZAMBIA("Zambia"),
    ZIMBABWE("Zimbabwe");

    private final String country;

    Country(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

}
