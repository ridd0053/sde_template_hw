package com.hz;

public class Main {

    // READ THE INSTRUCTIONS IN THIS METHOD, PLEASE!!!
    public static void main(String[] args) {



        // INSTRUCTIONS, READ CAREFULLY !!!!!!!!!!!!!!!!!!!!!!!!!!
        // For a normal postcard use: true, false
        // For a graduation card use: false, true


        // ONLY SET ONE OF THE BOOLEAN PARAMETERS TO TRUE!!!!
        // DON'T FORGET THAT!

        // WE NEED TO MAKE THIS MESSY CODE BETTER IMHO, MAYBE ONE OF THE SKILLED
        // HBO-ICT STUDENTS CAN HELP US OUT.

        // IF WE HAVE TO ADD AN OTHER TYPE OF CARD...
        // ...I QUIT THIS JOB.
//        PostCardCopy card = new PostCardCopy(printer, true, false);
//        card.print();

        //
        CardTemplate graduationCard = new isHighSchoolGraduationCard();
        CardTemplate postCard = new PostCard();
        CardTemplate xmasCard = new XmasCard();

        // print cards
        graduationCard.printCard();
        postCard.printCard();
        xmasCard.printCard();

    }
}
