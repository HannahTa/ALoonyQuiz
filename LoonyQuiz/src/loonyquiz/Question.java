/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loonyquiz;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Hannah
 */
public class Question
{
    public static void topicSelect()
    {
        Random rn = new Random();
        int rand = rn.nextInt(4);// Will return random numbers between 0 and 3
        switch(rand)
        {
            case 0:
            Global.topic1 = "Music";
            Global.topic2 = "Music";
            break;

            case 1:
            Global.topic1 = "Sport";
            Global.topic2 = "Sport";
            break;

            case 2:
            Global.topic1 = "History";
            Global.topic2 = "History";
            break;

            case 3:
            Global.topic1 = "Geography";
            Global.topic2 = "Geography";
            break;
        }

        while(Global.topic1.equals(Global.topic2))
        {
            rand = rn.nextInt(4);// Will return random numbers between 0 and 3
            switch(rand)
            {
                case 0:
                Global.topic2 = "Music";
                break;

                case 1:
                Global.topic2 = "Sport";
                break;

                case 2:
                Global.topic2 = "History";
                break;

                case 3:
                Global.topic2 = "Geography";
                break;
            }
        }
    }
    
    public static void questions(String topic)
    {
        Random rn = new Random();
        int rand = rn.nextInt(8);// Will return random numbers between 0 and 7
        
        switch(topic)
        {
            case "Music":
            music(rand);
            break;
			
            case "Sport":
            sport(rand);
            break;
			
            case "History":
            history(rand);
            break;
			
            case "Geography":
            geography(rand);
            break;
        }
    }

    public static void music(int num)
    {
        ArrayList<String> questions = new ArrayList<>();
        questions.add("Which Michael Jackson single sold over 6 million physical copies worldwide?");
	questions.add("What is the best selling single of 2012?");
	questions.add("Which of these is a Maroon 5 song?");
        questions.add("Which band released a song for the League of Legends LCS?");
        questions.add("Which of these is a female song artist?");
        questions.add("Who is the lead singer of Paramore?");
        questions.add("What Scissor Sisters song was featured in a Doctor Who Christmas episode?");
        questions.add("Which of these was sung by a cat and a donkey?");
        
        ArrayList<Integer> answers = new ArrayList<>();
        answers.add(3);
	answers.add(1);
	answers.add(2);
        answers.add(1);
        answers.add(4);
        answers.add(3);
        answers.add(2);
        answers.add(1);

        ArrayList<String> as = new ArrayList<>();
        as.add("Thriller");
	as.add("Somebody That I Used To Know");
	as.add("Feel The Love");
        as.add("Imagine Dragons");
        as.add("Green");
        as.add("Adam Levine");
        as.add("Take Your Mama Out");
        as.add("Livin' La Vida Loca");

        ArrayList<String> bs = new ArrayList<>();
        bs.add("Beat it");
	bs.add("Call Me Maybe");
	bs.add("Sugar");
        bs.add("Imagine Butterflies");
        bs.add("Yellow");
        bs.add("Mark Owen");
        bs.add("I Can't Decide");
        bs.add("I Need A Hero");

        ArrayList<String> cs = new ArrayList<>();
        cs.add("Billie Jean");
	cs.add("We Are Young");
	cs.add("We Are Young");
        cs.add("Imagine Rainbows");
        cs.add("Red");
        cs.add("Hayley Williams");
        cs.add("I Don't Feel Like Dancing");
        cs.add("Funkey Town");

        ArrayList<String> ds = new ArrayList<>();
        ds.add("Say Say Say");
	ds.add("Titanium");
	ds.add("Candy");
        ds.add("Imagination");
        ds.add("Pink");
        ds.add("Ana Matronic");
        ds.add("Night Life");
        ds.add("Changes");

        Global.question = questions.get(num);
        Global.answer = answers.get(num);
        Global.a = as.get(num);
        Global.b = bs.get(num);
        Global.c = cs.get(num);
        Global.d = ds.get(num);
    }
    
    public static void sport(int num)
    {
        ArrayList<String> questions = new ArrayList<>();
        questions.add("Which European team won the FIFA 1966 world cup?");
        questions.add("What is the name of Brighton's home stadium?");
        questions.add("In golf, what is a birdie worth?");
        questions.add("Which famous footballer now advertises walkers crisps?");
        

        ArrayList<Integer> answers = new ArrayList<>();
        answers.add(2);
        answers.add(3);
        answers.add(1);
        answers.add(3);

        ArrayList<String> as = new ArrayList<>();
        as.add("Germany");
        as.add("Wembley Stadium");
        as.add("1-under par");
        as.add("Michael Owen");

        ArrayList<String> bs = new ArrayList<>();
        bs.add("England");
        bs.add("Seagull Stadium");
        bs.add("1-over par");
        bs.add("David Beckham");

        ArrayList<String> cs = new ArrayList<>();
        cs.add("Spain");
        cs.add("Amex Stadium");
        cs.add("2-under par");
        cs.add("Gary Lineker");

        ArrayList<String> ds = new ArrayList<>();
        ds.add("Italy");
        ds.add("Square Stadium");
        ds.add("2-over par");
        ds.add("Cristiano Ronaldo");

        Global.question = questions.get(num);
        Global.answer = answers.get(num);
        Global.a = as.get(num);
        Global.b = bs.get(num);
        Global.c = cs.get(num);
        Global.d = ds.get(num);
    }
    
