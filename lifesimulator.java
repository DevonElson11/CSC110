/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author devonelson
 */
public static void main(String[] args) {​
        // TODO code application logic here​
                Scanner outcome = new Scanner(System.in);​
                String job , marry, children, rules, contribute, save;​
                String actualJob, spouse, actualChildren, followRules,choice, money;​
                ​
                double businessChance =0.30 , engineerChance = 0.05 , artistChance = 0.10 , helpingProfessionChance = 0.30;​
                ​
                ​
        //UserInput​
                ​
        System.out.println("What job do you wish to have, business man, artist, engineer, or helping profession?");​
        job = outcome.nextLine();​
        System.out.println("You wish to have a " + job + " job");​
        ​
        System.out.println("Do you wish to marry?");​
        marry = outcome.nextLine();​
        System.out.println("You wish to " + marry + " marry.");​
        ​
        System.out.println("Do you wish to have children");​
        children = outcome.nextLine();​
        System.out.println("You do " + children + " children.");​
        ​
        System.out.println("Do you wish to wish to follow the rules or break them?");​
        rules = outcome.nextLine();​
        System.out.println("You will " + rules + " the rules.");​
        ​
        System.out.println("Do you wish to meaningfully contribute to society?");​
        contribute = outcome.nextLine();​
        System.out.println("You will  " + contribute + " contibute to society.");​
        ​
        System.out.println("Do yo wish to save money or spend lavishly?");​
        save = outcome.nextLine();​
        System.out.println("You will " + save + " your money.");​
       // String outcomeAnswer = outcome.nextLine();​
        ​
        ​
        String actaulJob = "";​
        String Actualmoney = null;​
        ​
        boolean hasChildren;​
        int numOfChildren = 0;​
        boolean wentToJail;​
        ​
        String child1n , child2n , child3n , child4n , child5n , child6n , child7n;​
        String child1g , child2g , child3g , child4g , child5g , child6g , child7g;​
        ​
        ​
        //Children names​
        child1n ="Devon";​
        child2n = "Dev";​
        child3n = "Inognito";​
        child4n = "Rasheed";​
        child5n = "Brooklyn";​
        child6n = "Halle";​
        child7n = "Megan";​
        ​
        //Children Gender​
        child1g = "male";​
        child2g = "male";​
        child3g = "female";​
        child4g = "female";​
        child5g = "male";​
        child6g = "female";​
        child7g = "female";​
        ​
        double ChildProb = Math.random();​
        ​
        ​
​
if(childProb <= 0.30){​
​
 hasChildren = false;​
​
} else {​
​
 hasChildren = true;​
​
 if(childProb > 0.30 && childProb <= 0.40){​
​
  numberOfChildren = 1;​
​
 } else if (childProb > 0.40 && childProb <= 0.50){​
​
  numberOfChildren = 2;​
​
 } else if (childProb > 0.50 && childProb <= 0.60){​
​
  numberOfChildren = 3;​
​
 } else if (childProb > 0.60 && childProb <= 0.70){​
​
  numberOfChildren = 4;​
​
 } else if (childProb > 0.70 && childProb <= 0.80){​
​
  numberOfChildren = 5;​
​
 } else if (childProb > 0.80 && childProb <= 0.90){​
​
  numberOfChildren = 6;​
​
 } else if (childProb > 0.9 && childProb <= 1){​
​
  numberOfChildren = 7;​
​
 }​
​
}​
        ​
        ​
        ​
             final double occupationProbability = Math.random();​
​
        ​
​
        if (occupationProbability <= 0.30){​
​
            actualJob = BUSINESS_MAN;​
​
        } else if (occupationProbability > 0.30 && occupationProbability <= 0.60){​
​
            actualJob = HELPING_PROFESSION;​
​
        } else if (occupationProbability > 0.60 && occupationProbability <= 0.65){​
​
            actualJob = ENGINEER;​
​
        } else if (occupationProbability > 0.65 && occupationProbability <= 0.75){​
​
            actualJob = ARTIST;​
​
        }​
​
        ​
​
        switch(actualJob){​
​
            case BUSINESS_MAN:​
​
                if(Math.random() <= 0.70){​
​
                    actualWealth = "rich";​
​
                } else {​
​
                    actualWealth = "middle class";​
​
                }​
​
                break;​
​
            case ARTIST:​
​
                if(Math.random() <= 0.10) {​
​
                    actualWealth = "rich";​
​
                } else{​
​
                    actualWealth = "poor";​
​
                }​
​
                break;​
​
            case ENGINEER:​
​
                actualWealth = "rich";​
​
                break;​
​
            case HELPING_PROFESSION:​
​
                actualWealth = "middle class";​
​
                break;​
​
        }​
​
        ​
​
        if(isRuleBreaker.equals("yes")){​
​
            if(Math.random() <= 0.30){​
​
                hasGoneToJail = true;​
​
            } else{​
​
                actualWealth = "rich";​
​
            }​
​
        }​
​
       ​
​
             String lifeParagraph = "";​
​
        lifeParagraph += name;​
​
        lifeParagraph += " was an interesting person.";​
​
        ​
​
        if(wantsToMarry.equals("yes")){​
​
            lifeParagraph += (name + " wants to marry.");​
​
        }​
​
        ​
​
        lifeParagraph += (name + " became a " + actualJob + "They were a " + actualWealth + " person!");​
​
        ​
​
if(hasChildren){​
​
 //state they have children​
​
 lifeParagraph += "They had " + numberOfChildren + " children!";​
​
 if(wantsChildren.equals("yes")){​
​
  //they are happy the had children​
​
  lifeParagraph += "They are soooo happy!! :)";​
​
 } else{​
​
  //the children really stress them out​
​
  lifeParagraph += "The children really stress them out!";​
​
 }​
​
 //list children​
​
 ​
​
 if(numberOfChildren >= 1){​
​
  lifeParagraph += "Their 1st child was named " + child1n + ". ";​
​
  lifeParagraph += "They were " + child1g + ". ";​
​
 }​
​
​
​
 if(numberOfChildren >= 2){​
​
  lifeParagraph += "Their 2nd child was named " + child2n + ". ";​
​
  lifeParagraph += "They were " + child2g + ". ";​
​
 }​
​
 if(numberOfChildren >= 3){​
​
  lifeParagraph += "Their 3rd child was named " + child3n + ". ";​
​
  lifeParagraph += "They were " + child3g + ". ";​
​
 }​
​
 if(numberOfChildren >= 4){​
​
  lifeParagraph += "Their 4th child was named " + child4n + ". ";​
​
  lifeParagraph += "They were " + child4g + ". ";​
​
 }​
​
 if(numberOfChildren >= 5){​
​
  lifeParagraph += "Their 5th child was named " + child5n + ". ";​
​
  lifeParagraph += "They were " + child5g + ". ";​
​
 }​
​
 if(numberOfChildren >= 6){​
​
  lifeParagraph += "Their 6th child was named " + child6n + ". ";​
​
  lifeParagraph += "They were " + child6g + ". ";​
​
 }​
​
 if(numberOfChildren >= 7){​
​
  lifeParagraph += "Their 7th child was named " + child7n + ". ";​
​
  lifeParagraph += "They were " + child7g + ". ";​
​
 }​
​
​
​
} else {​
​
 if(wantsChildren.equals("yes")){​
​
  //they cried every night because they had no progreny ​
​
  lifeParagraph += "They cried every night because they had no offspring";​
​
 } else{​
​
  //they consider themselves the luckiest person in the world​
​
  lifeParagraph += "They lucked out by not getting burdened with children.";​
​
 }​
​
 ​
​
}​
​
        ​
​
        System.out.println(lifeParagraph);​
        ​
        ​
        ​
        
