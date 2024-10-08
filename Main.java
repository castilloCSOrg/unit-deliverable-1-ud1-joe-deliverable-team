/********************************************
*	AUTHORS:	Joe Carita
* COLLABORATORS: 
*	LAST MODIFIED:	<date of last change>
********************************************/

/********************************************
*	<TITLE OF PROGRAM> Joe's Magical Dungeon
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
  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/

    /***** INITIALIZATION SECTION *****/
    String currentChoice;
    /***** INTRO SECTION *****/

    /***** PROCESSING SECTION *****/

    /***** OUTPUT SECTION *****/
    currentChoice = UtilityBelt.readString("You arrive at a dungeon at the bottom of a great mountain. You've heard tales of the great riches within that none have laid claim to because they were lazy.\nAfter entering, you can go left or right. Which way would you want to go? ", 1,20);
    if (currentChoice.equalsIgnoreCase("Left"))
      {
        UtilityBelt.readString("bruh",1,30);
      }
    else if (currentChoice.equalsIgnoreCase("Right"))
      {
        System.out.println("Going to the right, you run into a massive pool of acid.");
      }
    else
      {
        System.out.println("That is not a valid route, and in your indecision you fail to notice the tumbling of rocks from above you. Your adventure is over.");
      }
  }
  /***** STATIC METHODS *****/
  public static void firstLeftRoom()
    {
      String pickUp;
      if (spongePickedUp = true)
        {
          System.out.println("You find a room full of sponges, yet slightly less than the last time you were here. You suspect it is your fault, and that the Sponge Gods\nwill not be happy if you take another now. You return to the fork in the road");
        }
      else
        {
          pickUp = UtilityBelt.readString("You find a room full of sponges. A sign on the wall states that they can absorb anything you can throw at them, which definitely could be useful. Do you want to pick one up?",1,30);
          if(pickUp.equalsIgnoreCase("Yes"))
            {
              System.out.println("You pick up a sponge and return to the fork in the road.");
            }
          else if(pickUp.equalsIgnoreCase("No"))
            {
              System.out.println("You decide against it, fearing a spongey trap. Instead, you decide to keep moving.");
            }
      }
    }

}

//Keep it simple, you can build off this with loops later. For now, keep it as one path (and probably make wrong turns fatal idk.)