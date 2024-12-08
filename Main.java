/********************************************
*	AUTHORS:	Joe Carita
* COLLABORATORS: 
*	LAST MODIFIED:	<date of last change>
********************************************/

/********************************************
*	<TITLE OF PROGRAM> Joe's Unoriginal Dungeon
*********************************************
*	PROGRAM DESCRIPTION: This is a brief text-based adventure game. There are Strings for your choices to go left/right or for yes/no, an int for the number of tries needed, and a double for the math puzzle at the end.
*	<1-2 sentences describing overall program>
*********************************************
*	ALGORITHM:
*	<Pseudocode here>
*********************************************
*	STATIC METHODS:
* secretRoom(), spongeEncounter(), lakeEncounter(), and mathEncounter(), were all made by Joe Carita
*********************************************/

public class Main 
{
  /***** CONSTANT SECTION *****/
  static boolean spongePickedUp = false;
  static boolean victory = false;
  static int triesNumber = 1;
  static boolean lakeDeath = true;
  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/

    /***** INITIALIZATION SECTION *****/

    /***** INTRO SECTION *****/

    /***** PROCESSING SECTION *****/

    /***** OUTPUT SECTION *****/
    System.out.println("You arrive at a dungeon at the bottom of a great mountain. You've heard tales of the great riches within that none have laid claim to because of the various dangers within.");
    while(victory == false)
    {
    String firstChoice = UtilityBelt.readString("\nAfter entering, you can go left or right. Which way would you want to go? ", 1,20);
    if (firstChoice.equalsIgnoreCase("Left"))
      {
        Main.spongeEncouter();
        if(spongePickedUp == true)
          {
            lakeEncounter();
            if(lakeDeath == false)
              {
                mathEncounter();
              }
            else
              {
                System.out.print("");
              }
          }
        else
          {
          System.out.println("\nAs you continue deeper into the dungeon, you soon approach a large lake. Suddenly, the door locks itself behind you, and water begins to pour from the walls around you, filling the room. Your adventure is over.\n");
          triesNumber++;
          }
      }
    else if (firstChoice.equalsIgnoreCase("Right"))
      {
        System.out.println("\nGoing to the right, a door slams shut behind you. As you search for a way to escape, you find none. Your adventure is over.\n");
        triesNumber++;
      }
    else if(firstChoice.equalsIgnoreCase("Forward"))
    {
      secretRoom();
    }
    else
      {
        System.out.println("\nThat is not a valid route, and in your indecision you fail to notice the tumbling of rocks from above you. Your adventure is over.\n");
        triesNumber++;
      }
    }
    System.out.printf("\nYou emerged victorious in %d tries. Congratulations!\n", triesNumber);
  }
  /***** STATIC METHODS *****/
  public static void secretRoom()
    {
      System.out.println("\nYou find a secret room, filled to the brim with golden coins and gems! You pick up your loot and leave, successfully evading all danger!\n\n(SECRET ENDING)\n");
      victory = true;
    }

  public static void spongeEncouter()
    {
      String pickUp = UtilityBelt.readString("\nAs you keep moving forward, you find a pile of sponges along the side of the hallway. A sign on the wall states that they can absorb anything you can throw at them, which definitely\ncould be useful. Do you want to pick one up? ",1,30);
      if(pickUp.equalsIgnoreCase("Yes"))
        {
          spongePickedUp = true;
          System.out.println("\nYou pick up a sponge and decide to keep moving.\n");
        }
      else if(pickUp.equalsIgnoreCase("No"))
        {
          System.out.println("\nYou decide against it, fearing retribution from those you would be stealing a sponge from. Instead, you decide to keep moving.\n");
        }
      else
        {
          System.out.println("\nOut of wrath for your indecision towards their blessing, the sponge gods remove the pile from existence, damning you to a spongeless existence for the rest of your days. The only option now is to keep moving.\n");
        }
    }

  public static void lakeEncounter()
    {
      String useSponge = UtilityBelt.readString("As you press on, you come to a large lake, and come to the sudden realization you never learned to swim. Suddenly, the door locks itself behind you, and water begins to pour from the walls around you. You remember the sponge you had just picked up. Do you wish to use it? ", 1, 30);
      if(useSponge.equalsIgnoreCase("Yes"))
        {
          System.out.println("You retrieve the sponge, and the moment the water touches it, it vanishes, and the room is quickly free of water. You can now continue.\n");
          lakeDeath = false;
        }
      else if(useSponge.equalsIgnoreCase("No"))
        {
          System.out.println("You decide against it, but soon regret it as the water continues to flow into the room, overtaking you quickly. Your adventure is over.\n");
          triesNumber++;
        }
      else
        {
          System.out.println("Your indecision has cost you your last opportunity to act, as the water overtakes you. Your journey is over.\n");
          triesNumber++;
        }
    }
  
  public static void mathEncounter()
    {
      double mathAnswer = UtilityBelt.readDouble("You feel you are reaching the end, yet before you lies one last door. Next to it lies a paintbrush, and upon the door lies a message; '3.5 + __ = 6.' What do you want to write? ", 0.0, 100.0);
      if(3.5 + mathAnswer == 6)
        {
          System.out.println("As you finish the final stroke, the door opens to a horde of gems and gold, and you can see a way out before you. You won!");
          victory = true;
        }
      else
        {
          System.out.println("As you finish the final stroke, a pit opens below you, and you fall, never seeming to reach the end. Your adventure is over.\n");
          triesNumber++;
        }
    }
}