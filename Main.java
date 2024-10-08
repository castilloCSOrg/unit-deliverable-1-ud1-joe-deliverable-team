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
  static String heldItem;
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
  
}

