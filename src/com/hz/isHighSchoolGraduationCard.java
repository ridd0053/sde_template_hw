package com.hz;

public class isHighSchoolGraduationCard extends CardTemplate {

    @Override
    public String printHeader() {
        return "--@--#--&----------------------&--#--@--";
    }

    @Override
    public String printText() {
        return "This calls for celebrating! Congratulations!";

    }

    @Override
    public String printImage() {
        return "     ,_\n" +
                "| `\"\"---..._____\n" +
                "'-...______    _````\"\"\"\"\"\"\"'`|\n" +
                "       \\   ```` ``\"---...__  |\n" +
                "       |`              |   ``!\n" +
                "       |               |     A\n" +
                "       |               /\\   /#\\\n" +
                "       /`--..______..-'  |  ###\n" +
                "      |   /  `\\    /`--. |  ###\n" +
                "     _|  |  .-;`-./;-.  ||  ###\n" +
                "    / \\  \\ /\\_|    |_/\\ //\\ ##'\n" +
                "    |  `-' \\__/ _  \\__/ |  |`#\n" +
                "   \\_,                 /_/\n" +
                "       `\\              /\n" +
                "         '.  '.__.'  .'\n" +
                " jgs      `-,____,-'\n" +
                "           /\"\"\"I\"\"\\\n" +
                "           /`---'--'\\";

    }

    @Override
    public String printFooter() {
        return "--@--#--&----------------------&--#--@--";

    }
}
