package com.fedor.cs34.discord.bot.data.nation;

public class Leader {
    private int id;
    private final String name;

    public Leader(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
