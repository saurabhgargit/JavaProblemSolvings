package msq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FootballTeam {

    /*
    * arcesium interview problem
    * */

    public static void main(String[] args) {

        List<String> l1 = Arrays.asList("Boateng","6.1","22","24","45");
        List<String> l2 = Arrays.asList("Kaka","6","22","1","1");
        List<String> l3 = Arrays.asList("Ronaldo","5.8","21","120","0");
        List<String> l4 = Arrays.asList("Suarez","5.9","20","100","1");

        List<List<String>> list = new ArrayList<>();
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);

        List<List<String>> finalList = getSelectionStatus(list);

        for(int i=0; i<finalList.size();i++){
            for(int j =0; j<finalList.get(i).size();j++){
                System.out.print(finalList.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }

    public static List<List<String>> getSelectionStatus(List<List<String>> applications){

        List<List<String>> selectionList = new ArrayList<List<String>>();



        for(int i=0; i<applications.size();i++){

           for(int j = 0; j<applications.get(i).size();j++){

               if((Float.valueOf(applications.get(i).get(1))>= 5.8) && (Integer.valueOf(applications.get(i).get(2))<= 23) ){

                   if(Integer.valueOf(applications.get(i).get(3))>= 50){
                        List<String>players =  new ArrayList<String>();
                        players.add(applications.get(i).get(0));
                        players.add("SELECT");
                        players.add("STRIKER");
                        selectionList.add(players);
                        break;

                   }
                   else if(Integer.valueOf(applications.get(i).get(4))>= 30){
                       List<String>players =  new ArrayList<String>();
                        players.add(applications.get(i).get(0));
                        players.add("SELECT");
                         players.add("DEFENDER");
                         selectionList.add(players);
                         break;

                   }
                   else{
                       List<String>players =  new ArrayList<String>();
                       players.add(applications.get(i).get(0));
                       players.add("REJECT");
                       players.add("NA");
                       selectionList.add(players);
                       break;
                   }

               }
               else{
                       List<String>players =  new ArrayList<String>();
                       players.add(applications.get(i).get(0));
                       players.add("REJECT");
                       players.add("NA");
                       selectionList.add(players);
                       break;
                   }
           }

        }
        return  selectionList;
    }

}
