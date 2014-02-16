package com.davrodrila.league4java.api;

import com.davrodrila.league4java.logic.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class LeagueAPI
{
    private String apiKey;
    private Region region;
    /*
    * This constants are used to create  proper URL's to use the REST API. If you need to update to  different versions,
    * changing this strings will do the job.
    */
    private static final String CON_URL = "https://prod.api.pvp.net/api/lol/";
    private static final String API_BASE_URL = "?api_key=";
    private static final String SUMMONER_VERSION = "v1.3/summoner/";
    private static final String SUMMONER_BYNAME="by-name/";
    private static final String SUMMONER_NAME="/name";
    private static final String SUMMONER_RUNES="/runes";
    private static final String SUMMONER_MASTERIES="/masteries";
    /**
     * LeagueAPI is the object you will use to make all the queries against the REST API.
     * @param apiKey Your api key for queries, please note that the ?api_key string is automatically appended, so pass only the key.
     * @param region Select default region, all queries will use this region. If you wish to change the region for a specific query, you should use {@link #setRegion(Region)}.
     */
    public LeagueAPI(String apiKey,Region region)
    {
        this.apiKey = apiKey;
        this.region = region;
    }


    private String getResponse(String uri)
    {
        try{
            URL url = new URL(LeagueAPI.CON_URL + region + uri + API_BASE_URL + apiKey);
            InputStream is = url.openStream();
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            int retVal;
            while ((retVal = is.read()) != -1)
            {
                os.write(retVal);
            }
            final String response = os.toString();
            return response;
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return "";
    }
    public String getApiKey()
    {
        return apiKey;
    }

    public void setApiKey(String apiKey)
    {
        this.apiKey = apiKey;
    }

    public Region getRegion()
    {
        return region;
    }

    public void setRegion(Region region)
    {
        this.region = region;
    }

    /**
     * Retrieves a list of summoners given a specific name
     *
     * @param name Name of the summoner to search for
     * @return A collection of all the Summoners that matches the provided name.
     */
    public Collection<Summoner> getSummonersByName(String name)
    {
        String response = getResponse(LeagueAPI.SUMMONER_VERSION+LeagueAPI.SUMMONER_BYNAME+name);
        Map<String,Summoner> result = new Gson().fromJson(response, new TypeToken<LinkedHashMap<String, Summoner>>()
        {
        }.getType());
        return result.values();
    }

    /**
     * Returns a list of summoners given a specific id
     *
     * @param id ID of the summoner to search for
     * @return A collection of all the Summoners that matches the provided ID
     */
    public Collection<Summoner> getSummonerById(long id)
    {
        String response = getResponse(LeagueAPI.SUMMONER_VERSION+id);
        Map<String,Summoner> result = new Gson().fromJson(response, new TypeToken<LinkedHashMap<String, Summoner>>()
        {
        }.getType());
        return result.values();
    }

    /**
     * Get a list of summoner names that matches the given ID
     * @param id ID of the Summoner to search for
     * @return a collection of all the summoner names that match this id
     */
    public Collection<String> getSummonerNamesById(long id)
    {
        String response = getResponse(LeagueAPI.SUMMONER_VERSION+id+LeagueAPI.SUMMONER_NAME);
        Map<String,String> result = new Gson().fromJson(response,new TypeToken<LinkedHashMap<String,String>>(){}.getType());
        return result.values();
    }

    /**
     * Retrieve the list of runepages associated to a summoner ID
     * @param id ID of the summoner we want to retrieve runes from
     * @return The list of RunePages the Summoner haves.
     */
    public Collection<RunePage> getSummonerRunes(long id)
    {
        String response = getResponse(LeagueAPI.SUMMONER_VERSION+id+LeagueAPI.SUMMONER_RUNES);
        Map<String,RunesList> result = new Gson().fromJson(response,new TypeToken<LinkedHashMap<String,RunesList>>(){}.getType());
        return result.values().iterator().next().getPages();
    }

    /**
     * Retrieves all the mastery pages from a summoner given an id.
     * @param id ID of the summoner we want to get the mastery pages
     * @return A list of Mastery Pages that belong to the given summoner
     */
    public Collection<MasteryPage> getSummonerMasteries(long id)
    {
        String response = getResponse(LeagueAPI.SUMMONER_VERSION+id+LeagueAPI.SUMMONER_MASTERIES);
        Map<String,MasteryList> result = new Gson().fromJson(response,new TypeToken<LinkedHashMap<String,MasteryList>>(){}.getType());
        return result.values().iterator().next().getPages();
    }
}

