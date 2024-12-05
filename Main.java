/********************************************
*	AUTHORS:	Joe Carita
* COLLABORATORS: 
*	LAST MODIFIED:	<date of last change>
********************************************/

/********************************************
*	<TITLE OF PROGRAM> Joe's Unoriginal Dungeon
*********************************************
*	PROGRAM DESCRIPTION: This is a brief text-based adventure game. 
*	<1-2 sentences describing overall program>
*********************************************
*	ALGORITHM:
*	<Pseudocode here>
*********************************************
*	STATIC METHODS:
* <list of static methods and which teammate made each>
*********************************************/

public class Main 
{
  /***** CONSTANT SECTION *****/
  static boolean spongePickedUp = false;
  static boolean victory = false;
  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/

    /***** INITIALIZATION SECTION *****/
    String currentChoice;
    int triesNumber = 1;
    /***** INTRO SECTION *****/

    /***** PROCESSING SECTION *****/

    /***** OUTPUT SECTION *****/
    intro();
    while(victory == false)
    {
    currentChoice = UtilityBelt.readString("\nAfter entering, you can go left or right. Which way would you want to go? ", 1,20);
    if (currentChoice.equalsIgnoreCase("Left"))
      {
        Main.spongeEncouter();
        if(spongePickedUp == true)
        {
          lakeEncounter();
        }
        else
        {
          System.out.println("\nAs you continue deeper into the dungeon, you soon approach a large lake. Suddenly, the door locks itself behind you, and water begins to pour from the walls around you, filling the room.\nYour adventure is over.\n");
          triesNumber++;
        }
      }
    else if (currentChoice.equalsIgnoreCase("Right"))
      {
        System.out.println("\nGoing to the right, a door slams shut behind you. As you search for a way to escape, you find none. Your adventure is over.\n");
        triesNumber++;
      }
    else if(currentChoice.equalsIgnoreCase("Forward"))
    {
      secretRoom();
    }
    else
      {
        System.out.println("\nThat is not a valid route, and in your indecision you fail to notice the tumbling of rocks from above you. Your adventure is over.\n");
        triesNumber++;
      }
    }
    System.out.printf("You emerged victorious in %d tries. Congratulations!", triesNumber);
  }
  /***** STATIC METHODS *****/
  public static void intro()
    {
      System.out.println("You arrive at a dungeon at the bottom of a great mountain. You've heard tales of the great riches within that none have laid claim to because of the various dangers within.");
    }

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
          System.out.println("\nYou pick up a sponge and decide to keep moving.");
        }
      else if(pickUp.equalsIgnoreCase("No"))
        {
          System.out.println("\nYou decide against it, fearing retribution from those you would be stealing a sponge from. Instead, you decide to keep moving.");
        }
      else
        {
          System.out.println("\nOut of wrath for your indecision towards their blessing, the sponge gods remove the pile from existence, damning you to a spongeless existence for the rest of your days. The only\noption now is to keep moving.");
        }
    }

  public static void lakeEncounter()
    {
      String useSponge = UtilityBelt.readString("As you press on, you come to a large lake, and come to the sudden realization you never learned to swim. Suddenly, the door locks itself behind you, and water begins to pour from the walls around you.\nYou remember the sponge you had just picked up. Do you wish to use it?", 1, 30);
      if(useSponge.equalsIgnoreCase("Yes"))
        {
          System.out.println("You retrieve the sponge, and the moment the water touches");
        }
      else if(useSponge.equalsIgnoreCase("No"))
        {

        }
      else
        {

        }
    }
}
//Keep it simple, you can build off this with loops later. For now, keep it as one path (and probably make wrong turns fatal idk.)