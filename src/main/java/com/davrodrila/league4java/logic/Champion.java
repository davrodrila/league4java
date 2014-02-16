package com.davrodrila.league4java.logic;

public class Champion
{
    private boolean active;
    private int attackRank;
    private boolean botEnabled;
    private boolean botMmEnabled;
    private int defenseRank;
    private int difficultyRank;
    private boolean freeToPlay;
    private long id;
    private int magicRank;
    private String name;
    private boolean rankedPlayEnabled;

    public Champion(boolean active, int attackRank, boolean botEnabled, boolean botMmEnabled, int defenseRank, int difficultyRank, boolean freeToPlay, long id, int magicRank, String name, boolean rankedPlayEnabled)
    {
        this.active = active;
        this.attackRank = attackRank;
        this.botEnabled = botEnabled;
        this.botMmEnabled = botMmEnabled;
        this.defenseRank = defenseRank;
        this.difficultyRank = difficultyRank;
        this.freeToPlay = freeToPlay;
        this.id = id;
        this.magicRank = magicRank;
        this.name = name;
        this.rankedPlayEnabled = rankedPlayEnabled;
    }

    public Champion()
    {
    }

    public boolean isActive()
    {
        return active;
    }

    public int getAttackRank()
    {
        return attackRank;
    }

    public boolean isBotEnabled()
    {
        return botEnabled;
    }

    public boolean isBotMmEnabled()
    {
        return botMmEnabled;
    }

    public int getDefenseRank()
    {
        return defenseRank;
    }

    public int getDifficultyRank()
    {
        return difficultyRank;
    }

    public boolean isFreeToPlay()
    {
        return freeToPlay;
    }

    public long getId()
    {
        return id;
    }

    public int getMagicRank()
    {
        return magicRank;
    }

    public String getName()
    {
        return name;
    }

    public boolean isRankedPlayEnabled()
    {
        return rankedPlayEnabled;
    }

    public void setActive(boolean active)
    {
        this.active = active;
    }

    public void setAttackRank(int attackRank)
    {
        this.attackRank = attackRank;
    }

    public void setBotEnabled(boolean botEnabled)
    {
        this.botEnabled = botEnabled;
    }

    public void setBotMmEnabled(boolean botMmEnabled)
    {
        this.botMmEnabled = botMmEnabled;
    }

    public void setDefenseRank(int defenseRank)
    {
        this.defenseRank = defenseRank;
    }

    public void setDifficultyRank(int difficultyRank)
    {
        this.difficultyRank = difficultyRank;
    }

    public void setFreeToPlay(boolean freeToPlay)
    {
        this.freeToPlay = freeToPlay;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public void setMagicRank(int magicRank)
    {
        this.magicRank = magicRank;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setRankedPlayEnabled(boolean rankedPlayEnabled)
    {
        this.rankedPlayEnabled = rankedPlayEnabled;
    }

    @Override
    public String toString()
    {
        return "Champion [" +
                "active=" + active +
                ", attackRank=" + attackRank +
                ", botEnabled=" + botEnabled +
                ", botMmEnabled=" + botMmEnabled +
                ", defenseRank=" + defenseRank +
                ", difficultyRank=" + difficultyRank +
                ", freeToPlay=" + freeToPlay +
                ", id=" + id +
                ", magicRank=" + magicRank +
                ", name='" + name + '\'' +
                ", rankedPlayEnabled=" + rankedPlayEnabled +
                ']';
    }
}
