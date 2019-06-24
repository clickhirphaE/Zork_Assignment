import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;
public class Zork_Ass {
    public static void main(String args[]){
        Scanner cc=new Scanner(System.in);
        String enter="";
        int r=0,visited_room=0;
         boolean found=false;
        Random rr=new Random();
        do{
          switch (r) {
              case 0:
                  System.out.println("You're outside the room");
                  System.out.println(" If you want to enter to the room pls type in ENTER");
                  enter = cc.next();
                  if (enter.equalsIgnoreCase("ENTER")) {
                      r = 1;
                      visited_room++;
                  }
                  break;
              case 1:
                  System.out.println(" you're in the #1 foyer room where you want to go?");
                  System.out.println(" pls type in NORTH-> to go to the front room and EXIT->to exit the room");
                  enter = cc.next();
                  if (enter.equalsIgnoreCase("NORTH")) {
                      r = 2;
                      visited_room++;
                  } else if (enter.equalsIgnoreCase("EXIT")){
                      r=9;
                      visited_room++;
                  }
                  else
                      System.out.println("please type in s/N ");
                  break;
              case 2:
                  System.out.println("you're in front room where you want to go");
                  System.out.println("type in S to go to the foyer room, W to go library and E to go to kitchen");
                  enter=cc.next();
                  if(enter.equalsIgnoreCase("S")){
                      r=1;
                      visited_room++;
                  }
                  else if(enter.equalsIgnoreCase("W")){
                      r=3;
                      visited_room++;
                  }
                  else if(enter.equalsIgnoreCase("E")){
                      r=4;
                      visited_room++;
                  }
                  else
                  {
                      System.out.println(".......");
                  }
                  break;
              case 3:
                  System.out.println("you're in Library where u wanna go?" +
                          "Type in E to go to the front room and N to goto the dining room");
                  enter=cc.next();
                  if(enter.equals("E")){
                      r=2;
                      visited_room++;
                  }
                  else if(enter.equalsIgnoreCase("N")){
                      r=5;
                      visited_room++;
                  }
                  else{
                      System.out.println("...No direction");
                  }
                 break;
              case 4:
                  System.out.println(" you're in kitchen room, where u wanna go?" +
                          "pls type in W to go to the front room or N to go to parlor room");
                  enter=cc.next();
                  if(enter.equalsIgnoreCase("W")){
                      r=2;
                      visited_room++;
                  }else if(enter.equalsIgnoreCase("N")){
                      r=7;
                      visited_room++;
                  }
                  else{
                      System.out.println("You're in wrong direction");
                  }
                  break;
              case 5:
                  System.out.println("you're in dining room, where you wanna go?" +
                          "Type in S to go to the Library");
                  enter=cc.next();
                  if(enter.equalsIgnoreCase("S")){
                      r=3;
                      visited_room++;
                  }else{
                      System.out.println("...No direction");
                  }
                  break;
              case 6:
                  int xx=rr.nextInt(4);
                  if((xx==1)||(found=true)) {
                      found = true;
                      System.out.println("you're in vault room type in EAST to go Parlor room and " +
                              "E to go to secret room");
                      enter = cc.next();

                  if (enter.equalsIgnoreCase("E")){
                     r=8;
                      visited_room++;

                  }
                  else if(enter.equalsIgnoreCase("EAST"))
                      r=7;
                      visited_room++;
                  }
                  else{
                      System.out.println("pls type in where you want to go below");
                      System.out.println("pls TYPE in EAST to go to the parlor room room");
                      enter = cc.next();
                      if(enter.equals("EAST")){
                          r=7;
                          visited_room++;
           break;
                  }}
              case 7:
                  System.out.println("You're in parlor room,pls type in WEST to goto Vault room && SOUTH to go to kitchen");
                  enter=cc.next();
                  if(enter.equals("WEST")){
                      r=6;
                      visited_room++;
                  }else if(enter.equals("SOUTH")){
                      r=4;
                      visited_room++;
                  }else {
                      System.out.println("pls re-type WEST to get to the VAULT room and SOUTH to go to the kitchen");
                      }
                      break;
              case 8:
                  System.out.println("you're here in SECRET ROOM where you wanna go?" +
                          "Type in WEST to goto vault room");
                  enter=cc.next();
                  if(enter.equals("WEST")){
                      r=6;
                      visited_room++;
                  }
                  else{
                      System.out.println(" Pls type in WEST to go to the vault room ");
                  }
                  break;
              case 9:
                  int x=rr.nextInt(4);
                  if(x==1){
                      System.out.println(" you left the room, the game is over");
                      System.out.println("you will be followed by a ghost");
                  }
                  else{

                      System.out.println("You left the room, the game is over" +
                              "you will not be followed by a ghost");
                  }
                break;
          }

        }while(!enter.equalsIgnoreCase("EXIT"));

        System.out.println("Visited rooms are:"+visited_room);
        }

    }

