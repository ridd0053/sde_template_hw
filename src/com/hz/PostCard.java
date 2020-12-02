package com.hz;

public class PostCard extends CardTemplate {

    @Override
    public String printHeader() {
        return "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
    }

    @Override
    public String printText() {
        return "Greetings from the netherlands!";
    }

    @Override
    public String printImage() {
        return "            Art by Hayley Jane Wakenshaw\n" +
                "\n" +
                "             /)  (\\\n" +
                "        .-._((,~~.))_.-,\n" +
                "         `=.   99   ,='\n" +
                "           / ,o~~o. \\\n" +
                "          { { .__. } }\n" +
                "           ) `~~~' (\n" +
                "          /`-._  _\\.-\\\n" +
                "         /         )  \\\n" +
                "       ,-X        #   X-.\n" +
                "hjw   /   \\          /   \\\n" +
                "     (     )| |  | |(     )\n" +
                "      \\   / | |  | | \\   /\n" +
                "       \\_(.-( )--( )-.)_/\n" +
                "       /_,\\ ) /  \\ ( /._\\\n" +
                "           /_,\\  /._\\";
    }

    @Override
    public String printFooter() {
        return "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
    }
}
