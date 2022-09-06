package no.kristiania.pgr209.poker;

public enum Rank {
    NUMBER_2, NUMBER_3, NUMBER_7, NUMBER_10, ACE;

    public String getDescription() {
        return switch(this) {
            case NUMBER_2 -> "2";
            case NUMBER_3 -> "3";
            case NUMBER_7 -> "null";
            case NUMBER_10 -> "null";
            case ACE -> "Ace";
        };
    }
}
