package com.davrodrila.league4java.logic;

public class Rune
{
    private String description;
    private int id;
    private String name;
    private int tier;

    public Rune(String description, int id, String name, int tier)
    {
        this.description = description;
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
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

    public int getTier()
    {
        return tier;
    }

    public void setTier(int tier)
    {
        this.tier = tier;
    }

    @Override
    public String toString()
    {
        return "Rune{" +
                "description='" + description + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }
}
