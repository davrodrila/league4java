package com.davrodrila.league4java.logic;

public class Summoner
{
      private long id;
      private String name;
      private int profileIconId;
      private long revisionDate;
      private long summonerLevel;

    public Summoner(long id, String name, int profileIconId, long revisionDate, long summonerLevel)
    {
        this.id = id;
        this.name = name;
        this.profileIconId = profileIconId;
        this.revisionDate = revisionDate;
        this.summonerLevel = summonerLevel;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getProfileIconId()
    {
        return profileIconId;
    }

    public void setProfileIconId(int profileIconId)
    {
        this.profileIconId = profileIconId;
    }

    public long getRevisionDate()
    {
        return revisionDate;
    }

    public void setRevisionDate(long revisionDate)
    {
        this.revisionDate = revisionDate;
    }

    public long getSummonerLevel()
    {
        return summonerLevel;
    }

    public void setSummonerLevel(long summonerLevel)
    {
        this.summonerLevel = summonerLevel;
    }

    @Override
    public String toString()
    {
        return "Summoner [" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", profileIconId=" + profileIconId +
                ", revisionDate=" + revisionDate +
                ", summonerLevel=" + summonerLevel +
                ']';
    }
}
