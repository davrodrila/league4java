package com.davrodrila.league4java.api;

public enum Region
{
    EUW("euw/"),
    NA("na/"),
    EUNE("eune/"),
    OCE("oce/"),
    BR("br/"),
    RU("ru/"),
    TR("tr/"),
    LAS("las/"),
    LAN("lan/"),
    KR("kr/");
    private final String text;
    private Region(final String text)
    {
        this.text = text;
    }
    @Override
    public String toString()
    {
        return text;
    }
}
