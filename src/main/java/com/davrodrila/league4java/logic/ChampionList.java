package com.davrodrila.league4java.logic;

import java.util.ArrayList;

public class ChampionList
{
    private ArrayList<Champion> championList;

    public ArrayList<Champion> getChampionList()
    {
        return championList;
    }

    public void setChampionList(ArrayList<Champion> championList)
    {
        this.championList = championList;
    }

    @Override
    public String toString()
    {
        return "ChampionList ]" +
                "champions=" + championList +
                ']';
    }
}
