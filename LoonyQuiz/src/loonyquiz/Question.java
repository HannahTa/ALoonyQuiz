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
    public static void questions(String topic)
    {
        Random rn = new Random();
        int rand = rn.nextInt(3);// Will return random numbers between 0 and 3
        
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

        ArrayList<Integer> answers = new ArrayList<>();
        answers.add(3);
		answers.add(1);
		answers.add(2);

        ArrayList<String> as = new ArrayList<>();
        as.add("Thriller");
		as.add("Somebody That I Used To Know");
		as.add("Feel The Love");

        ArrayList<String> bs = new ArrayList<>();
        bs.add("Beat it");
		bs.add("Call Me Maybe");
		bs.add("Sugar");

        ArrayList<String> cs = new ArrayList<>();
        cs.add("Billie Jean");
		cs.add("We Are Young");
		cs.add("We Are Young");

        ArrayList<String> ds = new ArrayList<>();
        ds.add("Say Say Say");
		ds.add("Titanium");
		ds.add("Candy");

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

        ArrayList<Integer> answers = new ArrayList<>();
        answers.add(2);
		answers.add(3);
		answers.add(1);

        ArrayList<String> as = new ArrayList<>();
        as.add("Germany");
		as.add("Wembley Stadium");
		as.add("1-under par");

        ArrayList<String> bs = new ArrayList<>();
        bs.add("England");
		bs.add("Seagull Stadium");
		bs.add("1-over par");

        ArrayList<String> cs = new ArrayList<>();
        cs.add("Spain");
		cs.add("Amex Stadium");
		cs.add("2-under par");

        ArrayList<String> ds = new ArrayList<>();
        ds.add("Italy");
		ds.add("Square Stadium");
		ds.add("2-over par");

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

        ArrayList<Integer> answers = new ArrayList<>();
        answers.add(4);
		answers.add(3);
		answers.add(3);

        ArrayList<String> as = new ArrayList<>();
        as.add("The Battle of France");
		as.add("Four");
		as.add("1664");

        ArrayList<String> bs = new ArrayList<>();
        bs.add("The Battle of Sweden");
		bs.add("Five");
		bs.add("1564");

        ArrayList<String> cs = new ArrayList<>();
        cs.add("The Battle of Ikea");
		cs.add("Six");
		cs.add("1666");

        ArrayList<String> ds = new ArrayList<>();
        ds.add("The Battle of Hastings");
		ds.add("Seven");
		ds.add("1566");

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

        ArrayList<Integer> answers = new ArrayList<>();
        answers.add(2);
        answers.add(3);
		answers.add(1);
		answers.add(3);

        ArrayList<String> as = new ArrayList<>();
        as.add("Paris");
        as.add("Sydney");
		as.add("Portugal");
		as.add("Iceland");

        ArrayList<String> bs = new ArrayList<>();
        bs.add("Warsaw");
        bs.add("Melbourne");
		bs.add("Argentina");
		bs.add("Ireland");

        ArrayList<String> cs = new ArrayList<>();
        cs.add("Cairo");
        cs.add("Canberra");
		cs.add("Chile");
		cs.add("The Vatican");

        ArrayList<String> ds = new ArrayList<>();
        ds.add("Bern");
        ds.add("Brisbane");
		ds.add("Brazil");
		ds.add("Switzerland");

        Global.question = questions.get(num);
        Global.answer = answers.get(num);
        Global.a = as.get(num);
        Global.b = bs.get(num);
        Global.c = cs.get(num);
        Global.d = ds.get(num);
    }
}