    public static void history(int num)
    {
        ArrayList<String> questions = new ArrayList<>();
        questions.add("What was the name of the famous battle in 1066?");
        questions.add("How many wives did Henry VIII have?");
        questions.add("What year was the Great Fire of London?");
        questions.add("What year did World War 2 begin?");
        questions.add("When was the Great Wall of China built?");
        questions.add("What year was America discovered?");
        questions.add("Who was the ringleader of the Gunpowder Plot of 1605?");
        questions.add("Who was the shortest-reigning English monarch?");

        ArrayList<Integer> answers = new ArrayList<>();
        answers.add(4);
        answers.add(3);
        answers.add(3);
        answers.add(3);
        answers.add(1);
        answers.add(2);
        answers.add(3);
        answers.add(4);

        ArrayList<String> as = new ArrayList<>();
        as.add("The Battle of France");
        as.add("Four");
        as.add("1664");
        as.add("1938");
        as.add("221 BC");
        as.add("1490");
        as.add("Robert Smith");
        as.add("William the Conqueror");

        ArrayList<String> bs = new ArrayList<>();
        bs.add("The Battle of Sweden");
        bs.add("Five");
        bs.add("1564");
        bs.add("1941");
        bs.add("121 BC");
        bs.add("1492");
        bs.add("Sir Reginald Everett");
        bs.add("Alexander III");
                

        ArrayList<String> cs = new ArrayList<>();
        cs.add("The Battle of Ikea");
        cs.add("Six");
        cs.add("1666");
        cs.add("1939");
        cs.add("121 AD");
        cs.add("1494");
        cs.add("Guy Fawkes");
        cs.add("George I");

        ArrayList<String> ds = new ArrayList<>();
        ds.add("The Battle of Hastings");
        ds.add("Seven");
        ds.add("1566");
        ds.add("1942");
        ds.add("221 AD");
        ds.add("1496");
        ds.add("None of the Above");
        ds.add("Lady Jane Grey");

        Global.question = questions.get(num);
        Global.answer = answers.get(num);
        Global.a = as.get(num);
        Global.b = bs.get(num);
        Global.c = cs.get(num);
        Global.d = ds.get(num);
    }
    
    public static void geography(int num)
    {
        ArrayList<String> questions = new ArrayList<>();
        questions.add("What is the capital of Poland?");
        questions.add("What is the capital of Australia?");
        questions.add("Which of these is not a south American country?");
        questions.add("What is the smallest country in the world?");
        questions.add("What is capital of China?");
        questions.add("Which of these countries is not part of Europe");
        questions.add("What is the largest country in the world?");
        questions.add("Which of these is the worlds largest volcano?");
        
        ArrayList<Integer> answers = new ArrayList<>();
        answers.add(2);
        answers.add(3);
        answers.add(1);
        answers.add(3);
        answers.add(1);
        answers.add(3);
        answers.add(2);
        answers.add(4);

        ArrayList<String> as = new ArrayList<>();
        as.add("Paris");
        as.add("Sydney");
        as.add("Portugal");
        as.add("Iceland");
        as.add("Beijing");
        as.add("Croatia");
        as.add("Antartica");
        as.add("Tamu Massif");

        ArrayList<String> bs = new ArrayList<>();
        bs.add("Warsaw");
        bs.add("Melbourne");
        bs.add("Argentina");
        bs.add("Ireland");
        bs.add("Hong Kong");
        bs.add("Albania");
        bs.add("Russia");
        bs.add("Ichinsky");

        ArrayList<String> cs = new ArrayList<>();
        cs.add("Cairo");
        cs.add("Canberra");
        cs.add("Chile");
        cs.add("The Vatican");
        cs.add("Chengdu");
        cs.add("Tunisia");
        cs.add("Canada");
        cs.add("Kilimanjaro");

        ArrayList<String> ds = new ArrayList<>();
        ds.add("Bern");
        ds.add("Brisbane");
        ds.add("Brazil");
        ds.add("Switzerland");
        ds.add("Shanghai");
        ds.add("Malta");
        ds.add("China");
        ds.add("Mauna Loa");

        Global.question = questions.get(num);
        Global.answer = answers.get(num);
        Global.a = as.get(num);
        Global.b = bs.get(num);
        Global.c = cs.get(num);
        Global.d = ds.get(num);
    }
}
